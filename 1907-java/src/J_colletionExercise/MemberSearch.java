package J_colletionExercise;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class MemberSearch extends JInternalFrame {
	List<MemberVo> list;
	private JPanel panel;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberSearch frame = new MemberSearch();
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
	public MemberSearch() {
		super("Á¶È¸",false,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);
		
		
	}
	public MemberSearch(List<MemberVo> list) {
		this();
		this.list = list;
	}
	
	
	public void search(){
		textArea.setText("");
		String a = find.getText();
		for(int i = 0; i<list.size() ; i++) {
			MemberVo vo = list.get(i);
			if(vo.getMid().indexOf(a)>=0 || vo.getmName().indexOf(a)>=0 || vo.getPhone().indexOf(a)>=0 || vo.getPwd().indexOf(a)>=0) {
				textArea.append(vo.toString());
			}
		}
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 25));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getFind(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setColumns(10);
		}
		return find;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
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
