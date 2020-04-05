package k_io;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ServerFrame extends JFrame implements Runnable{
	
	ServerSocket server;
	
	HTMLEditorKit kit = new HTMLEditorKit();
	HTMLDocument doc = new HTMLDocument();//웹페이지의 바닥을 도큐멘트라고 한다//컨텐츠가 뿌려지는장소
	
	List<ServerThread> clients = new ArrayList<ServerThread>();
	
	DefaultListModel<String> model = new DefaultListModel<String>();
	
	ServerThread st;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblPort;
	private JTextField port;
	private JButton tstart;
	private JButton tend;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane_1;
	private JTextPane textPane;
	private JButton btnNewButton_2;
	private JButton button;
	private JComboBox comboBox;
	private JTextField message;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerFrame frame = new ServerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	@Override
	public void run() {
		try {
			int p = Integer.parseInt(port.getText());
			server = new ServerSocket(p);
			
			String html = "<font size = '5' color='#034F84'>서버가 시작됨</font>";//<<html 태그 //#RRGGBB
			kit.insertHTML(doc, doc.getLength(), html, 0, 0, null);
			//					시작위치     			문자열
			
			while(true) {
				html = "[클라이언트 접속 대기중]....";
				kit.insertHTML(doc, doc.getLength(), html, 0, 0, null);
				
				Socket clientSocket = server.accept();//접속만하는 스레드
				ServerThread st = new ServerThread(ServerFrame.this,clientSocket);//데이터를 수신하기위해만드러진 서버스레드
				st.start();
				clients.add(st);//클라이언츠라는 변수에 모든 사용자저장
				
				InetSocketAddress addr = (InetSocketAddress)clientSocket.getRemoteSocketAddress();
				html = "<div style = 'border:2px solid #034F84;padding:10px;width:150px'>"//문장의 구분은 ;  값의 대입은 : div는 하나의 문단을 만들어내는 
					+ addr.getAddress().getHostAddress() + "님이 접속함"+ "</div>";
				kit.insertHTML(doc, doc.getLength(), html, 0, 0, null);
				
				textPane.scrollRectToVisible(new Rectangle(0,textPane.getHeight()+100,1,1));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void send() {
		ChattData cd = new ChattData();
		cd.setmId("SERVER");
		cd.setCommand(ChattData.MESSAGE);
		cd.setMessage(message.getText());
		if(comboBox.getSelectedIndex()==0) {
			sendAll(cd);			
		}else {
			int[] indexs = getList().getSelectedIndices();
			sendAll(cd , indexs);
		}
		
	}
	
	public void sendAll(ChattData cd) {
		for(ServerThread st : clients) {
			try {
				st.oos.writeObject(cd);
				st.oos.flush();
			} catch (IOException e) {
			}
		}
	}
	
	public void sendAll(ChattData cd,int[] to) {//귓속말
		for(int i = 0;i<to.length ; i++) {
			ServerThread st = clients.get(to[i]);
			try {
				st.oos.writeObject(cd);
				st.oos.flush();
			} catch (IOException e) {
			}
		}
	}
	
	//1)모든유저에게 서버종료 통보(GETOUT)
			//2)서버 스레드 종료
			//3)접속자 목록 모두제거
			//4)서버소켓 종료
	public void serverStop() {
		//1)
		ChattData cd = new ChattData();
		cd.setCommand(ChattData.GETOUT);
		cd.setmId("SERVER");
		sendAll(cd);
		//2)
		clients.clear();
		clients = new ArrayList<ServerThread>();
		
		model.clear();
		try {
			server.close();
			server = null;
		} catch (IOException e) {
		}
	}

	/**
	 * Create the frame.
	 */
	public ServerFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				serverStop();
			}
		});
		setTitle("\uCC44\uD305\uC11C\uBC84");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 577);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblPort());
		contentPane.add(getPort());
		contentPane.add(getTstart());
		contentPane.add(getTend());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getButton());
		contentPane.add(getComboBox());
		contentPane.add(getMessage());
		contentPane.add(getBtnNewButton_3());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("IP");
			lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 16));
			lblNewLabel.setBounds(263, 13, 30, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(321, 10, 84, 23);
			textField.setColumns(10);
			
			try {
				InetAddress local = InetAddress.getLocalHost();
				textField.setText(local.getHostAddress());
			}catch(Exception ex) {
				
			}
		}
		return textField;
	}
	private JLabel getLblPort() {
		if (lblPort == null) {
			lblPort = new JLabel("PORT");
			lblPort.setFont(new Font("나눔고딕", Font.PLAIN, 16));
			lblPort.setBounds(263, 35, 60, 15);
		}
		return lblPort;
	}
	private JTextField getPort() {
		if (port == null) {
			port = new JTextField();
			port.setText("4444");
			port.setBounds(321, 32, 84, 23);
			port.setColumns(10);
		}
		return port;
	}
	public JButton getTstart() {
		if (tstart == null) {
			tstart = new JButton("\uC2DC\uC791");
			tstart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Thread t = new Thread(ServerFrame.this);
					t.start();
					tstart.setEnabled(false);
					tend.setEnabled(true);
				}
			});
			tstart.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tstart.setBounds(417, 10, 60, 44);
		}
		return tstart;
	}
	public JButton getTend() {
		if (tend == null) {
			tend = new JButton("\uC885\uB8CC");
			tend.setEnabled(false);
			tend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStop();
					tstart.setEnabled(true);
					tend.setEnabled(false);
				}
			});
			tend.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tend.setBounds(489, 10, 60, 44);
		}
		return tend;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 90, 189, 344);
			scrollPane.setViewportView(getList());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();//ui관리
			list.setModel(model);//로그인이라는 커맨드가 들어왔을때 추가//data관리
		}
		return list;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC811\uC18D\uC790 \uBAA9\uB85D");
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(213, 90, 336, 381);
			scrollPane_1.setViewportView(getTextPane());
			scrollPane_1.setColumnHeaderView(getLblNewLabel_2());
		}
		return scrollPane_1;
	}
	public JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setContentType("text/html");
			textPane.setEditorKit(kit);
			textPane.setDocument(doc);
		}
		return textPane;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC15\uD1F4");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object[] indexs = getList().getSelectedValues();
					ChattData cd = new ChattData();
					cd.setCommand(ChattData.GETOUT);
					cd.setmId("SERVER");
					List<String> users = new ArrayList<String>();
					for(int i = 0;i<indexs.length ; i++) {
						users.add((String)indexs[i]);
					}
					cd.setUsers(users);
					sendAll(cd);
				}
			});
			btnNewButton_2.setBounds(12, 436, 91, 35);
		}
		return btnNewButton_2;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uD574\uC81C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getList().clearSelection();
				}
			});
			button.setBounds(110, 436, 91, 35);
		}
		return button;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(12, 479, 189, 28);
			comboBox.addItem("전체매세지");
			comboBox.addItem("귓속말");
		}
		return comboBox;
	}
	private JTextField getMessage() {
		if (message == null) {
			message = new JTextField();
			message.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					send();
					}
				}
			});
			message.setBounds(213, 479, 248, 28);
			message.setColumns(10);
		}
		return message;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC804\uC1A1");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					send();
				}
			});
			btnNewButton_3.setBounds(465, 479, 84, 28);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBA54\uC138\uC9C0");
		}
		return lblNewLabel_2;
	}
}
