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

public class MyInfo extends JFrame implements ActionListener{//작업의 표준화
//제이프레임을 상속받은 마이인포
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//프레임만죽여라
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getBtn123(), BorderLayout.CENTER);
		contentPane.add(getBtnABC(), BorderLayout.NORTH);
	}
	
	public synchronized void job() {//동시에 실행될수 없음//상호 배타적 동기화
		synchronized(this) {//자기자신은 동기화이다
			//따로만들어서도 할수있다 따로만들었다면 밖은 비동기, 이 안은 동기
		}
	}

	private JButton getBtn123() {
		if (btn123 == null) {
			btn123 = new JButton("123");
//			ActionListener listner = new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {//재정의해야하는건 액션포폼드
//					// TODO Auto-generated method stub
					
//				}
//			};
			
			btn123.addActionListener(this);//자신은 j프레임이기도 하면서 액션리스터이기도 하기에 이 this는 자기자신이 가지고있는 액션리스터를 슥~집어넣어준다
			//btnNewButton.addActionListener(new ActionListener() {//익명(아너니머스형)의 클래스는 액션리스너 를생성해서 집어넣는얘는 매드액션 리스너
			
			
			
			
			//	public void actionPerformed(ActionEvent e) {//재정의해야하는건 액션포폼드
			//	}
			//});
		}
		return btn123;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//메인스레드에서 어셉트 할수 없기때문에 t 라고하는 작업스레드를 만들어서 그 안에 어셉트를 시켰다
		
		try {
			SubThread st = new SubThread();
			Thread t = new Thread(st);
			t.setDaemon(true);
			t.start();
			
			
			
			
//			Thread t = new Thread(new Runnable(){ //작업 스레드 t가 만들어진것
//				public void run() {//추상메소드를 재정의할거야
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
//			//t.run(); // 스레드가 실행된게아니라 run을 불러온것임
//			t.start(); //작업스레스 시작,
			
		}catch(Exception ex) {
			
		}
		
	}
	private JButton getBtnABC() {
		if (btnABC == null) {
			btnABC = new JButton("abc");
			btnABC.addActionListener(this);//this를 매개변수로
		}
		return btnABC;
	}
}
