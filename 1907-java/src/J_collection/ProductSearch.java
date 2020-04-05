package J_collection;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductSearch extends JInternalFrame {
	Set<ProductVo> pilist;
	Set<ProductVo> pelist;
	
	ButtonGroup group = new ButtonGroup();//라디오버튼을 group에 추가시키면 그중에서 한개
	
	private JPanel panel;
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_1;
	private JRadioButton imbtn;
	private JRadioButton exbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductSearch frame = new ProductSearch();
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
	public ProductSearch() {
		super("제품조회",false,true,true,true);
		setBounds(100, 100, 447, 443);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);

	}
	
	public ProductSearch(Set<ProductVo> pilist,Set<ProductVo> pelist) {
		this();
		this.pilist = pilist;
		this.pelist = pelist;
	}
	
	public void search() {
		Set<ProductVo> list = null;
		//검색어 = 시리얼,제품코드,제품명
		ProductVo find = new ProductVo();
		find.setSerial(textField.getText());//사용자가 입력한값이 시리얼이라고하는거야
		find.setpCode(textField.getText());
		find.setpName(textField.getText());
		//find를 String 타입으로한다면 ProductVo의 equals의 obj 가 ProductVo 타입이 아니기때문에 팅겨나감
		textArea.setText("");
		
		if(imbtn.isSelected()) {
			list = pilist;
		}else {
			list = pelist;
		}
		
		Iterator<ProductVo> iter = list.iterator();//정수형 첨자가없기에 이터레이터
		while(iter.hasNext()) {
			ProductVo vo = iter.next();
			if(vo.equals(find)) {
				textArea.append(vo.toString());
			}
		}
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 33));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTextField(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
			panel.add(getPanel_1(), BorderLayout.WEST);
		}
		return panel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.setForeground(new Color(255, 255, 255));
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
		}
		return textArea;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(188, 143, 143));
			panel_1.setPreferredSize(new Dimension(110, 10));
			panel_1.add(getImbtn());
			panel_1.add(getExbtn());
		}
		return panel_1;
	}
	private JRadioButton getImbtn() {
		if (imbtn == null) {
			imbtn = new JRadioButton("\uC785\uACE0");
			group.add(imbtn);
			imbtn.setSelected(true);

			imbtn.setForeground(new Color(255, 255, 255));
			imbtn.setBackground(new Color(188, 143, 143));
			imbtn.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return imbtn;
	}
	private JRadioButton getExbtn() {
		if (exbtn == null) {
			exbtn = new JRadioButton("\uCD9C\uACE0");
			group.add(exbtn);
			//exbtn.setSelected(true);
			
			exbtn.setForeground(new Color(255, 255, 255));
			exbtn.setBackground(new Color(188, 143, 143));
			exbtn.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return exbtn;
	}
}
