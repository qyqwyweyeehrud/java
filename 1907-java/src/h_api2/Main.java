package h_api2;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Main extends JPanel {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public Main() {
		setLayout(new BorderLayout(0, 0));
		add(getLblNewLabel(), BorderLayout.CENTER);

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(222, 184, 135));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\\uCE60\uD310_1_zbxldmsql12.png"));
		}
		return lblNewLabel;
	}
}
