package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class AdminMain extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain frame = new AdminMain();
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
	public AdminMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getButton_2());
		setVisible(true);
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC74C\uC2DD \uC8FC\uBB38\uCC3D \uAD00\uB9AC");
			btnNewButton.setBounds(46, 47, 144, 144);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uD68C\uC6D0 \uAD00\uB9AC");
			button.setBounds(228, 47, 144, 144);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC74C\uC2DD \uC790\uC7AC \uAD00\uB9AC");
			button_1.setBounds(228, 228, 144, 144);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("\uCC45 \uAD00\uB9AC");
			button_2.setBounds(46, 228, 144, 144);
		}
		return button_2;
	}
}
