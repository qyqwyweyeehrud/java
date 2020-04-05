package J_collection;

import java.awt.EventQueue;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MemberModify extends JInternalFrame {
	List<MemberVo> list;
	private JTextField mid;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
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
	private JLabel label_10;
	private JLabel status;
	private JButton button;
	private JButton button_1;
	private JButton btnNewButton;
	int index = -1;//못찾은경우가 -1
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel ww;
	private JLabel we;
	private JLabel we2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberModify frame = new MemberModify();
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
	public MemberModify() {
		super("수정,삭제",false,true,true,true);
		setVisible(true);
		setBounds(380, 50, 350, 350);
		getContentPane().setLayout(null);
		getContentPane().add(getMid());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getLabel_4());
		getContentPane().add(getLabel_5());
		getContentPane().add(getLabel_6());
		getContentPane().add(getLabel_7());
		getContentPane().add(getLabel_8());
		getContentPane().add(getLabel_9());
		getContentPane().add(getLabel_10());
		getContentPane().add(getStatus());
		getContentPane().add(getButton());
		getContentPane().add(getButton_1());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getLabel_11());
		getContentPane().add(getLabel_12());
		getContentPane().add(getLabel_13());
		getContentPane().add(getLabel_14());
		getContentPane().add(getLabel_15());
		getContentPane().add(getLabel_17());
		getContentPane().add(getLabel_18());
		getContentPane().add(getLabel_19());
		getContentPane().add(getWw());
		getContentPane().add(getWe());
		getContentPane().add(getWe2());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());

	}
	
	public MemberModify(List<MemberVo> list) {
		this();
		this.list = list;
		
	}
	
	public void Search() {//검색
		index = -1;//못찾은경우가 -1
		pwd.setText("");
		mName.setText("");
		phone.setText("");
		
		String find = mid.getText();//굳이 담을필요는없지만 단순한변수명으로 설정
		for(int i = 0;i<list.size();i++) {//데이터의 건수만큼 돌면서 
			MemberVo vo = list.get(i);//i라는 값을 vo에 담음
			if(vo.getMid().equals(find)) {//입력한 이름과 vo의 이름이 일치한다면
				index = i;
				break;
			}
		}
			if(index>=0) {
				MemberVo vo = list.get(index);//index번째 vo를 가져와서
				pwd.setText(vo.getPwd());
				mName.setText(vo.getmName());
				phone.setText(vo.getPhone());
				
				status.setForeground(Color.WHITE);
				status.setText(vo.getmName()+"의 정보를 찾았습니다");
			}else {
				status.setForeground(Color.RED);
				status.setText(find +"의 자료가 없습니다");
				mid.requestFocus();
				mid.selectAll();
			}
	}
	public void Modify() {//수정
		
		
		if(index >= 0) {
			String id = mid.getText();
			String p = pwd.getText();
			String n = mName.getText();
			String ph = phone.getText();
			
			
			boolean flag = Pattern.matches(MemberMain.idCheck,id)&&
							Pattern.matches(MemberMain.pwdCheck,p)&&
							Pattern.matches(MemberMain.nameCheck,n)&&
							Pattern.matches(MemberMain.phoneCheck,ph);
			
			if(flag) {//flag가 참이라면
				MemberVo vo = new MemberVo(id,p,n,ph);
				list.set(index, vo);
				
				status.setText("수정되었습니다");
				}
			}
		
		
		
		
		
	}
	public void Delete() {//삭제
		if(index >= 0) {
			list.remove(index);
			
			status.setText("자료가 삭제되었습니다");
			
			index = -1;
			pwd.setText("");
			mName.setText("");
			phone.setText("");
			
			mid.requestFocus();
			mid.selectAll();
		}else {
			status.setText("먼저 검색해 주세요");
		}
	}
	

	private JTextField getMid() {
		if (mid == null) {
			mid = new JTextField();
			mid.setBorder(null);
			mid.setColumns(10);
			mid.setBounds(124, 65, 74, 21);
		}
		return mid;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBorder(null);
			pwd.setColumns(10);
			pwd.setBounds(124, 90, 133, 21);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBorder(null);
			mName.setColumns(10);
			mName.setBounds(124, 115, 133, 21);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBorder(null);
			phone.setColumns(10);
			phone.setBounds(124, 140, 133, 21);
		}
		return phone;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setPreferredSize(new Dimension(3, 5));
			label.setOpaque(true);
			label.setForeground(new Color(188, 143, 143));
			label.setBackground(new Color(188, 143, 143));
			label.setBounds(67, 68, 3, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setPreferredSize(new Dimension(3, 5));
			label_1.setOpaque(true);
			label_1.setForeground(new Color(188, 143, 143));
			label_1.setBackground(new Color(188, 143, 143));
			label_1.setBounds(67, 93, 3, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("New label");
			label_2.setPreferredSize(new Dimension(3, 5));
			label_2.setOpaque(true);
			label_2.setForeground(new Color(188, 143, 143));
			label_2.setBackground(new Color(188, 143, 143));
			label_2.setBounds(67, 117, 3, 15);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("New label");
			label_3.setPreferredSize(new Dimension(3, 5));
			label_3.setOpaque(true);
			label_3.setForeground(new Color(188, 143, 143));
			label_3.setBackground(new Color(188, 143, 143));
			label_3.setBounds(67, 142, 3, 15);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC5F0\uB77D\uCC98");
			label_4.setForeground(new Color(128, 0, 0));
			label_4.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_4.setBounds(72, 143, 57, 15);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uC774\uB984");
			label_5.setForeground(new Color(128, 0, 0));
			label_5.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_5.setBounds(72, 118, 57, 15);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			label_6.setForeground(new Color(128, 0, 0));
			label_6.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_6.setBounds(72, 93, 57, 15);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("\uC544\uC774\uB514");
			label_7.setForeground(new Color(128, 0, 0));
			label_7.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_7.setBounds(72, 68, 57, 15);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("");
			label_8.setOpaque(true);
			label_8.setBackground(new Color(188, 143, 143));
			label_8.setBounds(33, 23, 5, 199);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("");
			label_9.setOpaque(true);
			label_9.setBackground(new Color(188, 143, 143));
			label_9.setBounds(33, 23, 262, 5);
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("");
			label_10.setOpaque(true);
			label_10.setForeground(new Color(188, 143, 143));
			label_10.setBackground(new Color(188, 143, 143));
			label_10.setBounds(290, 23, 5, 199);
		}
		return label_10;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(Color.WHITE);
			status.setBackground(new Color(188, 143, 143));
			status.setBounds(33, 221, 262, 61);
		}
		return status;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC218\uC815");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Modify();
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			button.setBackground(new Color(188, 143, 143));
			button.setBounds(67, 171, 76, 32);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC0AD\uC81C");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Delete();
				}
			});
			button_1.setForeground(Color.WHITE);
			button_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			button_1.setBackground(new Color(188, 143, 143));
			button_1.setBounds(181, 171, 76, 32);
		}
		return button_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Search();
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(188, 143, 143));
			btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			btnNewButton.setBounds(202, 65, 56, 21);
		}
		return btnNewButton;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("");
			label_11.setOpaque(true);
			label_11.setForeground(new Color(188, 143, 143));
			label_11.setBackground(new Color(188, 143, 143));
			label_11.setBounds(290, 23, 5, 199);
		}
		return label_11;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("");
			label_12.setOpaque(true);
			label_12.setBackground(Color.GRAY);
			label_12.setBounds(36, 280, 262, 5);
		}
		return label_12;
	}
	private JLabel getLabel_13() {
		if (label_13 == null) {
			label_13 = new JLabel("");
			label_13.setOpaque(true);
			label_13.setBackground(Color.GRAY);
			label_13.setBounds(293, 26, 5, 259);
		}
		return label_13;
	}
	private JLabel getLabel_14() {
		if (label_14 == null) {
			label_14 = new JLabel("");
			label_14.setOpaque(true);
			label_14.setBackground(Color.GRAY);
			label_14.setBounds(35, 23, 5, 259);
		}
		return label_14;
	}
	private JLabel getLabel_15() {
		if (label_15 == null) {
			label_15 = new JLabel("");
			label_15.setOpaque(true);
			label_15.setBackground(Color.GRAY);
			label_15.setBounds(33, 25, 262, 5);
		}
		return label_15;
	}
	private JLabel getLabel_17() {
		if (label_17 == null) {
			label_17 = new JLabel("New label");
			label_17.setOpaque(true);
			label_17.setBackground(Color.GRAY);
			label_17.setBounds(126, 142, 133, 21);
		}
		return label_17;
	}
	private JLabel getLabel_18() {
		if (label_18 == null) {
			label_18 = new JLabel("New label");
			label_18.setOpaque(true);
			label_18.setBackground(Color.GRAY);
			label_18.setBounds(126, 117, 133, 21);
		}
		return label_18;
	}
	private JLabel getLabel_19() {
		if (label_19 == null) {
			label_19 = new JLabel("New label");
			label_19.setOpaque(true);
			label_19.setBackground(Color.GRAY);
			label_19.setBounds(126, 92, 133, 21);
		}
		return label_19;
	}
	private JLabel getWw() {
		if (ww == null) {
			ww = new JLabel("New label");
			ww.setBackground(new Color(128, 128, 128));
			ww.setOpaque(true);
			ww.setBounds(126, 67, 74, 21);
		}
		return ww;
	}
	private JLabel getWe() {
		if (we == null) {
			we = new JLabel("New label");
			we.setBackground(new Color(128, 128, 128));
			we.setOpaque(true);
			we.setBounds(69, 173, 76, 32);
		}
		return we;
	}
	private JLabel getWe2() {
		if (we2 == null) {
			we2 = new JLabel("New label");
			we2.setBackground(new Color(128, 128, 128));
			we2.setOpaque(true);
			we2.setBounds(183, 173, 76, 32);
		}
		return we2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBackground(new Color(128, 128, 128));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBounds(204, 67, 56, 21);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(0, -2, 334, 323);
		}
		return lblNewLabel_1;
	}
}
