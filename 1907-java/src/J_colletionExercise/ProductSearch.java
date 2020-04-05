package J_colletionExercise;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductSearch extends JInternalFrame {
	Set<ProductVo> iset;
	Set<ProductVo> oset;
	ButtonGroup group = new ButtonGroup();
	
	private JPanel panel;
	private JPanel panel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JRadioButton inbtn;
	private JRadioButton outbtn;
	private JScrollPane scrollPane;
	private JTextArea textArea;
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
		setBounds(100, 100, 450, 388);
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);

	}
	public ProductSearch(Set<ProductVo> iset,Set<ProductVo> oset) {
		this();
		this.iset = iset;
		this.oset = oset;
	}
	
	public void search() {
		Set<ProductVo> set = null;
		ProductVo find = new ProductVo();
		find.setSerial(textField.getText());
		find.setpCode(textField.getText());
		find.setpName(textField.getText());
		textArea.setText("");
		if(inbtn.isSelected()) {
			set = iset;
		}else {
			set = oset;
		}
		Iterator<ProductVo> iter = set.iterator();
		while(iter.hasNext()) {
			ProductVo temp = iter.next();
			if(temp.equals(find)) {
				textArea.append(temp.toString());
			}
		}
		
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 50));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getPanel_1(), BorderLayout.WEST);
			panel.add(getTextField(), BorderLayout.CENTER);
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getInbtn());
			panel_1.add(getOutbtn());
		}
		return panel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u3148\u314E");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
		}
		return btnNewButton;
	}
	private JRadioButton getInbtn() {
		if (inbtn == null) {
			inbtn = new JRadioButton("\uC785\uACE0");
			group.add(inbtn);
			inbtn.setSelected(true);
		}
		return inbtn;
	}
	private JRadioButton getOutbtn() {
		if (outbtn == null) {
			outbtn = new JRadioButton("\uCD9C\uACE0");
			group.add(outbtn);
		}
		return outbtn;
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
