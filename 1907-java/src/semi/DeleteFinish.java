package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteFinish extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteFinish frame = new DeleteFinish();
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
	public DeleteFinish() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 180, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getButton());
		contentPane.add(getLabel());
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uCD08\uAE30\uD654\uBA74\uC73C\uB85C>>");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FirstFrame ff = new FirstFrame();
					setVisible(false);
				}
			});
			button.setBounds(15, 56, 121, 23);
		}
		return button;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC0AD\uC81C\uAC00 \uC644\uB8CC \uB418\uC5C8\uC2B5\uB2C8\uB2E4");
			label.setBounds(12, 10, 186, 15);
		}
		return label;
	}
}
