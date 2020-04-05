package k_io;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileCopy extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel label;
	private JTextField original;
	private JButton btnNewButton;
	private JTextField target;
	private JButton btnNewButton_1;
	private JProgressBar progressBar;
	private JButton btnNewButton_2;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileCopy frame = new FileCopy();
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
	public FileCopy() {
		super("ÆÄÀÏº¹»ç",false,true,true,true);
		getContentPane().setBackground(new Color(165, 42, 42));
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLabel());
		getContentPane().add(getOriginal());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getTarget());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getProgressBar());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		setBounds(100, 100, 422, 201);
		setVisible(true);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC6D0\uBCF8\uD30C\uC77C");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			lblNewLabel.setBounds(12, 28, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uB300\uC0C1\uD30C\uC77C");
			label.setForeground(new Color(255, 255, 255));
			label.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label.setBounds(12, 53, 57, 15);
		}
		return label;
	}
	private JTextField getOriginal() {
		if (original == null) {
			original = new JTextField();
			original.setBounds(81, 24, 224, 21);
			original.setColumns(10);
		}
		return original;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCC3E\uC544\uBCF4\uAE30");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					int state = fc.showOpenDialog(FileCopy.this);
					if(state == JFileChooser.APPROVE_OPTION) {//¿­±â¹öÆ°ÀÌ Å¬¸¯µÈ°æ¿ì
						original.setText(fc.getSelectedFile().getPath());
					}
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(46, 139, 87));
			btnNewButton.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton.setBounds(317, 23, 81, 23);
		}
		return btnNewButton;
	}
	private JTextField getTarget() {
		if (target == null) {
			target = new JTextField();
			target.setBounds(81, 49, 224, 21);
			target.setColumns(10);
		}
		return target;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB300\uC0C1\uD30C\uC77C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					int state = fc.showSaveDialog(FileCopy.this);
					if(state == JFileChooser.APPROVE_OPTION) {
						target.setText(fc.getSelectedFile().getPath());
					}
				}
			});
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBackground(new Color(46, 139, 87));
			btnNewButton_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton_1.setBounds(317, 48, 81, 23);
		}
		return btnNewButton_1;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setForeground(new Color(255, 215, 0));
			progressBar.setBackground(new Color(46, 139, 87));
			progressBar.setBounds(12, 78, 386, 14);
		}
		return progressBar;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uBCF5\uC0AC\uD558\uAE30");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FileCopyThread fct = new FileCopyThread(progressBar);
					fct.setOrignal(original.getText());
					fct.setTarget(target.getText());
					
					status.setText("ÆÄÀÏ º¹»çÁß........");
					try {
						fct.join();
						fct.start();
						
						status.setText("º¹»ç°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù");
					} catch (InterruptedException e1) {
					}
				}
			});
			btnNewButton_2.setForeground(new Color(255, 255, 255));
			btnNewButton_2.setBackground(new Color(46, 139, 87));
			btnNewButton_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton_2.setBounds(153, 102, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			status.setForeground(new Color(255, 215, 0));
			status.setBounds(12, 135, 386, 15);
		}
		return status;
	}
}
