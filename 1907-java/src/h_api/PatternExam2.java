package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class PatternExam2 extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField pw;
	private JTextField mName;
	private JTextField phone;
	private JTextField eMail;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField zip;
	private JButton btnNewButton;
	private JLabel status;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatternExam2 frame = new PatternExam2();
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
	public PatternExam2() {
		setTitle("\uD68C\uC6D0\uAC00\uC785Pattern chek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getId());
		contentPane.add(getPw());
		contentPane.add(getMName());
		contentPane.add(getPhone());
		contentPane.add(getEMail());
		contentPane.add(getZip());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getBtnNewButton());
		contentPane.add(getStatus());
		contentPane.add(getLblNewLabel_6());
	}
	
	public void Check() {
		String value;
		String regexp;
		status.setText("");
		
		if(!eMail.getText().equals("") || !id.getText().equals("") ||!pw.getText().equals("") || !phone.getText().equals("") || !mName.getText().equals("") ||!zip.getText().equals("")) {
		
		//이메일
		regexp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		value = eMail.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("이메일이 오류입니다");
			eMail.requestFocus();
			eMail.selectAll();
		}
		
		//아이디
		regexp = "[\\w+!$]{4,10}";
		regexp = "[\\w+](?=.*[!$_]).{3,9}";//기호를 반드시 포함시켜야한다면// .안에 소괄호를 무조건포함시켜라 //([\\w+])3자리,  (?=.*[!$_]).1자리
		value = id.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("아이디가 오류입니다");
			id.requestFocus();
			id.selectAll();
		}
		
		//암호
		regexp = "[\\w+!$]{4,10}";
		value = pw.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("암호 오류입니다");
			pw.requestFocus();
			pw.selectAll();
		}
		
		//연락처
		regexp = "(010|02|031|032|032|033|034|035)-\\d{3,4}-\\d{4}";
		value = phone.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("연락처 오류 입니다");
			phone.requestFocus();
			phone.selectAll();
		}
		
		//성명
		regexp = "[가-휗]{2,10}";
		value = mName.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("성명 오류입니다");
			mName.requestFocus();
			mName.selectAll();
		}
		
		//우편번호
		regexp = "\\d{3}-\\d{3}";
		value = zip.getText();
		if(!Pattern.matches(regexp, value)) {
			status.setText("우편번호 오류입니다");
			zip.requestFocus();
			zip.selectAll();
			
		}
		
	}else {
		status.setText("공백이 있습니다");
	}
	}

	private JTextField getId() {
		if (id == null) {
			id = new JTextField();
			id.setText("wqeq!_3");
			id.setBounds(155, 25, 110, 21);
			id.setColumns(10);
		}
		return id;
	}
	private JTextField getPw() {
		if (pw == null) {
			pw = new JTextField();
			pw.setText("eeee");
			pw.setBounds(155, 56, 110, 21);
			pw.setColumns(10);
		}
		return pw;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setText("\uAE40\uB3C4\uACBD");
			mName.setBounds(155, 87, 110, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setText("010-2437-5566");
			phone.setBounds(155, 118, 110, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JTextField getEMail() {
		if (eMail == null) {
			eMail = new JTextField();
			eMail.setText("ehrud129@naver.com");
			eMail.setBounds(155, 149, 177, 21);
			eMail.setColumns(10);
		}
		return eMail;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel.setBounds(86, 28, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uBA85");
			lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(86, 90, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(86, 121, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC774\uBA54\uC77C");
			lblNewLabel_3.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(86, 152, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC6B0\uD3B8\uBC88\uD638");
			lblNewLabel_4.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_4.setBounds(86, 183, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC554\uD638");
			lblNewLabel_5.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			lblNewLabel_5.setBounds(86, 59, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getZip() {
		if (zip == null) {
			zip = new JTextField();
			zip.setText("111-111");
			zip.setBounds(155, 180, 177, 21);
			zip.setColumns(10);
		}
		return zip;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCCB4\uD06C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Check();
				}
			});
			btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			btnNewButton.setBounds(165, 211, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(Color.BLACK);
			status.setForeground(Color.ORANGE);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
			status.setBounds(86, 259, 246, 50);
		}
		return status;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg"));
			lblNewLabel_6.setBounds(275, 25, 57, 114);
		}
		return lblNewLabel_6;
	}
}
