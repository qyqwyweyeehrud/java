package z_exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListEx extends JFrame {//List와 제이프레임은 is a관계이다 /엄마도 김 아빠도 김 이면 자식도 김이기 때문에 ListEx도 김씨이다

	List<String> list = new ArrayList<String>();
	
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_1;
	private JButton btnNewButton_3;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListEx frame = new ListEx();
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
	public ListEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getScrollPane());
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
			btnNewButton = new JButton("\uC785\uB825");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String d = textField.getText();
					list.add(d);
				}
			});
			btnNewButton.setBounds(140, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String b =textField.getText();
					
//					for(int i = 0 ; i<list.size() ; i++) {
//						String temp =list.get(i);
//						if(b.equals(temp)) {
//							list.remove(i);//이코드는 나중에 논리적인 오류를 만나게된다 //삭제되는순간 순서가 앞당겨진다 ,또 사이즈도 작아진다 //따라서 순서를 역행해야한다 //뒤에서부터 0까지
//						}
//					}
					for(int i = list.size()-1 ; i >= 0 ; i--) {
						String temp =list.get(i);
						if(b.equals(temp)) {
							list.remove(i);
						}
					}
				}
			});
			btnNewButton_1.setBounds(249, 9, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC870\uD68C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					String find = textField.getText();
					int n = 0;
					for(int i =0 ;i<list.size();i++) {
						String b = list.get(i);
						if(b.indexOf(find)>=0||find.equals("")) {//indexof는 같은게 하나라도 있느면 1을 리턴, 없다면 -1 을 리턴
							textArea.append((n+1)+" : "+b+"\n");//i는 0부터니까
							n++;
						}
					}
				}
			});
			btnNewButton_2.setBounds(140, 42, 97, 23);
		}
		return btnNewButton_2;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(12, 43, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC218\uC815");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = textField.getText();
					String b = textField_1.getText();
					for(int i = list.size()-1 ; i >=0 ; i--) {
						String temp = list.get(i);
						if(find.equals(temp)) {
							list.set(i, b);
						}
					}
				}
			});
			btnNewButton_3.setBounds(249, 42, 97, 23);
		}
		return btnNewButton_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 74, 333, 400);
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
