package semi;
//회원 메인 프레임
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserMain extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMain frame = new UserMain();
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
	public UserMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton_1());
		setVisible(true);
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC74C\uC2DD\uC8FC\uBB38");
			btnNewButton.setBounds(93, 75, 123, 119);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uB3C4\uC11C \uAC80\uC0C9");
			button.setBounds(270, 75, 123, 119);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815 \uC0AD\uC81C");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModifyCheck um = new UserModifyCheck();
					um.toFront();
				}
			});
			button_1.setBounds(180, 227, 123, 119);
		}
		return button_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0\uC774\uB984 \uB4E4\uC5B4\uAC08\uACF3");
			lblNewLabel.setBounds(411, 10, 116, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC785\uC7A5\uC2DC\uAC04 \uB4E4\uC5B4\uAC08\uACF3");
			lblNewLabel_1.setBounds(411, 35, 116, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					
					Login log = new Login();
				}
			});
			btnNewButton_1.setBounds(430, 406, 97, 23);
		}
		return btnNewButton_1;
	}
}
