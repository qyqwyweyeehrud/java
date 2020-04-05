package k_io;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientFrame extends JFrame implements Runnable{//Ŭ���̾�Ʈ �������� �����������̾�, Ŭ���̾�Ʈ�������� �����̺��̾�, is a//�θ��ڽİ���

	Socket socket;
	
	
	HTMLEditorKit kit = new HTMLEditorKit();
	HTMLDocument doc = new HTMLDocument();
	
	ClientThread ct;
	
	DefaultListModel<String> model = new DefaultListModel<String>();
	
	private JPanel contentPane;// has a /Ư�� Ŭ�����ȿ� �������ִ� �����
	private JLabel lblNewLabel;
	private JTextField serverIp;
	private JLabel lblNewLabel_1;
	private JTextField port;
	private JLabel lblNewLabel_2;
	private JTextField tmId;
	private JLabel lblNewLabel_3;
	private JTextField tPwd;
	private JButton tstart;
	private JButton tend;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JTextPane textPane;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;
	private JComboBox comboBox;
	private JTextField message;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientFrame frame = new ClientFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientFrame() {
		setTitle("\uCC44\uD305\uD074\uB77C\uC774\uC5B8\uD2B8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getServerIp());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPort());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTmId());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTPwd());
		contentPane.add(getTstart());
		contentPane.add(getTend());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getComboBox());
		contentPane.add(getMessage());
		contentPane.add(getBtnNewButton_2());
	}
	@Override
	public void run() {
		try {
			String ip = serverIp.getText();
			int p = Integer.parseInt(port.getText());
			socket = new Socket(ip,p);//���� 
			
			ct = new ClientThread(ClientFrame.this, socket);
			ct.start();
			
			
		}catch(Exception ex) {
			System.out.println("ClientFrame.run()......");
			ex.printStackTrace();
		}
	}
	
	
	public void login() throws Exception{
		String mid = tmId.getText();
		String pwd = tPwd.getText();
		String msg = "���� ���̴� �λ�ڰŶ�";
		int    cmd = ChattData.LOGIN;
		
		ChattData cd = new ChattData(mid,cmd,msg);
		ct.oos.writeObject(cd);
		ct.oos.flush();
		
		
		
		
		tstart.setEnabled(false);
		tend.setEnabled(true);
		
	}
	
	//1)�������� LOGOUT �뺸�� �ؾ��Ѵ�
	//2)�ڽ��� ��������� ��������ؾ��Ѵ�
	//3)ClientThread�� ����
	public void logout() {
		//1)
		ChattData cd = new ChattData();
		cd.setmId(tmId.getText());
		cd.setCommand(ChattData.LOGOUT);
		try {
			ct.oos.writeObject(cd);
			ct.oos.flush();
			//2)
			model.clear();
			//3
			ct.stop();
			socket.close();
			socket = null;
		} catch (IOException e) {
		}
		
		tstart.setEnabled(true);
		tend.setEnabled(false);
		
		
		
	}
	
	public void send() {//�޼��� �߼�
		try {
			String mid = tmId.getText();
			int cmd    = ChattData.MESSAGE;
			String msg = message.getText();
			ChattData cd = new ChattData(mid,cmd,msg);
			
			if(comboBox.getSelectedIndex()==1) {//�ӼӸ� �̶��?
				Object[] obj = getList().getSelectedValues();
				List<String> users = new ArrayList<String>();
				for(Object str : obj) {
					users.add((String)str);
				}
				cd.setUsers(users);
				cd.setCommand(ChattData.WHISPER);
			}
			
			if(socket.isConnected()) {
				ct.oos.writeObject(cd);//Ŭ���̾�Ʈ�� �޼����� �ִ°��� //���������尡 ���������Ʈ ���¿��ٰ� �갡 ���������� ���ú��Ұ���
				ct.oos.flush();
			}
		}catch(Exception ex) {
			
		}
	}
	

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC11C\uBC84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getServerIp() {
		if (serverIp == null) {
			serverIp = new JTextField();
			serverIp.setBounds(50, 7, 92, 21);
			serverIp.setColumns(10);
			
			try {
				InetAddress local = InetAddress.getLocalHost();
				serverIp.setText(local.getHostAddress());
			}catch(Exception ex) {
				
			}
		}
		return serverIp;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("PORT");
			lblNewLabel_1.setBounds(154, 10, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getPort() {
		if (port == null) {
			port = new JTextField();
			port.setText("4444");
			port.setBounds(201, 7, 82, 21);
			port.setColumns(10);
		}
		return port;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("ID");
			lblNewLabel_2.setBounds(12, 38, 57, 15);
		}
		return lblNewLabel_2;
	}
	public JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setText("dafawaf");
			tmId.setBounds(50, 35, 92, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("PW");
			lblNewLabel_3.setBounds(154, 38, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTPwd() {
		if (tPwd == null) {
			tPwd = new JTextField();
			tPwd.setText("1234");
			tPwd.setBounds(201, 35, 82, 21);
			tPwd.setColumns(10);
		}
		return tPwd;
	}
	public JButton getTstart() {
		if (tstart == null) {
			tstart = new JButton("\uC811\uC18D");
			tstart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Thread t = new Thread(ClientFrame.this);//is a �߿��� �ڵ����� �����̺��� �����´�
					t.start();
					
				}
			});
			tstart.setFont(new Font("�������", Font.PLAIN, 12));
			tstart.setBounds(295, 6, 62, 47);
		}
		return tstart;
	}
	public JButton getTend() {
		if (tend == null) {
			tend = new JButton("\uC885\uB8CC");
			tend.setEnabled(false);
			tend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					logout();
					
				}
			});
			tend.setFont(new Font("�������", Font.PLAIN, 12));
			tend.setBounds(360, 6, 62, 47);
		}
		return tend;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 60, 130, 236);
			scrollPane.setViewportView(getList());
			scrollPane.setColumnHeaderView(getLblNewLabel_4());
		}
		return scrollPane;
	}
	public JList getList() {
		if (list == null) {
			list = new JList();
			
			list.setModel(model);
		}
		return list;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(154, 60, 268, 268);
			scrollPane_1.setViewportView(getTextPane());
			scrollPane_1.setColumnHeaderView(getLblNewLabel_5());
		}
		return scrollPane_1;
	}
	public JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setContentType("text/html");//mine type
			
			textPane.setEditorKit(kit);
			textPane.setDocument(doc);
			
		}
		return textPane;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC811\uC18D\uC790");
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uBA54\uC138\uC9C0");
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uD574\uC81C");
			btnNewButton_1.setFont(new Font("�������", Font.PLAIN, 12));
			btnNewButton_1.setBounds(12, 298, 130, 30);
		}
		return btnNewButton_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("�������", Font.PLAIN, 12));
			comboBox.setBounds(12, 338, 130, 25);
			comboBox.addItem("��ü�ż���");
			comboBox.addItem("�ӼӸ�");
		}
		return comboBox;
	}
	private JTextField getMessage() {
		if (message == null) {
			message = new JTextField();
			message.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {//�̺�Ʈ���߻��� �� e�� Ÿ�����
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						send();						
					}
				}
			});
			message.setBounds(154, 338, 205, 25);
			message.setColumns(10);
		}
		return message;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC804\uC1A1");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					send();
				}
			});
			btnNewButton_2.setFont(new Font("�������", Font.PLAIN, 12));
			btnNewButton_2.setBounds(365, 338, 57, 23);
		}
		return btnNewButton_2;
	}
}
