package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StringExam extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public void Lengh() {
		String msg ="";
		String ssn = textField.getText(); // = textArea.append(msg);
		char a = ssn.charAt(7);
		msg += "문자열의 길이:"+ssn.length()+"\n";
		
		String firstNum = ssn.substring(0, 6);
		msg += "생년월일:"+firstNum+"\n";
		
		if(a=='1'||a=='3') {//msg += "성별:" + ((c%2==0) "여자" : "남자" ); 캐릭터도 정수형이기 때문에 계산가능하다
			msg += "성별:남자";
		}else if(a=='2'||a=='4') {
			msg += "성별:여자";
		}else {
			msg += "돌연변이";
		}
		
		textArea.setText(msg);
		
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringExam frame = new StringExam();
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
	public StringExam() {
		setTitle("\uBB38\uC790\uC5F4Exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel());
		contentPane.add(getScrollPane());
	}
	private JTextField getTextField_1() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(84, 36, 261, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uD655\uC778");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Lengh();
				}
			});
			btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			btnNewButton.setBounds(357, 36, 65, 27);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC8FC\uBBFC\uBC88\uD638");
			lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 15));
			lblNewLabel.setBounds(12, 39, 74, 19);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 72, 410, 179);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		}
		return textArea;
	}
}
