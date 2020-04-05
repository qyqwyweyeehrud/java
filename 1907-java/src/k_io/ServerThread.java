package k_io;

import java.awt.Rectangle;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//�����͸� �����ϴ� ������
public class ServerThread extends Thread{//Ŭ���̾�Ʈ�� 1��1�� ��ȭ��
	String mId;//�α����̶�� Ŀ�ǵ尡 ��������
	ServerFrame frame;
	Socket socket;
	
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public ServerThread(ServerFrame frame, Socket socket) {//�������� �����̸� ���޹����Ű� ������ �����κ������޹������̴�
		this.frame = frame;
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			while(true) {
				ChattData cd =(ChattData)ois.readObject();//���������ӿ��� ê���̴��������� ����Ʈ�߱⿡ ĳ����//�����带������������ read�� ���ŷ�̵�
				String html = "";
				switch(cd.getCommand()) {
					case ChattData.LOGIN :
						this.mId = cd.getmId();//�ڽŰ������ Ŭ���̾�Ʈ�� mId�� ����
						html = "<font color = '#034F84'>"+cd.getmId() +  "���� �����Ͽ����ϴ�";
						frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);//Ŷ�� �������̰������ִ� kit�ʵ�
						html = "<div style = 'width:90px;height:20px; border:1px solid #ffffff ; padding :3px;" + "background-color:#FFB6C1;"+"color: #ffffff;'>" + cd.toString() + "</div>";
						frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);
						
						//���� �ڽŰ������ oos���� ���� ������ ����� ����
						ChattData cd2 = new ChattData();
						List<String> users = new ArrayList<String>();
						for(int i =0 ; i<frame.model.size();i++) {
							users.add(frame.model.get(i));
						}
						cd2.setCommand(ChattData.LOGIN);
						cd2.setUsers(users);
						oos.writeObject(cd2);
						oos.flush();
						
						//�ڽ��� ���̵� �𵨿� �߰�
						frame.model.addElement(cd.getmId());
						
						//��� �����ڿ��� ���� �ڽ��� ���̵� ����
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
						
						sendAll(cd);//cd�� ���Ź���������
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
						throw new Exception();//ĳġ���� �����Ŵ
						
					
				}
				frame.getTextPane().scrollRectToVisible(new Rectangle(0,frame.getTextPane().getHeight()+100,1,1));
			}
			
		}catch(Exception ex) {
			int index = frame.clients.indexOf(ServerThread.this);
			frame.model.remove(index);
			frame.clients.remove(index);
			//�ٸ� ����������� ������ logout�� ����� �뺸
			ChattData cd = new ChattData();
			cd.setCommand(ChattData.LOGOUT);
			cd.setmId(this.mId);
			try {
				sendAll(cd);
			} catch (Exception e) {
				
			}
			
		}
	}
	
	public void sendAll(ChattData cd) throws Exception{//����������ϴ� ��� Ŭ���̾�Ʈ�鿡�� �����ϱ����� �޼���
		for(ServerThread st : frame.clients) {//��ó���� �ڱ��ڽ��̵ȴ� �ٽ÷������Ѵ� �ι�°���������忡 �����͸���� �����Ͱ� Ŭ���̾�Ʈ2���� ���� �ٽ÷��� ~~~~
			st.oos.writeObject(cd);
			st.oos.flush();
			//�ڱ��ڽ��� �ڱ��ڽ����������ִ� Ŭ���̾�Ʈ�������ؼ� ���ڵ尡���ư��� ���������� �ڱ��ڽ��������ϰ��ִ� Ŭ���̾����� st�� �����ؼ� ����������
		}
	}
}
