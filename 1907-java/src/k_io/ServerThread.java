package k_io;

import java.awt.Rectangle;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//데이터를 수신하는 스레드
public class ServerThread extends Thread{//클라이언트와 1대1로 대화함
	String mId;//로그인이라는 커맨드가 들어왓을때
	ServerFrame frame;
	Socket socket;
	
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public ServerThread(ServerFrame frame, Socket socket) {//프레임은 유아이를 전달받을거고 소켓은 서버로부터전달받을것이다
		this.frame = frame;
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			while(true) {
				ChattData cd =(ChattData)ois.readObject();//서버프레임에서 챗데이다형식으로 라이트했기에 캐스팅//스레드를만들지않으면 read는 블록킹이됨
				String html = "";
				switch(cd.getCommand()) {
					case ChattData.LOGIN :
						this.mId = cd.getmId();//자신과연결된 클라이언트에 mId를 저장
						html = "<font color = '#034F84'>"+cd.getmId() +  "님이 접속하였습니다";
						frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);//킷은 프레임이가지고있는 kit필드
						html = "<div style = 'width:90px;height:20px; border:1px solid #ffffff ; padding :3px;" + "background-color:#FFB6C1;"+"color: #ffffff;'>" + cd.toString() + "</div>";
						frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);
						
						//먼저 자신과연결된 oos에게 기존 접속자 목록을 전송
						ChattData cd2 = new ChattData();
						List<String> users = new ArrayList<String>();
						for(int i =0 ; i<frame.model.size();i++) {
							users.add(frame.model.get(i));
						}
						cd2.setCommand(ChattData.LOGIN);
						cd2.setUsers(users);
						oos.writeObject(cd2);
						oos.flush();
						
						//자신의 아이디를 모델에 추가
						frame.model.addElement(cd.getmId());
						
						//모든 접속자에게 현재 자신의 아이디를 전송
						cd2 = new ChattData();
						cd2.setCommand(ChattData.LOGIN);
						users =  new ArrayList<String>();
						
						users.add(cd.getmId());
						cd2.setUsers(users);
						sendAll(cd2);
						
					break;
					
					case ChattData.MESSAGE :
						html = "<div style = 'width:200px;height:20px; border:1px solid #ffffff ; padding :3px;" + "background-color:#91A8D0;"+"color: #ffffff;'>" + cd.toString() + "</div>";
						
						frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);
						
						sendAll(cd);//cd는 수신받은데이터
					break;
					
					case ChattData.WHISPER :
						int[] to = new int[cd.getUsers().size()];
						int index = 0;
						for(String str : cd.getUsers()) {
							for(int i =0 ; i<frame.clients.size(); i++) {
								ServerThread st = frame.clients.get(i);
								if(str.equals(st.mId)) {
									to[index] = i;
									index++;
								}
							}
						}
						frame.sendAll(cd,to);
					break;
						
					case ChattData.LOGOUT :
						throw new Exception();//캐치문장 실행시킴
						
					
				}
				frame.getTextPane().scrollRectToVisible(new Rectangle(0,frame.getTextPane().getHeight()+100,1,1));
			}
			
		}catch(Exception ex) {
			int index = frame.clients.indexOf(ServerThread.this);
			frame.model.remove(index);
			frame.clients.remove(index);
			//다른 모든유저에서 본인의 logout된 사실을 통보
			ChattData cd = new ChattData();
			cd.setCommand(ChattData.LOGOUT);
			cd.setmId(this.mId);
			try {
				sendAll(cd);
			} catch (Exception e) {
				
			}
			
		}
	}
	
	public void sendAll(ChattData cd) throws Exception{//서버가기억하는 모든 클라이언트들에게 전달하기위한 메서드
		for(ServerThread st : frame.clients) {//맨처음은 자기자신이된다 다시루핑을한다 두번째서버스레드에 데이터를쏘면 데이터가 클라이언트2한테 날라감 다시루핑 ~~~~
			st.oos.writeObject(cd);
			st.oos.flush();
			//자기자신이 자기자신을가지고있는 클라이언트를조사해서 이코드가돌아가는 서버스레드 자기자신을포함하고있는 클라이언츠를 st에 대입해서 나를포함한
		}
	}
}
