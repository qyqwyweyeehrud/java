package J_colletionExercise;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ProductModify extends JInternalFrame {
	Set<ProductVo> iset;
	Set<ProductVo> oset;
	Set<ProductVo> set;
	ProductVo oldVo;
	ButtonGroup group = new ButtonGroup();
	private JTextField serial;
	private JTextField pCode;
	private JTextField pName;
	private JTextField pEa;
	private JTextField pNal;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;
	private JRadioButton inbtn;
	private JRadioButton outbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductModify frame = new ProductModify();
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
	public ProductModify() {
		super("수정삭제",false,true,true,true);
		setBounds(100, 100, 450, 450);
		getContentPane().setLayout(null);
		getContentPane().add(getSerial());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getPEa());
		getContentPane().add(getPNal());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		getContentPane().add(getInbtn());
		getContentPane().add(getOutbtn());
		setVisible(true);

	}
	public ProductModify(Set<ProductVo> iset,Set<ProductVo> oset) {
		this();
		this.iset = iset;
		this.oset = oset;
	}
	
	public void search() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		String find = serial.getText();
		oldVo =null;
		if(inbtn.isSelected()) {
			set = iset;
		}else {
			set = oset;
		}
		Iterator<ProductVo> iter = set.iterator();
		while(iter.hasNext()) {
			ProductVo vo = iter.next();
			if(find.equals(vo.getSerial())) {
				oldVo =vo;
				pCode.setText(vo.getpCode());
				pName.setText(vo.getpName());
				pEa.setText(String.valueOf(vo.getEa()));
				pNal.setText(sdf.format((vo.getNal())));
				
				status.setText("찾았다");
				break;
			}
			
		}
		if(oldVo == null) {
			status.setText("못찾겟다");
		}
	}
	
	public void modify() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		try {
		String s = serial.getText();
		String p = pCode.getText();
		String m = pName.getText();
		int e = Integer.parseInt(pEa.getText());
		Date n = sdf.parse(pNal.getText());
			
		set.remove(oldVo);
		ProductVo vo = new ProductVo(s,p,m,e,n);
		set.add(vo);
		
		
		} catch (ParseException e1) {
			status.setText("날 확인좀");
		}
	}
	
	public void delet() {
		if(oldVo != null) {
			set.remove(oldVo);
		}
	}
	

	private JTextField getSerial() {
		if (serial == null) {
			serial = new JTextField();
			serial.setBounds(156, 46, 116, 21);
			serial.setColumns(10);
		}
		return serial;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(166, 94, 116, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(156, 162, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getPEa() {
		if (pEa == null) {
			pEa = new JTextField();
			pEa.setBounds(156, 209, 116, 21);
			pEa.setColumns(10);
		}
		return pEa;
	}
	private JTextField getPNal() {
		if (pNal == null) {
			pNal = new JTextField();
			pNal.setBounds(156, 274, 116, 21);
			pNal.setColumns(10);
		}
		return pNal;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC2DC\uB9AC\uC5BC");
			lblNewLabel.setBounds(47, 49, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel_1.setBounds(47, 97, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_2.setBounds(47, 165, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC218\uB7C9");
			lblNewLabel_3.setBounds(47, 212, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uCD9C\uACE0\uC77C\uC790");
			lblNewLabel_4.setBounds(47, 277, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton.setBounds(286, 45, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modify();
				}
			});
			btnNewButton_1.setBounds(81, 326, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delet();
				}
			});
			btnNewButton_2.setBounds(235, 326, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBounds(47, 378, 375, 15);
		}
		return status;
	}
	private JRadioButton getInbtn() {
		if (inbtn == null) {
			inbtn = new JRadioButton("\uC785\uACE0");
			inbtn.setBounds(47, 6, 121, 23);
			group.add(inbtn);
			inbtn.setSelected(true);
		}
		return inbtn;
	}
	private JRadioButton getOutbtn() {
		if (outbtn == null) {
			outbtn = new JRadioButton("\uCD9C\uACE0");
			outbtn.setBounds(211, 6, 121, 23);
			group.add(outbtn);
		}
		return outbtn;
	}
}
