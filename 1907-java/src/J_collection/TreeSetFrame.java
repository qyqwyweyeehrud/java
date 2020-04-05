package J_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.NavigableSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class TreeSetFrame extends JInternalFrame {
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeSetFrame frame = new TreeSetFrame();
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
	public TreeSetFrame() {
		super("TreeSet",false,true,true,true);
		setBounds(100, 100, 399, 401);
		getContentPane().setLayout(null);
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getScrollPane());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		setVisible(true);
	}
	
	public void process() {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(),",");
		
		textArea.setText("");
		while(tokens.hasMoreTokens()) {
			//textArea.append(tokens.nextToken()+"\n");
			scores.add(Integer.parseInt(tokens.nextToken()));
		}
		
		textArea.append("\n최소갑:"+scores.first());
		textArea.append("\n최대값:"+scores.last());
		textArea.append("\n60점 이하:"+scores.lower(60));
		textArea.append("\n90점 이상:"+scores.higher(90));
		
		textArea.append("\n60점 바로밑:"+scores.floor(60));
		textArea.append("\n90점 바로 위:"+scores.ceiling(90));
		
		textArea.append("\n-------------------------------");
		while(!scores.isEmpty()) {
			textArea.append("\n"+scores.pollFirst()+":::"+scores.size());
		}
	}
	
	public void asc() {
		StringTokenizer token = new StringTokenizer(textField.getText(),",");
		textArea.setText("");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		while(token.hasMoreTokens()) {
			
			tree.add(Integer.parseInt(token.nextToken()));
		}
		NavigableSet<Integer> decend = tree.descendingSet();
		NavigableSet<Integer> asend = decend.descendingSet();
		
		for(Integer i : asend) {
		textArea.append(i+"\n");
		}
		
		
		
	}
	public void desc() {
		StringTokenizer to = new StringTokenizer(textField.getText(),",");
		textArea.setText("");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		while(to.hasMoreTokens()) {
			tree.add(Integer.parseInt(to.nextToken()));
		}
		NavigableSet<Integer> de = tree.descendingSet();
		for(Integer i : de) {
		textArea.append(i+"\n");
		}
	}
	
	
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("31523,5,16,43,71,7,437,25,,,45,,543,836,356,,6,35,6,6537,,124");
			textField.setBounds(12, 10, 255, 23);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					process();
				}
			});
			btnNewButton.setBounds(274, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 67, 359, 295);
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
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("ASC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					asc();
				}
			});
			btnNewButton_1.setBounds(79, 34, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("DESC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					desc();
				}
			});
			btnNewButton_2.setBounds(210, 34, 97, 23);
		}
		return btnNewButton_2;
	}
}
