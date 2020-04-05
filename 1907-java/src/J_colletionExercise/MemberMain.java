package J_colletionExercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberMain extends JFrame {
	
	List<MemberVo> list = new ArrayList<MemberVo>();
	Set<ProductVo> iset = new HashSet<ProductVo>();
	Set<ProductVo> oset = new HashSet<ProductVo>();
	
	static int iSerial =1;
	static int eSerial =1;

	private JDesktopPane contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;

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
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JDesktopPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		for(int i = 0;i<500;i++) {
			MemberVo vo = new MemberVo("no"+i,"pwd"+i,"mName"+i,"010-1111-1"+i);
			list.add(vo);
		}
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uBA54\uB274");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC785\uB825");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberInput mi = new MemberInput(list);
					contentPane.add(mi);
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC870\uD68C");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberSearch ms = new MemberSearch(list);
					contentPane.add(ms);
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC218\uC815\uC0AD\uC81C");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberModify mm = new MemberModify(list);
					contentPane.add(mm);
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("New menu");
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getMntmNewMenuItem_6());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
			mnNewMenu_1.add(getMntmNewMenuItem_5());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("\uC785\uB825");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductInput pi = new ProductInput(iset);
					contentPane.add(pi);
					pi.toFront();
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("\uC870\uD68C");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductSearch ps = new ProductSearch(iset,oset);
					contentPane.add(ps);
					ps.toFront();
				}
			});
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("\uC218\uC815\uC0AD\uC81C");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductModify pm = new ProductModify(iset,oset);
					contentPane.add(pm);
					pm.toFront();
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("\uCD9C\uACE0");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductOutput po = new ProductOutput(oset);
					contentPane.add(po);
					po.toFront();
				}
			});
		}
		return mntmNewMenuItem_6;
	}
}
