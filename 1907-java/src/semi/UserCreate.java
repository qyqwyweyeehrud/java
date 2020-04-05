package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class UserCreate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_2;
	private JLabel status;
	private JLabel label;
	private JTextField textField_4;
	private JLabel label_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton radioButton;
	private JTextField textField_5;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCreate frame = new UserCreate();
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
	public UserCreate() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getStatus());
		contentPane.add(getLabel());
		contentPane.add(getTextField_4());
		contentPane.add(getLabel_1());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRadioButton());
		contentPane.add(getTextField_5());
		contentPane.add(getLabel_2());
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(174, 113, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(88, 116, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_1.setBounds(88, 160, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC774\uB984");
			lblNewLabel_2.setBounds(88, 207, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBounds(88, 250, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(174, 157, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(174, 204, 116, 21);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(174, 247, 116, 21);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC911\uBCF5 \uD655\uC778");
			btnNewButton.setBounds(302, 112, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uAC00\uC785");
			btnNewButton_1.setBounds(148, 442, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD68C\uC6D0\uAC00\uC785");
			lblNewLabel_4.setBounds(174, 35, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uB85C\uADF8\uC778 \uD558\uB7EC\uAC00\uAE30>");
			lblNewLabel_5.setBounds(209, 558, 133, 15);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Go");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Login log = new Login();
				}
			});
			btnNewButton_2.setBounds(325, 554, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uAC00\uC785\uC774 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4");
			status.setBounds(133, 419, 311, 15);
		}
		return status;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
			label.setBounds(88, 297, 57, 15);
		}
		return label;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(174, 294, 116, 21);
		}
		return textField_4;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC131\uBCC4");
			label_1.setBounds(88, 343, 57, 15);
		}
		return label_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("\uB0A8");
			rdbtnNewRadioButton.setBounds(174, 339, 46, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRadioButton() {
		if (radioButton == null) {
			radioButton = new JRadioButton("\uC5EC");
			radioButton.setBounds(244, 339, 46, 23);
		}
		return radioButton;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(174, 388, 116, 21);
		}
		return textField_5;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uAC00\uC785\uC77C");
			label_2.setBounds(88, 391, 57, 15);
		}
		return label_2;
	}
}
