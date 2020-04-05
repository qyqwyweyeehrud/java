package h_api;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;


public class SimpleDateExam extends JInternalFrame {
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleDateExam frame = new SimpleDateExam();
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
	public SimpleDateExam() {
		super("Simple Date Format",false,true,true,true);
		setVisible(true);
		setBounds(100, 100, 360, 322);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());

	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC624\uB298\uB0A0\uC9DC");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Date now = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)¿äÀÏ hh:mm:ss");
					
					status.setText(sdf.format(now));
					
				}
			});
			btnNewButton.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton.setBounds(12, 10, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 25));
			status.setBounds(12, 52, 320, 87);
		}
		return status;
	}
}
