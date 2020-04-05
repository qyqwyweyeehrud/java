package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserModifyCheck2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton button;
	private JButton btnNewButton_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModifyCheck2 frame = new UserModifyCheck2();
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
	public UserModifyCheck2() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getStatus());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC218\uC815 \uD558\uACA0\uC2B5\uB2C8\uAE4C \uC0AD\uC81C \uD558\uACA0\uC2B5\uB2C8\uAE4C?");
			lblNewLabel.setBounds(119, 29, 259, 15);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserModify um = new UserModify();
				}
			});
			btnNewButton.setBounds(59, 54, 97, 87);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC0AD\uC81C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					DeleteFinish df = new DeleteFinish();
				}
			});
			button.setBounds(231, 54, 97, 87);
		}
		return button;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB4A4\uB85C\uAC00\uAE30");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserModifyCheck um = new UserModifyCheck();
				}
			});
			btnNewButton_1.setBounds(12, 10, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBounds(73, 199, 255, 15);
		}
		return status;
	}
}
