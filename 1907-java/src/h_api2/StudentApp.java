package h_api2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentApp extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JLabel status;
	JPanel panel;
	static Student[] student = new Student[100];
	static int count;
	private JLabel eeee;
	
	static {//초기화 시킬곳
		student[0] = new Student(10,"hong",60);
		student[1] =new Student(1,"kim",90);
		student[2] =new Student(3,"park",40);
		student[3] =new Student(8,"lee",99);
		student[4] =new Student(2,"hong",66);
		count = 5;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentApp frame = new StudentApp();
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
	public StudentApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 419);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getStatus(), BorderLayout.SOUTH);
		contentPane.add(getEeee(), BorderLayout.CENTER);
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
			mnNewMenu = new JMenu("New menu");
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_2());
			mnNewMenu.add(getMntmNewMenuItem_3());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC131\uC801\uC785\uB825");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(panel !=null){
						contentPane.remove(panel);
					}
					panel = new ScoreInput(status);
					contentPane.add(panel);
					contentPane.updateUI();
					status.setText("성적을 입력하세요");
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uD648\uC73C\uB85C");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(panel !=null){
						contentPane.remove(panel);
					}
					panel = new Main();
					contentPane.add(panel);
					contentPane.updateUI();
					status.setText("홈입니다");
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC131\uC801\uC21C");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {if(panel !=null){
					contentPane.remove(panel);
				}
				panel = new SortByscore(status);
				contentPane.add(panel);
				contentPane.updateUI();
				status.setText("성적순으로 정렬되었습니다");
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("\uD559\uBC88\uC21C");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(panel !=null){
						contentPane.remove(panel);
					}
					panel = new SortBysno(status);
					contentPane.add(panel);
					contentPane.updateUI();
					status.setText("학번순으로 정렬되었습니다");
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uD648\uC785\uB2C8\uB2E4");
			status.setPreferredSize(new Dimension(0, 25));
			status.setOpaque(true);
			status.setForeground(new Color(222, 184, 135));
			status.setBackground(new Color(139, 69, 19));
			status.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return status;
	}
	private JLabel getEeee() {
		if (eeee == null) {
			eeee = new JLabel("");
			eeee.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\uCE60\uD310_1_zbxldmsql12.png"));
		}
		return eeee;
	}
}
