package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MemberUpdate extends JInternalFrame {
	private JLabel lblNewLabel_1;
	private JTextField sear;
	private JButton btnNewButton;
	private JTextField pMid;
	private JTextField pName;
	private JTextField pDate;
	private JComboBox pgrade;
	private JButton btnNewButton_1;
	private JLabel status;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUpdate frame = new MemberUpdate();
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
	public MemberUpdate() {
		super("회원수정",false,true,true,true);
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 948, 655);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel_9());
		getContentPane().add(getLabel_7());
		getContentPane().add(getLabel_6());
		getContentPane().add(getLabel_5());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getLabel_4());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getSear());
		getContentPane().add(getPMid());
		getContentPane().add(getPName());
		getContentPane().add(getPDate());
		getContentPane().add(getPgrade());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getStatus());
		getContentPane().add(getLabel_8());
		setVisible(true);

	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAC80\uC0C9");
			lblNewLabel_1.setBounds(41, 75, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getSear() {
		if (sear == null) {
			sear = new JTextField();
			sear.setBounds(36, 207, 225, 45);
			sear.setColumns(10);
		}
		return sear;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u25B6");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(178, 34, 34));
			btnNewButton.setBorder(null);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDao dao = new MemberDao();
					String f = sear.getText();
					MemberVo vo = dao.search(f);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					pMid.setText(vo.getmId());
					pName.setText(vo.getmName());
					pDate.setText(sdf.format(vo.getrDate()));
					pgrade.setSelectedIndex(vo.getGrade()-1);
					
					
					
				}
			});
			btnNewButton.setBounds(208, 212, 43, 34);
		}
		return btnNewButton;
	}
	private JTextField getPMid() {
		if (pMid == null) {
			pMid = new JTextField();
			pMid.setBounds(36, 279, 225, 45);
			pMid.setColumns(10);
		}
		return pMid;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(37, 334, 224, 45);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getPDate() {
		if (pDate == null) {
			pDate = new JTextField();
			pDate.setBounds(37, 389, 224, 45);
			pDate.setColumns(10);
		}
		return pDate;
	}
	private JComboBox getPgrade() {
		if (pgrade == null) {
			pgrade = new JComboBox();
			pgrade.setForeground(new Color(192, 192, 192));
			pgrade.setBackground(new Color(255, 255, 255));
			pgrade.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
			pgrade.setBounds(76, 444, 185, 34);
			pgrade.addItem("1학년");
			pgrade.addItem("2학년");
			pgrade.addItem("3학년");
			pgrade.addItem("4학년");
			pgrade.addItem("5학년");
			pgrade.addItem("6학년");
			pgrade.addItem("7학년");
			pgrade.addItem("8학년");
			pgrade.addItem("9학년");
			pgrade.addItem("10학년");
			pgrade.setSelectedIndex(0);
		}
		return pgrade;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
					String mid = pMid.getText();
					String mName = pName.getText();
					Date mDate = sdf.parse(pDate.getText());
					int grade = pgrade.getSelectedIndex()+1;
					MemberVo vo = new MemberVo(mid,mName,mDate,grade);
					MemberDao dao = new MemberDao();
					int cnt = dao.update(vo);
					if(cnt>0) {
						status.setText("수정 되었습니다");						
					}else {
						status.setText("수정중 오류발생");
					}
					}catch(Exception ex) {
						
					}
				}
			});btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 19));
			btnNewButton_1.setBorder(null);
			btnNewButton_1.setBackground(new Color(165, 42, 42));
			btnNewButton_1.setBounds(98, 509, 76, 61);

		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setForeground(new Color(220, 20, 60));
			status.setBounds(12, 488, 300, 15);
		}
		return status;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC18C\uD658\uC0AC\uC815\uBCF4\uC218\uC815");
			label.setForeground(Color.BLACK);
			label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
			label.setBounds(33, 152, 391, 45);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\!!!!!!!.jpg"));
			label_1.setBounds(33, 29, 81, 78);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3142\u3148\u3137.jpg"));
			label_2.setBounds(197, 29, 64, 78);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\124.jpg"));
			label_3.setBounds(82, 580, 176, 51);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3147\u3147\u3147\u3147\u3147\u3147.jpg"));
			label_4.setBounds(318, -25, 618, 679);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uC544\uC774\uB514");
			label_5.setForeground(Color.LIGHT_GRAY);
			label_5.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_5.setBounds(40, 282, 53, 21);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC774\uB984");
			label_6.setForeground(Color.LIGHT_GRAY);
			label_6.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_6.setBounds(40, 338, 53, 21);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("\uC785\uD559\uC77C");
			label_7.setForeground(Color.LIGHT_GRAY);
			label_7.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_7.setBounds(40, 392, 53, 21);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("\uD559\uB144");
			label_8.setForeground(Color.LIGHT_GRAY);
			label_8.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_8.setBounds(40, 444, 53, 21);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("\uAC80\uC0C9");
			label_9.setForeground(Color.LIGHT_GRAY);
			label_9.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_9.setBounds(40, 211, 53, 21);
		}
		return label_9;
	}
}
