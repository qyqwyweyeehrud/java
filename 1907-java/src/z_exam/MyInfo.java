package z_exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.Messaging.SyncScopeHelper;

import c_contrl.Main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class MyInfo extends JFrame implements ActionListener{//�۾��� ǥ��ȭ
//������������ ��ӹ��� ��������
	private JPanel contentPane;
	private JButton btn123;
	private JButton btnABC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyInfo frame = new MyInfo();
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
	public MyInfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//�����Ӹ��׿���
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getBtn123(), BorderLayout.CENTER);
		contentPane.add(getBtnABC(), BorderLayout.NORTH);
	}
	
	public synchronized void job() {//���ÿ� ����ɼ� ����//��ȣ ��Ÿ�� ����ȭ
		synchronized(this) {//�ڱ��ڽ��� ����ȭ�̴�
			//���θ����� �Ҽ��ִ� ���θ�����ٸ� ���� �񵿱�, �� ���� ����
		}
	}

	private JButton getBtn123() {
		if (btn123 == null) {
			btn123 = new JButton("123");
//			ActionListener listner = new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {//�������ؾ��ϴ°� �׼�������
//					// TODO Auto-generated method stub
					
//				}
//			};
			
			btn123.addActionListener(this);//�ڽ��� j�������̱⵵ �ϸ鼭 �׼Ǹ������̱⵵ �ϱ⿡ �� this�� �ڱ��ڽ��� �������ִ� �׼Ǹ����͸� ��~����־��ش�
			//btnNewButton.addActionListener(new ActionListener() {//�͸�(�Ƴʴϸӽ���)�� Ŭ������ �׼Ǹ����� �������ؼ� ����ִ¾�� �ŵ�׼� ������
			
			
			
			
			//	public void actionPerformed(ActionEvent e) {//�������ؾ��ϴ°� �׼�������
			//	}
			//});
		}
		return btn123;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//���ν����忡�� ���Ʈ �Ҽ� ���⶧���� t ����ϴ� �۾������带 ���� �� �ȿ� ���Ʈ�� ���״�
		
		try {
			SubThread st = new SubThread();
			Thread t = new Thread(st);
			t.setDaemon(true);
			t.start();
			
			
			
			
//			Thread t = new Thread(new Runnable(){ //�۾� ������ t�� ���������
//				public void run() {//�߻�޼ҵ带 �������Ұž�
//					ServerSocket ss;
//					try {
//						ss = new ServerSocket(9999);
//						Socket s = ss.accept(); //blocking mode
//					} catch (IOException e) {
//						
//					}
//					
//				}
//			});
//			//t.run(); // �����尡 ����ȰԾƴ϶� run�� �ҷ��°���
//			t.start(); //�۾������� ����,
			
		}catch(Exception ex) {
			
		}
		
	}
	private JButton getBtnABC() {
		if (btnABC == null) {
			btnABC = new JButton("abc");
			btnABC.addActionListener(this);//this�� �Ű�������
		}
		return btnABC;
	}
}
