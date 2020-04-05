package J_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.List;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberSearch extends JInternalFrame {
	List<MemberVo> list;
	
	private JPanel panel;
	private JTextField findstr;
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
		super("회원조회",false,true,true,true);
		setBounds(30, 400, 350, 350);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);

	}
	public MemberSearch(List<MemberVo> list) {
		this();//기본 생성자를 불러서 초기셋팅을 원할하게했다
		this.list = list;
	}
	
	public void search() {
		textArea.setText("");
		String find = findstr.getText();
		
		for(int i =0 ;i<list.size();i++) {
			MemberVo vo = list.get(i);//멤버브이오 타입 의 브이오
			
			if(vo.getMid().indexOf(find)>=0 || vo.getmName().indexOf(find)>=0 || vo.getPhone().indexOf(find)>=0) {
				textArea.append(vo.toString());
				
			}
			
		}
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 25));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getFindstr(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JTextField getFindstr() {
		if (findstr == null) {
			findstr = new JTextField();
			findstr.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			findstr.setColumns(10);
		}
		return findstr;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton.setBackground(new Color(188, 143, 143));
			btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
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
			textArea.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		}
		return textArea;
	}
}
