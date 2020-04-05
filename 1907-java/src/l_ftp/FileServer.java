package l_ftp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class FileServer extends JFrame implements Runnable{
	
	static int port = 6000;//6000~50000 //static�̶� 6000�̶������� �ʱ�ȭ�� �ι����� �ʴ´�
	ServerSocket server;
	
	List<FileTransferReceive> files = new ArrayList<FileTransferReceive>();//������ ��������
	boolean threadFlag = true;//�۾������尡 ��ӵ����� �����Ұ���
	

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem serverStop;
	private JMenuItem mntmNewMenuItem_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileServer frame = new FileServer();
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
	public FileServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 633);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.NORTH);
		contentPane.add(getScrollPane_1(), BorderLayout.CENTER);

	}
	@Override
	public void run() {
		threadFlag = true;//���������������� false
			
		
		try {
			server = new ServerSocket(5555);
			textArea.append("������ ���۵�\n");
		} catch (IOException e) {
			textArea.append(e.toString()+"\n");
		}
		while(threadFlag) {
			try {
				Socket s = server.accept();//���Ʈ���ȴٰ��ؼ� �ۼ��ŵǴ°Ծƴ�
				textArea.append("Ŭ���̾�Ʈ�� ���ӵ�\n");
				ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
				//Ŭ���̾�Ʈ�����Ʈ�ϰ��� �����͸��ٶ� ������ƮŸ�������ٰǵ� ������Ʈ�ѿ� ���ϸ���ϰ� �����ǻ�������� ������Ʈ�δ����� �������̴�
				Data data = (Data)ois.readObject();//����Ÿ�޾Ҿ�
				textArea.append("���۵� ������ �������ּ���\n");
				
				for(int i =0 ; i<data.fileName.size() ; i++) {//�����͹���������ŭó���Ұž�
					FileServer.port++;
					if(FileServer.port>50000) {
						FileServer.port = 6000;
					}
					
					FileTransferReceive st = new FileTransferReceive(FileServer.port,data.fileName.get(i),data.fileSize.get(i));
					files.add(st);
					panel.add(st);
					
					Data sendData = new Data();
					sendData.port = FileServer.port;
					textArea.append(FileServer.port+"����...\n");
					
					oos.writeObject(sendData);
				}
				panel.updateUI();
				ois.close();
				oos.close();
				
			}catch(Exception ex) {
				
			}
		}
		
		
		
	}
	
	public void serverStop() {
		files.clear();
		files = new ArrayList<FileTransferReceive>();
		try {
			server.close();
			server = null;
			textArea.append("��������");
		} catch (IOException e) {
		}
	}
	
	

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uC11C\uBC84");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getServerStop());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uD30C\uC77C \uC11C\uBC84 \uC2DC\uC791");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					threadFlag = true;
					Thread t = new Thread(FileServer.this);
					t.start();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getServerStop() {
		if (serverStop == null) {
			serverStop = new JMenuItem("\uD30C\uC77C \uC11C\uBC84 \uC911\uC9C0");
			serverStop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStop();
					
				}
			});
		}
		return serverStop;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uD504\uB85C\uADF8\uB7A8\uC885\uB8CC");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(2, 150));
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("�������", Font.PLAIN, 13));
			textArea.setForeground(new Color(255, 255, 255));
			textArea.setBackground(new Color(32, 178, 170));
		}
		return textArea;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setPreferredSize(new Dimension(700, 2));
			scrollPane_1.setViewportView(getPanel());
		}
		return scrollPane_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(175, 238, 238));
			panel.setPreferredSize(new Dimension(700, 10));
		}
		return panel;
	}
}
