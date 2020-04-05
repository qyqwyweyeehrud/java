package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Aa extends JInternalFrame {
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aa frame = new Aa();
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
	public Aa() {
		super("гого",false,true,true,true);
		setBounds(100, 100, 518, 648);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		setVisible(true);

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\1500202093_tumblr_ogpgutFlCv1tvo2c3o1_540.gif"));
			lblNewLabel.setBounds(0, -13, 572, 639);
		}
		return lblNewLabel;
	}
}
