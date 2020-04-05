package J_collection;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ProductModify extends JInternalFrame {
	Set<ProductVo> pilist;
	Set<ProductVo> pelist;
	Set<ProductVo> list;//검색,수정,삭제에서 사용해야함
	ButtonGroup group = new ButtonGroup();
	ProductVo oldVo;//수정전
	
	private JTextField serial;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel status;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JRadioButton inputbtn;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JTextField pCode;
	private JRadioButton outputbtn;
	private JLabel lblNewLabel;

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
		super("제품수정,제품삭제",false,true,true,true);
		setBounds(100, 100, 304, 345);
		getContentPane().setLayout(null);
		getContentPane().add(getSerial());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getLabel_4());
		getContentPane().add(getLabel_5());
		getContentPane().add(getLabel_6());
		getContentPane().add(getLabel_7());
		getContentPane().add(getLabel_8());
		getContentPane().add(getLabel_9());
		getContentPane().add(getLabel_10());
		getContentPane().add(getStatus());
		getContentPane().add(getButton());
		getContentPane().add(getButton_1());
		getContentPane().add(getButton_2());
		getContentPane().add(getLabel_12());
		getContentPane().add(getLabel_13());
		getContentPane().add(getLabel_14());
		getContentPane().add(getLabel_15());
		getContentPane().add(getLabel_16());
		getContentPane().add(getLabel_17());
		getContentPane().add(getLabel_18());
		getContentPane().add(getLabel_19());
		getContentPane().add(getLabel_20());
		getContentPane().add(getLabel_21());
		getContentPane().add(getPCode());
		getContentPane().add(getLabel_26());
		getContentPane().add(getLabel_22());
		getContentPane().add(getLabel_23());
		getContentPane().add(getLabel_24());
		getContentPane().add(getLabel_25());
		getContentPane().add(getOutputbtn());
		getContentPane().add(getInputbtn());
		getContentPane().add(getLabel_27());
		getContentPane().add(getLabel_28());
		getContentPane().add(getLblNewLabel());
		setVisible(true);

	}
	
	public ProductModify(Set<ProductVo> pilist,Set<ProductVo> pelist) {
		this();
		this.pelist = pelist;
		this.pilist = pilist;
		
	}
	
	public void search() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		if(inputbtn.isSelected()) {
			list = pilist;
		}else if(outputbtn.isSelected()){
			list = pelist;
		}
		
		String s = serial.getText();
		oldVo =null;//두번째 검색을햇는데 못찾았어,그러면 이전데이더를 가지고있기 때문에 반드시 검색전에null값을 줘야함
		status.setText("자료를 검색중입니다");
		for(ProductVo vo : list) {
			if(s.equals(vo.getSerial())){//리스트가 가지고있는 한건과 내가입력한 시리얼을 비교
				oldVo = vo;
				pCode.setText(vo.getpCode());
				pName.setText(vo.getpName());
				ea.setText(String.valueOf(vo.getEa()));//== vo.setEa()+""
				nal.setText(sdf.format(vo.getNal()));
				status.setText("자료를 찾았습니다");
				break;
			}
		}
		if(oldVo == null) {
			pCode.setText("");
			pName.setText("");
			ea.setText("");
			nal.setText("");
			status.setText("자료가 없습니다");
			serial.requestFocus();
			serial.selectAll();
		}
		
		/*
		String find = serial.getText();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(inputbtn.isSelected()) {
			Iterator<ProductVo> list = pilist.iterator();
			while(list.hasNext()) {
				ProductVo vo = list.next();
				if(find.equals(vo.getSerial())) {
					pCode.setText(vo.getpCode());
					pName.setText(vo.getpName());
					ea.setText(String.valueOf(vo.getEa()));
					nal.setText(sdf.format((vo.getNal())));
					
				}
			}
		}else if(outputbtn.isSelected()) {
			Iterator<ProductVo> list = pelist.iterator();
			while(list.hasNext()) {
				ProductVo vo = list.next();
				if(find.equals(vo.getSerial())) {
					pCode.setText(vo.getpCode());
					pName.setText(vo.getpName());
					ea.setText(String.valueOf(vo.getEa()));
					nal.setText((sdf.format(vo.getNal())));
				}
			}
		}
		*/
	}
	
	
	
	public void modify() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			String s= serial.getText();
			String pC = pCode.getText();
			String pN = pName.getText();
			int a = Integer.parseInt(ea.getText());
			Date n = sdf.parse(nal.getText());
			
			list.remove(oldVo);
			ProductVo newVo = new ProductVo(s,pC,pN,a,n);
			list.add(newVo);
			
			status.setText("자료가 수정되었습니다");
			serial.requestFocus();
			serial.selectAll();
			
			if(oldVo != null) {
				
			}else {
				status.setText("검색후 수정버튼을 눌러주세요");
			}
		}catch(ParseException e){
			status.setText("날자형식은 yyyy-MM-dd로 입력해주세요");
			nal.requestFocus();
			nal.selectAll();
		}catch(NumberFormatException e1) {
			status.setText("수량은 숫자로만 입력해주세요");
			ea.requestFocus();
			ea.selectAll();
		}
	}
	
	public void delet() {
		if(oldVo != null) {
			list.remove(oldVo);
			pCode.setText("");
			pName.setText("");
			ea.setText("");
			nal.setText("");
			status.setText("자료가 삭제되었습니다");
			serial.requestFocus();
			serial.selectAll();
		}else {
			status.setText("먼저 검색후 삭제버튼을 눌러주세요");
		}
		
	}
	
	
	
	private JTextField getSerial() {
		if (serial == null) {
			serial = new JTextField();
			serial.setColumns(10);
			serial.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(188, 143, 143), null));
			serial.setBounds(103, 55, 74, 21);
		}
		return serial;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setColumns(10);
			pName.setBorder(null);
			pName.setBounds(103, 115, 133, 21);
		}
		return pName;
	}
	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setColumns(10);
			ea.setBorder(null);
			ea.setBounds(103, 140, 133, 21);
		}
		return ea;
	}
	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setColumns(10);
			nal.setBorder(null);
			nal.setBounds(103, 165, 133, 21);
		}
		return nal;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setPreferredSize(new Dimension(3, 5));
			label.setOpaque(true);
			label.setForeground(new Color(188, 143, 143));
			label.setBackground(new Color(188, 143, 143));
			label.setBounds(46, 58, 3, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setPreferredSize(new Dimension(3, 5));
			label_1.setOpaque(true);
			label_1.setForeground(new Color(188, 143, 143));
			label_1.setBackground(new Color(188, 143, 143));
			label_1.setBounds(46, 118, 3, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("New label");
			label_2.setPreferredSize(new Dimension(3, 5));
			label_2.setOpaque(true);
			label_2.setForeground(new Color(188, 143, 143));
			label_2.setBackground(new Color(188, 143, 143));
			label_2.setBounds(46, 142, 3, 15);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("New label");
			label_3.setPreferredSize(new Dimension(3, 5));
			label_3.setOpaque(true);
			label_3.setForeground(new Color(188, 143, 143));
			label_3.setBackground(new Color(188, 143, 143));
			label_3.setBounds(46, 167, 3, 15);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uCD9C\uACE0\uC77C\uC790");
			label_4.setForeground(new Color(128, 0, 0));
			label_4.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_4.setBounds(51, 168, 57, 15);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uC218\uB7C9");
			label_5.setForeground(new Color(128, 0, 0));
			label_5.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_5.setBounds(51, 143, 57, 15);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC81C\uD488\uBA85");
			label_6.setForeground(new Color(128, 0, 0));
			label_6.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_6.setBounds(51, 118, 57, 15);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("\uC2DC\uB9AC\uC5BC");
			label_7.setForeground(new Color(128, 0, 0));
			label_7.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_7.setBounds(51, 58, 57, 15);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("");
			label_8.setOpaque(true);
			label_8.setBackground(new Color(188, 143, 143));
			label_8.setBounds(12, 20, 5, 220);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("");
			label_9.setOpaque(true);
			label_9.setBackground(new Color(188, 143, 143));
			label_9.setBounds(12, 20, 262, 5);
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("");
			label_10.setOpaque(true);
			label_10.setForeground(new Color(188, 143, 143));
			label_10.setBackground(new Color(188, 143, 143));
			label_10.setBounds(269, 20, 5, 220);
		}
		return label_10;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(Color.WHITE);
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setBackground(new Color(188, 143, 143));
			status.setBounds(12, 239, 262, 61);
		}
		return status;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC218\uC815");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modify();
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			button.setBackground(new Color(188, 143, 143));
			button.setBounds(46, 196, 76, 32);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC0AD\uC81C");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delet();
				}
			});
			button_1.setForeground(Color.WHITE);
			button_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			button_1.setBackground(new Color(188, 143, 143));
			button_1.setBounds(160, 196, 76, 32);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("\uAC80\uC0C9");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			button_2.setForeground(Color.WHITE);
			button_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			button_2.setBackground(new Color(188, 143, 143));
			button_2.setBounds(181, 55, 56, 21);
		}
		return button_2;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("");
			label_12.setOpaque(true);
			label_12.setForeground(new Color(188, 143, 143));
			label_12.setBackground(new Color(188, 143, 143));
			label_12.setBounds(269, 41, 5, 199);
		}
		return label_12;
	}
	private JLabel getLabel_13() {
		if (label_13 == null) {
			label_13 = new JLabel("");
			label_13.setOpaque(true);
			label_13.setBackground(Color.GRAY);
			label_13.setBounds(15, 298, 262, 5);
		}
		return label_13;
	}
	private JLabel getLabel_14() {
		if (label_14 == null) {
			label_14 = new JLabel("");
			label_14.setOpaque(true);
			label_14.setBackground(Color.GRAY);
			label_14.setBounds(272, 28, 5, 275);
		}
		return label_14;
	}
	private JLabel getLabel_15() {
		if (label_15 == null) {
			label_15 = new JLabel("");
			label_15.setOpaque(true);
			label_15.setBackground(Color.GRAY);
			label_15.setBounds(14, 20, 5, 280);
		}
		return label_15;
	}
	private JLabel getLabel_16() {
		if (label_16 == null) {
			label_16 = new JLabel("");
			label_16.setOpaque(true);
			label_16.setBackground(Color.GRAY);
			label_16.setBounds(12, 22, 262, 5);
		}
		return label_16;
	}
	private JLabel getLabel_17() {
		if (label_17 == null) {
			label_17 = new JLabel("New label");
			label_17.setOpaque(true);
			label_17.setBackground(Color.GRAY);
			label_17.setBounds(105, 167, 133, 21);
		}
		return label_17;
	}
	private JLabel getLabel_18() {
		if (label_18 == null) {
			label_18 = new JLabel("New label");
			label_18.setOpaque(true);
			label_18.setBackground(Color.GRAY);
			label_18.setBounds(105, 142, 133, 21);
		}
		return label_18;
	}
	private JLabel getLabel_19() {
		if (label_19 == null) {
			label_19 = new JLabel("New label");
			label_19.setOpaque(true);
			label_19.setBackground(Color.GRAY);
			label_19.setBounds(105, 117, 133, 21);
		}
		return label_19;
	}
	private JLabel getLabel_20() {
		if (label_20 == null) {
			label_20 = new JLabel("New label");
			label_20.setOpaque(true);
			label_20.setBackground(Color.GRAY);
			label_20.setBounds(105, 57, 74, 21);
		}
		return label_20;
	}
	private JLabel getLabel_21() {
		if (label_21 == null) {
			label_21 = new JLabel("New label");
			label_21.setOpaque(true);
			label_21.setBackground(Color.GRAY);
			label_21.setBounds(48, 198, 76, 32);
		}
		return label_21;
	}
	private JLabel getLabel_22() {
		if (label_22 == null) {
			label_22 = new JLabel("New label");
			label_22.setOpaque(true);
			label_22.setBackground(Color.GRAY);
			label_22.setBounds(162, 198, 76, 32);
		}
		return label_22;
	}
	private JLabel getLabel_23() {
		if (label_23 == null) {
			label_23 = new JLabel("");
			label_23.setOpaque(true);
			label_23.setBackground(Color.GRAY);
			label_23.setBounds(183, 57, 56, 21);
		}
		return label_23;
	}
	private JLabel getLabel_24() {
		if (label_24 == null) {
			label_24 = new JLabel("New label");
			label_24.setPreferredSize(new Dimension(3, 5));
			label_24.setOpaque(true);
			label_24.setForeground(new Color(188, 143, 143));
			label_24.setBackground(new Color(188, 143, 143));
			label_24.setBounds(46, 34, 3, 15);
		}
		return label_24;
	}
	private JLabel getLabel_25() {
		if (label_25 == null) {
			label_25 = new JLabel("\uAD6C\uBD84");
			label_25.setForeground(new Color(128, 0, 0));
			label_25.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_25.setBounds(51, 34, 57, 15);
		}
		return label_25;
	}
	private JRadioButton getInputbtn() {
		if (inputbtn == null) {
			inputbtn = new JRadioButton("\uC785\uACE0");
			group.add(inputbtn);
			inputbtn.setSelected(true);
			inputbtn.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			inputbtn.setBounds(99, 31, 56, 23);
		}
		return inputbtn;
	}
	private JLabel getLabel_26() {
		if (label_26 == null) {
			label_26 = new JLabel("New label");
			label_26.setOpaque(true);
			label_26.setBackground(Color.GRAY);
			label_26.setBounds(105, 94, 133, 21);
		}
		return label_26;
	}
	private JLabel getLabel_27() {
		if (label_27 == null) {
			label_27 = new JLabel("New label");
			label_27.setPreferredSize(new Dimension(3, 5));
			label_27.setOpaque(true);
			label_27.setForeground(new Color(188, 143, 143));
			label_27.setBackground(new Color(188, 143, 143));
			label_27.setBounds(46, 95, 3, 15);
		}
		return label_27;
	}
	private JLabel getLabel_28() {
		if (label_28 == null) {
			label_28 = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			label_28.setBackground(new Color(188, 143, 143));
			label_28.setForeground(new Color(128, 0, 0));
			label_28.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_28.setBounds(51, 95, 57, 15);
		}
		return label_28;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setColumns(10);
			pCode.setBorder(null);
			pCode.setBounds(103, 92, 133, 21);
		}
		return pCode;
	}
	private JRadioButton getOutputbtn() {
		if (outputbtn == null) {
			outputbtn = new JRadioButton("\uCD9C\uACE0");
			group.add(outputbtn);
			
			outputbtn.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			outputbtn.setBounds(193, 31, 68, 23);
		}
		return outputbtn;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(211, 211, 211));
			lblNewLabel.setBounds(81, 83, 120, 2);
		}
		return lblNewLabel;
	}
}
