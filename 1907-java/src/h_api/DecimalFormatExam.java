package h_api;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class DecimalFormatExam extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecimalFormatExam frame = new DecimalFormatExam();
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
	public DecimalFormatExam() {
		super("Decimal Format",true,true,true,true);//ºÎ¸ðÀÇ »ý¼ºÀÚºÎ¸£±â.
		getContentPane().setBackground(new Color(0, 0, 0));
		setTitle("DecimalFormat");
		setBounds(100, 100, 375, 304);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());
		setVisible(true);

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC785\uAE08\uC561");
			lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(69, 7, 279, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCC9C\uB2E8\uC704");
			btnNewButton.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					long v = Long.parseLong(textField.getText());
					DecimalFormat df = new DecimalFormat("00,000,000,000.00");
					String r = df.format(v);
					
					textArea.append(r +"\n");
					
					
				}
			});
			btnNewButton.setBounds(12, 35, 108, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC18C\uC218\uC810\uD45C\uC2DC");
			btnNewButton_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton_1.setBackground(new Color(255, 255, 255));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double v = Double.parseDouble(textField.getText());
					DecimalFormat df = new DecimalFormat("##,###,###,###.##");
					
					textArea.append(df.format(v) + "\n");
				}
			});
			btnNewButton_1.setBounds(125, 35, 114, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC6D0\uD654\uD45C\uC2DC");
			btnNewButton_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			btnNewButton_2.setBackground(new Color(255, 255, 255));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double v = Double.parseDouble(textField.getText());
					DecimalFormat df = new DecimalFormat("\u00A4 #,###,###,###.##");
					
					textArea.append(df.format(v)+"\n");
				}
			});
			btnNewButton_2.setBounds(241, 35, 107, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 68, 335, 193);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
