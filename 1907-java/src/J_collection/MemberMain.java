package J_collection;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MemberMain extends JFrame {
	//멤버메인이라는 클래스의 정적형의 무결성체크를 위한 네가지를썻다
	static String idCheck = "\\w{4,10}";
	static String pwdCheck = "\\[w!&] {4,10}";
	static String nameCheck = "[가-휗]{2,20}";
	static String phoneCheck = "\\d{2,3}-\\d{3,4}-\\d{4}";
	
	
	//공유자원을 리스트형태로 만들겠다.//멤버브이오타입
	List<MemberVo> list = new ArrayList<MemberVo>();//기본데이터 사이즈 10개//11번째된 순간 20개//21번째 된순간 30개로 늘어남
	//멤버인풋이라는 프레임이만들어진 순간에 리스트를(객체)를 전달하겟다
	Set<ProductVo> pilist = new HashSet<ProductVo>();
	Set<ProductVo> pelist = new HashSet<ProductVo>();
	Map<String , List<ScoreVo>> map = new HashMap<String , List<ScoreVo>>();
	
	static int iSerial = 1;//입고의 순번
	static int eSerial = 1;//출고의 순번
	
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
	private JMenu menu;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;
	private JLabel lblNewLabel;
	private JMenu menu_1;
	private JMenuItem mntmProperties;
	private JMenuItem mntmTreeset;
	private JMenuItem mntmStack;
	private JMenuItem mntmQue;
	private JMenuItem mntmTreemap;

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
		setTitle("\uD68C\uC6D0\uAD00\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 659);
		setJMenuBar(getMenuBar_1());
		contentPane = new JDesktopPane();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		
		//smaole data
		for(int i = 0; i<500 ; i++) {
			MemberVo vo = new MemberVo("no"+i,"pwd"+i,"name"+i,"010-1111-"+i);
			list.add(vo);
		}
		//입출고 샘플데이터
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i = 0; i<100 ; i++) {
			String tempSerial = sdf.format(new Date()) + "-" + MemberMain.iSerial;
			ProductVo pv = new ProductVo(tempSerial,"pCode"+i,"pName"+i, 3000 , new Date());
			pilist.add(pv);
			pelist.add(pv);
			MemberMain.iSerial++;
			MemberMain.eSerial++;
		}
		//성적관리 샘플데이터
		ScoreVo svo = new ScoreVo("1","kim","중간고사",1,90,90,90);
		List<ScoreVo> list1 = new ArrayList<ScoreVo>();
		list1.add(svo);
		list1.add(new ScoreVo("1","kim","기말고사",1,35,67,89));
		list1.add(new ScoreVo("1","kim","기말고사",2,50,40,76));
		map.put("1", list1);
		//--
		list1 = new ArrayList<ScoreVo>();
		list1.add(new ScoreVo("2","yee","중간고사",3,50,43,67));
		list1.add(new ScoreVo("2","yee","기말고사",3,40,50,32));
		map.put("2", list1);
		//--
		list1 = new ArrayList<ScoreVo>();
		list1.add(new ScoreVo("3","hong","중간고사",2,32,12,69));
		list1.add(new ScoreVo("3","hong","기말고사",2,34,6,12));
		list1.add(new ScoreVo("3","hong","기말고사",3,99,78,86));
		map.put("3", list1);
		
		
	
		
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(new Color(188, 143, 143));
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
			menuBar.add(getMenu());
			menuBar.add(getMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uD68C\uC6D0\uAD00\uB9AC");
			mnNewMenu.setForeground(new Color(255, 255, 255));
			mnNewMenu.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uD68C\uC6D0 \uC785\uB825");
			mntmNewMenuItem.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			mntmNewMenuItem.setForeground(new Color(255, 255, 255));
			mntmNewMenuItem.setBackground(new Color(188, 143, 143));
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					MemberInput mi = new MemberInput(list);//멤버인웃의 리스트로 레퍼런싱됨
					contentPane.add(mi);
					mi.toFront();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uD68C\uC6D0 \uC870\uD68C");
			mntmNewMenuItem_1.setForeground(new Color(255, 255, 255));
			mntmNewMenuItem_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmNewMenuItem_1.setBackground(new Color(188, 143, 143));
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberSearch ms = new MemberSearch(list);
					contentPane.add(ms);
					ms.toFront();
					
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC218\uC815,\uC0AD\uC81C");
			mntmNewMenuItem_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmNewMenuItem_2.setForeground(new Color(255, 255, 255));
			mntmNewMenuItem_2.setBackground(new Color(188, 143, 143));
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberModify mm = new MemberModify(list);
					contentPane.add(mm);
					mm.toFront();
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("자재관리");
			mnNewMenu_1.setBackground(new Color(255, 255, 255));
			mnNewMenu_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mnNewMenu_1.setForeground(Color.WHITE);
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
			mnNewMenu_1.add(getMntmNewMenuItem_5());
			mnNewMenu_1.add(getMntmNewMenuItem_6());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("입고");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductInput pi = new ProductInput(pilist);
					contentPane.add(pi);
					pi.toFront();//화면을 띄운때 맨 상단으로 띄우기
				}
			});
			mntmNewMenuItem_3.setBackground(new Color(188, 143, 143));
			mntmNewMenuItem_3.setForeground(Color.WHITE);
			mntmNewMenuItem_3.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("출고");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductOutput po = new ProductOutput(pelist);
					contentPane.add(po);
					po.toFront();
				}
			});
			mntmNewMenuItem_4.setBackground(new Color(188, 143, 143));
			mntmNewMenuItem_4.setForeground(Color.WHITE);
			mntmNewMenuItem_4.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("조회");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductSearch ps = new ProductSearch(pilist,pelist);
					contentPane.add(ps);
					ps.toFront();
				}
			});
			mntmNewMenuItem_5.setBackground(new Color(188, 143, 143));
			mntmNewMenuItem_5.setForeground(Color.WHITE);
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("수정,삭제");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductModify pm  = new ProductModify(pilist,pelist);
					contentPane.add(pm);
					pm.toFront();
				}
			});
			mntmNewMenuItem_6.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmNewMenuItem_6.setForeground(new Color(255, 255, 255));
			mntmNewMenuItem_6.setBackground(new Color(188, 143, 143));
		}
		return mntmNewMenuItem_6;
	}
	private JMenu getMenu() {
		if (menu == null) {
			menu = new JMenu("성적관리");
			menu.setForeground(Color.WHITE);
			menu.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			menu.setBackground(Color.WHITE);
			menu.add(getMenuItem());
			menu.add(getMenuItem_1());
		}
		return menu;
	}
	private JMenuItem getMenuItem() {
		if (menuItem == null) {
			menuItem = new JMenuItem("입력");
			menuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreInput si = new ScoreInput(map,MemberMain.this);
					contentPane.add(si);
					si.toFront();
				}
			});
			menuItem.setForeground(Color.WHITE);
			menuItem.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			menuItem.setBackground(new Color(188, 143, 143));
		}
		return menuItem;
	}
	private JMenuItem getMenuItem_1() {
		if (menuItem_1 == null) {
			menuItem_1 = new JMenuItem("조회");
			menuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreSearch ss = new ScoreSearch(map);
					contentPane.add(ss);
					ss.toFront();
				}
			});
			menuItem_1.setForeground(Color.WHITE);
			menuItem_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			menuItem_1.setBackground(new Color(188, 143, 143));
		}
		return menuItem_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\174d97a0a1.jpg"));
			lblNewLabel.setBounds(0, 0, 598, 600);
		}
		return lblNewLabel;
	}
	private JMenu getMenu_1() {
		if (menu_1 == null) {
			menu_1 = new JMenu("기타컬렉션");
			menu_1.setForeground(Color.WHITE);
			menu_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			menu_1.setBackground(Color.WHITE);
			menu_1.add(getMntmProperties());
			menu_1.add(getMntmTreeset());
			menu_1.add(getMntmTreemap());
			menu_1.add(getMntmStack());
			menu_1.add(getMntmQue());
		}
		return menu_1;
	}
	private JMenuItem getMntmProperties() {
		if (mntmProperties == null) {
			mntmProperties = new JMenuItem("Properties");
			mntmProperties.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					PropertiesFrame pf = new PropertiesFrame();
					contentPane.add(pf);
					pf.toFront();
				}
			});
			mntmProperties.setForeground(Color.WHITE);
			mntmProperties.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmProperties.setBackground(new Color(188, 143, 143));
		}
		return mntmProperties;
	}
	private JMenuItem getMntmTreeset() {
		if (mntmTreeset == null) {
			mntmTreeset = new JMenuItem("TreeSet");
			mntmTreeset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TreeSetFrame ts = new TreeSetFrame();
					contentPane.add(ts);
					ts.toFront();
				}
			});
			mntmTreeset.setForeground(Color.WHITE);
			mntmTreeset.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmTreeset.setBackground(new Color(188, 143, 143));
		}
		return mntmTreeset;
	}
	private JMenuItem getMntmStack() {
		if (mntmStack == null) {
			mntmStack = new JMenuItem("Stack");
			mntmStack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StackFrame st = new StackFrame();
					contentPane.add(st);
					st.toFront();
				}
			});
			mntmStack.setForeground(Color.WHITE);
			mntmStack.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmStack.setBackground(new Color(188, 143, 143));
		}
		return mntmStack;
	}
	private JMenuItem getMntmQue() {
		if (mntmQue == null) {
			mntmQue = new JMenuItem("Que");
			mntmQue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					QueFrame qf = new QueFrame();
					contentPane.add(qf);
					qf.toFront();
				}
			});
			mntmQue.setForeground(Color.WHITE);
			mntmQue.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmQue.setBackground(new Color(188, 143, 143));
		}
		return mntmQue;
	}
	private JMenuItem getMntmTreemap() {
		if (mntmTreemap == null) {
			mntmTreemap = new JMenuItem("TreeMap");
			mntmTreemap.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TreeMapFrame tm = new TreeMapFrame();
					contentPane.add(tm);
					tm.toFront();
				}
			});
			mntmTreemap.setForeground(Color.WHITE);
			mntmTreemap.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			mntmTreemap.setBackground(new Color(188, 143, 143));
		}
		return mntmTreemap;
	}
}
