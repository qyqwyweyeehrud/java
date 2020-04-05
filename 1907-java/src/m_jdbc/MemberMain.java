package m_jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class MemberMain extends JFrame {

	private JDesktopPane contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMain frame = new MemberMain();
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
	public MemberMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 466);
		setJMenuBar(getMenuBar_1());
		contentPane = new JDesktopPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(new Color(255, 255, 255));
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("New menu");
			mnNewMenu.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
			mnNewMenu.add(getMntmNewMenuItem_3());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC785\uB825");
			mntmNewMenuItem.setBackground(new Color(255, 255, 255));
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					MemberInsert mi = new MemberInsert();
					contentPane.add(mi);
					mi.toFront();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC218\uC815");
			mntmNewMenuItem_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			mntmNewMenuItem_1.setBackground(new Color(255, 255, 255));
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberUpdate mu = new MemberUpdate();
					contentPane.add(mu);
					mu.toFront();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC0AD\uC81C");
			mntmNewMenuItem_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			mntmNewMenuItem_2.setBackground(new Color(255, 255, 255));
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDelete md = new MemberDelete();
					contentPane.add(md);
					md.toFront();
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("\uC870\uD68C");
			mntmNewMenuItem_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			mntmNewMenuItem_3.setBackground(new Color(255, 255, 255));
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberSelect ms = new MemberSelect();
					contentPane.add(ms);
					ms.toFront();
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\WeightyRepentantBluejay-size_restricted.gif"));
			lblNewLabel.setBounds(219, 0, 512, 407);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD50C\uB808\uC774");
			lblNewLabel_1.setForeground(new Color(192, 192, 192));
			lblNewLabel_1.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 55));
			lblNewLabel_1.setBounds(22, 125, 202, 61);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u25B6");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Aa a = new Aa();
					contentPane.add(a);
					a.toFront();
				}
			});
			btnNewButton.setBorder(null);
			btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 60));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(178, 34, 34));
			btnNewButton.setBounds(57, 196, 97, 85);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\!!!!!!!.jpg"));
			lblNewLabel_2.setBounds(12, 10, 44, 38);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3142\u3148\u3137.jpg"));
			lblNewLabel_3.setBounds(147, 16, 60, 26);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\124.jpg"));
			lblNewLabel_4.setBounds(110, 371, 97, 26);
		}
		return lblNewLabel_4;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("SQL");
			mnNewMenu_1.setBackground(new Color(255, 255, 255));
			mnNewMenu_1.add(getMntmNewMenuItem_4());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("QUERY");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Query q = new Query();
					contentPane.add(q);
					q.toFront();
				}
			});
			mntmNewMenuItem_4.setBackground(new Color(255, 255, 255));
		}
		return mntmNewMenuItem_4;
	}
}
