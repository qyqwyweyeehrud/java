package k_io;

import java.awt.Rectangle;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

//언제들어올지 모르는데이터를 항상 수신대기하고있는 스레드
public class ClientThread extends Thread{
	ClientFrame frame;
	Socket socket;
	
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public ClientThread(ClientFrame frame,Socket socket) {
		this.frame = frame;
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			frame.login();
			
			while(true) {
				ChattData cd = (ChattData)ois.readObject();
				String html ="";
				switch(cd.getCommand()) {
				case ChattData.WHISPER :
				case ChattData.MESSAGE :
					if(cd.getmId().equals(frame.getTmId().getText())) {
						html = "<div style = 'width:90px;height:20px; border:1px solid #ffffff ; padding :3px;margin-left:100px;" + "background-color:#91A8D0;"+"color: #ffffff;'>" + cd.toString() + "</div>";
					}else {
						html = "<div style = 'width:90px;height:20px; border:1px solid #ffffff ; padding :3px;" + "background-color:#FFB6C1;"+"color: #ffffff;'>" + cd.toString() + "</div>";
						
					}
					frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);
					break;
				
				case ChattData.LOGIN :
					for(int i = 0;i<cd.getUsers().size();i++) {
						String mId = cd.getUsers().get(i);
						frame.model.addElement(mId);
						//목록이 갱신되지 않는 경우
						//frame.getList().updateUI();
						frame.getList().ensureIndexIsVisible(frame.model.getSize());
					}
					break;
					
				case ChattData.LOGOUT :
					frame.model.removeElement(cd.getmId());
					//frame.getList().updateUI();
					frame.getList().ensureIndexIsVisible(frame.model.getSize());
					break;
				
				case ChattData.GETOUT :
					//서버의 중지 or 특정유저의 강퇴
					if(cd.getUsers()==null) {//서버의중지
						frame.model.clear();
						throw new Exception();//캐치문장으로	
					}else {//강퇴
						for(String mId : cd.getUsers()) {
							if(mId.equals(frame.getTmId().getText())) {
								frame.model.clear();
								throw new Exception();
							}else {
								frame.model.removeElement(mId);
							}
						}
					}
					
				
				}
				frame.getTextPane().scrollRectToVisible(new Rectangle(0,frame.getTextPane().getHeight()+100,1,1));
			}
		}catch(Exception ex) {
			try {
				ois.close();
				oos.close();
				socket.close();
				
				ois = null;
				oos = null;
				socket = null;
				
				frame.getTstart().setEnabled(true);
				frame.getTend().setEnabled(false);
			}catch(Exception ex2) {
				
			}
		}
	}
}
