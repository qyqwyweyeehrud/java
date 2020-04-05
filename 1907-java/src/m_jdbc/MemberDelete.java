package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class MemberDelete extends JInternalFrame {
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JButton button;
	private JTextField sear;
	private JTextField pId;
	private JTextField pName;
	private JTextField pDate;
	private JComboBox pGrade;
	private JButton button_1;
	private JLabel status;
	private JLabel label_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberDelete frame = new MemberDelete();
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
	public MemberDelete() {
		super("회원삭제",false,true,true,true);
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 948, 661);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel_7());
		getContentPane().add(getLabel_1_1());
		getContentPane().add(getLabel_2_1());
		getContentPane().add(getLabel_3_1());
		getContentPane().add(getLabel_4_1());
		getContentPane().add(getLabel_5_1());
		getContentPane().add(getLabel_6_1());
		getContentPane().add(getLabel_7_1());
		getContentPane().add(getLabel_8());
		getContentPane().add(getButton_2());
		getContentPane().add(getTextField_4());
		getContentPane().add(getTextField_1_1());
		getContentPane().add(getTextField_2_1());
		getContentPane().add(getTextField_3_1());
		getContentPane().add(getComboBox_1());
		getContentPane().add(getButton_1_1());
		getContentPane().add(getStatus());
		getContentPane().add(getLabel_11());
		setVisible(true);

	}
	private JLabel getLabel_7() {
		if (label == null) {
			label = new JLabel("\uAC80\uC0C9");
			label.setForeground(Color.LIGHT_GRAY);
			label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label.setBounds(40, 201, 53, 21);
		}
		return label;
	}
	private JLabel getLabel_1_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC785\uD559\uC77C");
			label_1.setForeground(Color.LIGHT_GRAY);
			label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_1.setBounds(40, 382, 53, 21);
		}
		return label_1;
	}
	private JLabel getLabel_2_1() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC774\uB984");
			label_2.setForeground(Color.LIGHT_GRAY);
			label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_2.setBounds(40, 328, 53, 21);
		}
		return label_2;
	}
	private JLabel getLabel_3_1() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC544\uC774\uB514");
			label_3.setForeground(Color.LIGHT_GRAY);
			label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_3.setBounds(40, 272, 53, 21);
		}
		return label_3;
	}
	private JLabel getLabel_4_1() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC18C\uD658\uC0AC\uC815\uBCF4\uC0AD\uC81C");
			label_4.setForeground(Color.BLACK);
			label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
			label_4.setBounds(33, 142, 391, 45);
		}
		return label_4;
	}
	private JLabel getLabel_5_1() {
		if (label_5 == null) {
			label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\!!!!!!!.jpg"));
			label_5.setBounds(33, 19, 81, 78);
		}
		return label_5;
	}
	private JLabel getLabel_6_1() {
		if (label_6 == null) {
			label_6 = new JLabel("");
			label_6.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3142\u3148\u3137.jpg"));
			label_6.setBounds(197, 19, 64, 78);
		}
		return label_6;
	}
	private JLabel getLabel_7_1() {
		if (label_7 == null) {
			label_7 = new JLabel("");
			label_7.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\124.jpg"));
			label_7.setBounds(82, 570, 176, 51);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("");
			label_8.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3147\u3147\u3147\u3147\u3147\u3147.jpg"));
			label_8.setBounds(318, -35, 618, 679);
		}
		return label_8;
	}
	private JButton getButton_2() {
		if (button == null) {
			button = new JButton("\u25B6");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String find = sear.getText();
					MemberDao dao = new MemberDao();
					
					MemberVo vo = dao.search(find);
					pId.setText(vo.getmId());
					pName.setText(vo.getmName());
					pDate.setText(sdf.format(vo.getrDate()));
					pGrade.setSelectedIndex(vo.getGrade()-1);
					
				}
			});
			button.setForeground(Color.WHITE);
			button.setBorder(null);
			button.setBackground(new Color(178, 34, 34));
			button.setBounds(208, 202, 43, 34);
		}
		return button;
	}
	private JTextField getTextField_4() {
		if (sear == null) {
			sear = new JTextField();
			sear.setColumns(10);
			sear.setBounds(36, 197, 225, 45);
		}
		return sear;
	}
	private JTextField getTextField_1_1() {
		if (pId == null) {
			pId = new JTextField();
			pId.setColumns(10);
			pId.setBounds(36, 269, 225, 45);
		}
		return pId;
	}
	private JTextField getTextField_2_1() {
		if (pName == null) {
			pName = new JTextField();
			pName.setColumns(10);
			pName.setBounds(37, 324, 224, 45);
		}
		return pName;
	}
	private JTextField getTextField_3_1() {
		if (pDate == null) {
			pDate = new JTextField();
			pDate.setColumns(10);
			pDate.setBounds(37, 379, 224, 45);
		}
		return pDate;
	}
	private JComboBox getComboBox_1() {
		if (pGrade == null) {
			pGrade = new JComboBox();
			pGrade.setForeground(Color.LIGHT_GRAY);
			pGrade.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
			pGrade.setBackground(Color.WHITE);
			pGrade.setBounds(76, 434, 185, 34);
			pGrade.addItem("1학년");
			pGrade.addItem("2학년");
			pGrade.addItem("3학년");
			pGrade.addItem("4학년");
			pGrade.addItem("5학년");
			pGrade.addItem("6학년");
			pGrade.addItem("7학년");
			pGrade.addItem("8학년");
			pGrade.addItem("9학년");
			pGrade.addItem("10학년");
			pGrade.setSelectedIndex(0);
			
		}
		return pGrade;
	}
	private JButton getButton_1_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC0AD\uC81C");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String mId = pId.getText();
					MemberDao dao = new MemberDao();
					int r = dao.delete(mId);
					if(r>0) {
						status.setText("삭제완료");
					}else {
						status.setText("삭제중 오류발생");
					}
				}
			});
			button_1.setForeground(Color.WHITE);
			button_1.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 19));
			button_1.setBorder(null);
			button_1.setBackground(new Color(165, 42, 42));
			button_1.setBounds(98, 499, 76, 61);
		}
		return button_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(220, 20, 60));
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setBounds(12, 478, 282, 15);
		}
		return status;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("\uD559\uB144");
			label_11.setForeground(Color.LIGHT_GRAY);
			label_11.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_11.setBounds(40, 434, 53, 21);
		}
		return label_11;
	}
}
