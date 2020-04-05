package k_io;
//1.메모리에만 저장 -> 기존 member.dat에 추가
//2.데이터가 발생할 때 마다 member.dat에 추가

import java.awt.EventQueue;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;

public class MemberInput extends JInternalFrame {
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField mid;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JLabel status;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel ee1;
	private JLabel ee2;
	private JLabel ee3;
	private JLabel ee4;
	private JLabel ee;
	private JLabel dd;
	private JLabel dd1;
	private JLabel dd2;
	private JLabel dd3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInput frame = new MemberInput();
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
	public MemberInput() {
		super("회원입력",false,true,true,true);
		getContentPane().setBackground(new Color(245, 245, 245));
		setBounds(30, 50, 350, 350);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getMid());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getLabel());
		getContentPane().add(getLblNewLabel_7());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLblNewLabel_6());
		getContentPane().add(getEe1());
		getContentPane().add(getEe2());
		getContentPane().add(getEe3());
		getContentPane().add(getEe4());
		getContentPane().add(getLabel_3_1());
		getContentPane().add(getLabel_3_2());
		getContentPane().add(getDd2());
		getContentPane().add(getDd3());
		getContentPane().add(getEe());
		setVisible(true);
		

	}
	
	
	
	public void input(){
		String id = mid.getText();
		String p = pwd.getText();
		String n = mName.getText();
		String ph = phone.getText();
		
		boolean flag = true;
					/*
					Pattern.matches(FileExam2.idCheck, id)&&
					Pattern.matches(FileExam2.pwdCheck, p)&&
					Pattern.matches(FileExam2.nameCheck, n)&&
					Pattern.matches(FileExam2.phoneCheck, ph);
					*/
		if(!flag) {
			status.setText("데이터에 오류발생");
			return;
		}
		
		MemberVo vo = new MemberVo(id,p,n,ph);
		MemberDao dao = new MemberDao();
		boolean b =dao.insert(vo);
		
		if(b) {
			pwd.setText("");
			mName.setText("");
			phone.setText("");
		
			mid.requestFocus();
			mid.selectAll();
			status.setText("회원정보가 추가 입력된");
		}else {
			status.setText("데이터 저장중 오류발생");
		}
		
	
		
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setForeground(new Color(128, 0, 0));
			lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel.setBounds(80, 55, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_1.setForeground(new Color(128, 0, 0));
			lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(80, 80, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC774\uB984");
			lblNewLabel_2.setForeground(new Color(128, 0, 0));
			lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(80, 105, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setForeground(new Color(128, 0, 0));
			lblNewLabel_3.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(80, 130, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getMid() {
		if (mid == null) {
			mid = new JTextField();
			mid.setBorder(null);
			mid.setBackground(new Color(255, 255, 255));
			mid.setBounds(149, 52, 116, 21);
			mid.setColumns(10);
		}
		return mid;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBorder(null);
			pwd.setBounds(149, 77, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBorder(null);
			mName.setBounds(149, 102, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBorder(null);
			phone.setBounds(149, 127, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			btnNewButton.setBackground(new Color(188, 143, 143));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input();
				}
			});
			btnNewButton.setBounds(129, 166, 76, 32);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(new Color(255, 255, 255));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(188, 143, 143));
			status.setBounds(41, 208, 262, 61);
		}
		return status;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setOpaque(true);
			lblNewLabel_4.setBackground(new Color(188, 143, 143));
			lblNewLabel_4.setBounds(41, 10, 262, 5);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setOpaque(true);
			lblNewLabel_5.setBackground(new Color(188, 143, 143));
			lblNewLabel_5.setBounds(41, 10, 5, 199);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setBackground(new Color(188, 143, 143));
			lblNewLabel_6.setForeground(new Color(188, 143, 143));
			lblNewLabel_6.setOpaque(true);
			lblNewLabel_6.setBounds(298, 10, 5, 199);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setPreferredSize(new Dimension(3, 5));
			lblNewLabel_7.setOpaque(true);
			lblNewLabel_7.setBackground(new Color(188, 143, 143));
			lblNewLabel_7.setForeground(new Color(188, 143, 143));
			lblNewLabel_7.setBounds(75, 55, 3, 15);
		}
		return lblNewLabel_7;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setPreferredSize(new Dimension(3, 5));
			label.setOpaque(true);
			label.setForeground(new Color(188, 143, 143));
			label.setBackground(new Color(188, 143, 143));
			label.setBounds(75, 104, 3, 15);
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
			label_1.setBounds(75, 129, 3, 15);
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
			label_2.setBounds(75, 80, 3, 15);
		}
		return label_2;
	}
	private JLabel getEe1() {
		if (ee1 == null) {
			ee1 = new JLabel("");
			ee1.setOpaque(true);
			ee1.setBackground(new Color(128, 128, 128));
			ee1.setBounds(44, 267, 262, 5);
		}
		return ee1;
	}
	private JLabel getEe2() {
		if (ee2 == null) {
			ee2 = new JLabel("");
			ee2.setOpaque(true);
			ee2.setBackground(Color.GRAY);
			ee2.setBounds(301, 13, 5, 259);
		}
		return ee2;
	}
	private JLabel getEe3() {
		if (ee3 == null) {
			ee3 = new JLabel("");
			ee3.setOpaque(true);
			ee3.setBackground(Color.GRAY);
			ee3.setBounds(43, 10, 5, 259);
		}
		return ee3;
	}
	private JLabel getEe4() {
		if (ee4 == null) {
			ee4 = new JLabel("");
			ee4.setOpaque(true);
			ee4.setBackground(Color.GRAY);
			ee4.setBounds(41, 12, 262, 5);
		}
		return ee4;
	}
	private JLabel getEe() {
		if (ee == null) {
			ee = new JLabel("New label");
			ee.setOpaque(true);
			ee.setBackground(new Color(128, 128, 128));
			ee.setBounds(131, 168, 76, 32);
		}
		return ee;
	}
	private JLabel getLabel_3_1() {
		if (dd == null) {
			dd = new JLabel("New label");
			dd.setBackground(new Color(128, 128, 128));
			dd.setOpaque(true);
			dd.setBounds(151, 54, 116, 21);
		}
		return dd;
	}
	private JLabel getLabel_3_2() {
		if (dd1 == null) {
			dd1 = new JLabel("New label");
			dd1.setOpaque(true);
			dd1.setBackground(Color.GRAY);
			dd1.setBounds(151, 129, 116, 21);
		}
		return dd1;
	}
	private JLabel getDd2() {
		if (dd2 == null) {
			dd2 = new JLabel("New label");
			dd2.setOpaque(true);
			dd2.setBackground(Color.GRAY);
			dd2.setBounds(151, 104, 116, 21);
		}
		return dd2;
	}
	private JLabel getDd3() {
		if (dd3 == null) {
			dd3 = new JLabel("New label");
			dd3.setOpaque(true);
			dd3.setBackground(Color.GRAY);
			dd3.setBounds(151, 79, 116, 21);
		}
		return dd3;
	}
}
