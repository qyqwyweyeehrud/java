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
import javax.swing.JRadioButton;

public class UserModify extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel status;
	private JButton btnNewButton_2;
	private JLabel label;
	private JTextField textField_4;
	private JLabel label_1;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JTextField textField_5;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModify frame = new UserModify();
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
	public UserModify() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getStatus());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getLabel());
		contentPane.add(getTextField_4());
		contentPane.add(getLabel_1());
		contentPane.add(getRadioButton());
		contentPane.add(getRadioButton_1());
		contentPane.add(getTextField_5());
		contentPane.add(getLabel_2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(77, 87, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_1.setBounds(77, 130, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD3F0\uBC88\uD638");
			lblNewLabel_2.setBounds(77, 214, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC774\uB984");
			lblNewLabel_3.setBounds(77, 176, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(161, 84, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(161, 127, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(161, 173, 116, 21);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(161, 211, 116, 21);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815\uD558\uAE30");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					status.setText("수정완료 ");
				}
			});
			btnNewButton.setBounds(150, 422, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserModifyCheck2 um = new UserModifyCheck2();
				}
			});
			btnNewButton_1.setBounds(12, 10, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC218\uC815\uC644\uB8CC");
			status.setBounds(220, 544, 57, 15);
		}
		return status;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uCD08\uAE30\uD654\uBA74\uC73C\uB85C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserMain um = new UserMain();
				}
			});
			btnNewButton_2.setBounds(306, 540, 116, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
			label.setBounds(75, 265, 57, 15);
		}
		return label;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(161, 262, 116, 21);
		}
		return textField_4;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC131\uBCC4");
			label_1.setBounds(75, 311, 57, 15);
		}
		return label_1;
	}
	private JRadioButton getRadioButton() {
		if (radioButton == null) {
			radioButton = new JRadioButton("\uB0A8");
			radioButton.setBounds(161, 307, 46, 23);
		}
		return radioButton;
	}
	private JRadioButton getRadioButton_1() {
		if (radioButton_1 == null) {
			radioButton_1 = new JRadioButton("\uC5EC");
			radioButton_1.setBounds(231, 307, 46, 23);
		}
		return radioButton_1;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setOpaque(false);
			textField_5.setColumns(10);
			textField_5.setBounds(161, 356, 116, 21);
		}
		return textField_5;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uAC00\uC785\uC77C");
			label_2.setBounds(75, 359, 57, 15);
		}
		return label_2;
	}
}
