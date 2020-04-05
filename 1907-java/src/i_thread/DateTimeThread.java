package i_thread;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DateTimeThread extends JFrame {
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel labelTime;
	private JLabel labelTime2;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateTimeThread frame = new DateTimeThread();
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
	public DateTimeThread() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPanel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLabelTime2());
		
		WatchThread dtt = new WatchThread(labelTime2);
		dtt.setDaemon(true);
		dtt.start();
	
		
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC2DC\uACC4");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 24));
			lblNewLabel.setBounds(12, 10, 573, 23);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC2A4\uD1B1\uC640\uCE58");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(12, 125, 573, 39);
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel() {
		//JPanel panel = new StopnWatchThread();
		if (panel == null) {
			panel = new StopWatchThread();
			panel.setBackground(new Color(178, 34, 34));
			//panel = new JPanel();
			panel.setBounds(12, 160, 573, 80);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2DC\uC791");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton.setBackground(new Color(165, 42, 42));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					StopWatchThread st = (StopWatchThread)panel;//ÀÚ½ÄÀÌ È®ÀåÇÑ°Å¶ó¼­ Ä³½ºÆÃÇØ¾ßÇÔ
					st.stop=false;
					Thread t = new Thread(st);
					t.setDaemon(true);
					t.start();
				}
			});
			btnNewButton.setBounds(12, 250, 280, 40);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC815\uC9C0");
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton_1.setBackground(new Color(165, 42, 42));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					StopWatchThread st = (StopWatchThread)panel;
					st.stop=true;
				}
			});
			btnNewButton_1.setBounds(304, 250, 281, 40);
		}
		return btnNewButton_1;
	}
	
	private JLabel getLabelTime2() {
		if (labelTime2 == null) {
			labelTime2 = new JLabel("");
			labelTime2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
			labelTime2.setHorizontalAlignment(SwingConstants.CENTER);
			labelTime2.setForeground(new Color(255, 215, 0));
			labelTime2.setOpaque(true);
			labelTime2.setBackground(new Color(0, 0, 128));
			labelTime2.setBounds(12, 35, 573, 80);
		}
		return labelTime2;
	}
}
