package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FindId extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindId frame = new FindId();
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
	public FindId() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_1());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(126, 60, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(126, 91, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC774\uB984");
			lblNewLabel.setBounds(57, 63, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_1.setBounds(57, 94, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.setBounds(97, 122, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC774\uB984\uACFC \uC5F0\uB77D\uCC98\uB97C \uC870\uD68C\uD574\uBCF4\uC138\uC694");
			lblNewLabel_2.setBounds(73, 23, 177, 15);
		}
		return lblNewLabel_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(57, 157, 185, 90);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_3());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC544\uC774\uB514            \uBE44\uBC00\uBC88\uD638");
		}
		return lblNewLabel_3;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB85C\uADF8\uC778\uD558\uB7EC\uAC00\uAE30>>");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login lo = new Login();
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(57, 263, 185, 23);
		}
		return btnNewButton_1;
	}
}
