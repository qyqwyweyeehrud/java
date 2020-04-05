package J_collection;

import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class QueFrame extends JInternalFrame {
	
	Queue<Message> queue = new LinkedList<Message>();//큐는 인터페이스라서 뉴로 만들수없다
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueFrame frame = new QueFrame();
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
	public QueFrame() {
		super("Que",false,true,true,true);
		setBounds(100, 100, 392, 365);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getScrollPane());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getComboBox());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTextField_1());
		setVisible(true);

	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OFFER");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String command = (String)comboBox.getSelectedItem();
					String to = textField.getText();
					Message m = new Message(command,to);
					
					queue.offer(m);
				}
			});
			btnNewButton.setBounds(249, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("POLL");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					while(!queue.isEmpty()) {
						Message m = queue.poll();
						textArea.append(m.to+"님에게");
						switch(m.command) {
						case "Mail" :
							textArea.append("메일을 발송합니다");
							break;
						case "SMS" :
							textArea.append("SMS 문자를 발송합니다");
							break;
						case "Kakaotalk" :
							textArea.append("카카오톡 메시지를 발송합니다");
							break;
						}
						textArea.append("\n");
					}
				}
			});
			btnNewButton_1.setBounds(249, 42, 97, 23);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 75, 334, 251);
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
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("COMMEND");
			lblNewLabel.setBounds(12, 13, 97, 15);
		}
		return lblNewLabel;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(103, 10, 134, 21);
			comboBox.addItem("Mail");
			comboBox.addItem("SMS");
			comboBox.addItem("Kakaotalk");
		}
		return comboBox;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("TO");
			lblNewLabel_1.setBounds(12, 46, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(103, 43, 134, 21);
			textField.setColumns(10);
		}
		return textField;
	}
}
