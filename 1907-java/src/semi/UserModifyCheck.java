package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserModifyCheck extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_1;
	private JLabel label_2;
	private JButton btnNewButton;
	private JLabel status;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModifyCheck frame = new UserModifyCheck();
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
	public UserModifyCheck() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getStatus());
		contentPane.add(getBtnNewButton_1());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC544\uC774\uB514\uC640 \uBE44\uBC00\uBC88\uD638 \uD655\uC778");
			label.setBounds(146, 33, 143, 15);
		}
		return label;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(173, 59, 116, 21);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(173, 90, 116, 21);
		}
		return textField_1;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC544\uC774\uB514");
			label_1.setBounds(87, 61, 57, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			label_2.setBounds(87, 86, 57, 15);
		}
		return label_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC77C\uCE58 \uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean is_admin = false;
					if(is_admin) {
						status.setText("아이디또는 비밀번호가 일치하지 않습니다");
					}
					else {
						
						UserModifyCheck2 um = new UserModifyCheck2();
						
						setVisible(false);
					}
					
				}
			});
			btnNewButton.setBounds(151, 121, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBounds(173, 156, 57, 15);
		}
		return status;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserMain um = new UserMain();
				}
			});
			btnNewButton_1.setBounds(12, 10, 97, 23);
		}
		return btnNewButton_1;
	}
}
