package J_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class StackFrame extends JInternalFrame {
	Stack<Coin> stack = new Stack<Coin>();
	
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackFrame frame = new StackFrame();
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
	public StackFrame() {
		super("Stack",false,true,true,true);
		setBounds(100, 100, 373, 368);
		getContentPane().setLayout(null);
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getScrollPane());
		setVisible(true);

	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 10, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("push");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int v = Integer.parseInt(textField.getText());
					Coin c = new Coin(v);
					stack.push(c);
				}
			});
			btnNewButton.setBounds(140, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("pop");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					while(!stack.isEmpty()) {
						Coin temp = stack.pop();
						textArea.append(temp.getValue()+"\n");
					}
				}
			});
			btnNewButton_1.setBounds(249, 9, 97, 23);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 41, 334, 288);
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
