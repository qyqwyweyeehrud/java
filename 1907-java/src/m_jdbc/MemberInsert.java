package m_jdbc;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberInsert extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField pId;
	private JTextField pName;
	private JTextField pDate;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel status;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInsert frame = new MemberInsert();
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
	public MemberInsert() {
		super("회원입력",false,true,true,true);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 940, 654);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getPId());
		getContentPane().add(getPName());
		getContentPane().add(getPDate());
		getContentPane().add(getComboBox());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getStatus());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		setVisible(true);

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC18C\uD658\uC0AC\uC815\uBCF4\uC785\uB825");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBounds(32, 169, 391, 45);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			lblNewLabel_1.setForeground(new Color(192, 192, 192));
			lblNewLabel_1.setBounds(35, 240, 53, 21);
		}
		return lblNewLabel_1;
	}
	private JTextField getPId() {
		if (pId == null) {
			pId = new JTextField();
			pId.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			pId.setBounds(32, 238, 225, 45);
			pId.setColumns(10);
		}
		return pId;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			pName.setBounds(32, 293, 225, 45);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getPDate() {
		if (pDate == null) {
			pDate = new JTextField();
			pDate.setForeground(new Color(192, 192, 192));
			pDate.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			pDate.setHorizontalAlignment(SwingConstants.CENTER);
			pDate.setBounds(32, 348, 225, 45);
			pDate.setColumns(10);
			Date nal = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String d = sdf.format(nal);
			pDate.setText(d);
		}
		return pDate;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setForeground(new Color(192, 192, 192));
			comboBox.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 14));
			comboBox.setBackground(new Color(255, 255, 255));
			comboBox.setBounds(65, 403, 192, 36);
			comboBox.addItem("1학년");
			comboBox.addItem("2학년");
			comboBox.addItem("3학년");
			comboBox.addItem("4학년");
			comboBox.addItem("5학년");
			comboBox.addItem("6학년");
			comboBox.addItem("7학년");
			comboBox.addItem("8학년");
			comboBox.addItem("9학년");
			comboBox.addItem("10학년");
			comboBox.setSelectedIndex(0);
		}
		return comboBox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u25B6");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String mId = pId.getText();
					String mName = pName.getText();
					Date mDate = sdf.parse(pDate.getText());
					int grade = comboBox.getSelectedIndex()+1;
					MemberVo vo = new MemberVo(mId,mName,mDate,grade);
					MemberDao dao = new MemberDao();
					int r = dao.insert(vo);
					if(r>0) {
						status.setText("입력 되었습니다");
					}else {
						status.setText("입력중 오류발생");
					}
					}catch(Exception ex) {
						
					}
					
				}
			});
			btnNewButton.setBorder(null);
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(165, 42, 42));
			btnNewButton.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 30));
			btnNewButton.setIcon(null);
			btnNewButton.setBounds(103, 477, 73, 61);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(220, 20, 60));
			status.setBounds(35, 568, 225, 15);
		}
		return status;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC774\uB984");
			label.setForeground(new Color(192, 192, 192));
			label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label.setBounds(35, 295, 73, 21);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uB4F1\uB85D\uC77C");
			label_1.setForeground(new Color(192, 192, 192));
			label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_1.setBounds(35, 349, 64, 21);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uD559\uB144");
			label_2.setForeground(new Color(192, 192, 192));
			label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_2.setBounds(35, 403, 53, 21);
		}
		return label_2;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\!!!!!!!.jpg"));
			lblNewLabel_2.setBounds(32, 28, 81, 78);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3142\u3148\u3137.jpg"));
			lblNewLabel_3.setBounds(196, 28, 64, 78);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\124.jpg"));
			lblNewLabel_4.setBounds(81, 579, 176, 51);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\u3147\u3147\u3147\u3147\u3147\u3147.jpg"));
			lblNewLabel_5.setBounds(317, -26, 618, 679);
		}
		return lblNewLabel_5;
	}
}
