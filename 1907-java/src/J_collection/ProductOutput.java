package J_collection;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductOutput extends JInternalFrame {
	Set<ProductVo> pelist;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JButton button;
	private JLabel status;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductOutput frame = new ProductOutput();
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
	public ProductOutput() {
		super("제품출고",false,true,true,true);
		setBounds(100, 100, 310, 310);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getButton());
		getContentPane().add(getStatus());
		getContentPane().add(getLabel_5());
		getContentPane().add(getLabel_6());
		getContentPane().add(getLabel_7());
		getContentPane().add(getLabel_8());
		getContentPane().add(getLabel_9());
		getContentPane().add(getLabel_10());
		getContentPane().add(getLabel_11());
		getContentPane().add(getLabel_12());
		getContentPane().add(getLabel_13());
		getContentPane().add(getLabel_14());
		getContentPane().add(getLabel_15());
		getContentPane().add(getLabel_16());
		getContentPane().add(getLabel_17());
		getContentPane().add(getLabel_18());
		getContentPane().add(getLabel_19());
		getContentPane().add(getLabel_20());
		setVisible(true);

	}
	
	public ProductOutput(Set<ProductVo> pelist) {
		this();
		this.pelist = pelist;
	}
	
	public void output() {
		//폼의값을 가져다 productVo객체를 생성하는일의 기초
		//pelist에 추가하는작업
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//입력항목이 공백인경우
		if(pCode.getText().equals("") || pName.getText().equals("") || ea.getText().equals("") || nal.getText().equals("")) {
			status.setText("입력항목에 오류가 있습니다");
			pCode.requestFocus();
			return;//빠져나가야되니까 리턴
		}
		
		try {
			String serial = sdf.format(new Date()) + "-" + MemberMain.eSerial;
			String pc = pCode.getText();
			String pn = pName.getText();
			int e = Integer.parseInt(ea.getText());
			Date n = sdf.parse(nal.getText());
			ProductVo vo = new ProductVo(serial,pc,pn,e,n);
			pelist.add(vo);
			MemberMain.eSerial++;
			
			status.setText("코드:"+pc+"이 출고 되었습니다");
			pName.setText("");
			ea.setText("");
			pCode.requestFocus();
			pCode.selectAll();
		} catch (ParseException e1) {
			status.setText("날짜 형식을 yyyy-MM-dd 로 입력해주세요");
			nal.requestFocus();
			nal.selectAll();
		}catch(NumberFormatException e2){
			status.setText("숫자형식만 입력해주세요");
			ea.requestFocus();
			ea.selectAll();
		}
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			label.setForeground(new Color(128, 0, 0));
			label.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label.setBounds(51, 55, 57, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC81C\uD488\uBA85");
			label_1.setForeground(new Color(128, 0, 0));
			label_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_1.setBounds(51, 80, 57, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC218\uB7C9");
			label_2.setForeground(new Color(128, 0, 0));
			label_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_2.setBounds(51, 105, 57, 15);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uCD9C\uACE0\uC77C\uC790");
			label_3.setForeground(new Color(128, 0, 0));
			label_3.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			label_3.setBounds(51, 130, 57, 15);
		}
		return label_3;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setColumns(10);
			pCode.setBorder(null);
			pCode.setBackground(Color.WHITE);
			pCode.setBounds(120, 52, 116, 21);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setColumns(10);
			pName.setBorder(null);
			pName.setBounds(120, 77, 116, 21);
		}
		return pName;
	}
	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setColumns(10);
			ea.setBorder(null);
			ea.setBounds(120, 102, 116, 21);
		}
		return ea;
	}
	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			nal.setHorizontalAlignment(SwingConstants.CENTER);
			nal.setText((String) null);
			nal.setColumns(10);
			nal.setBorder(null);
			nal.setBounds(120, 127, 116, 21);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
			nal.setText(sdf.format(new Date()));
		}
		return nal;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uCD9C\uACE0");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					output();
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			button.setBackground(new Color(188, 143, 143));
			button.setBounds(100, 166, 76, 32);
		}
		return button;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(Color.WHITE);
			status.setBackground(new Color(188, 143, 143));
			status.setBounds(12, 208, 262, 61);
			
			
			
		}
		return status;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("");
			label_5.setOpaque(true);
			label_5.setBackground(new Color(188, 143, 143));
			label_5.setBounds(12, 10, 262, 5);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("");
			label_6.setOpaque(true);
			label_6.setBackground(new Color(188, 143, 143));
			label_6.setBounds(12, 10, 5, 199);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("New label");
			label_7.setPreferredSize(new Dimension(3, 5));
			label_7.setOpaque(true);
			label_7.setForeground(new Color(188, 143, 143));
			label_7.setBackground(new Color(188, 143, 143));
			label_7.setBounds(46, 104, 3, 15);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("New label");
			label_8.setPreferredSize(new Dimension(3, 5));
			label_8.setOpaque(true);
			label_8.setForeground(new Color(188, 143, 143));
			label_8.setBackground(new Color(188, 143, 143));
			label_8.setBounds(46, 55, 3, 15);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("New label");
			label_9.setPreferredSize(new Dimension(3, 5));
			label_9.setOpaque(true);
			label_9.setForeground(new Color(188, 143, 143));
			label_9.setBackground(new Color(188, 143, 143));
			label_9.setBounds(46, 129, 3, 15);
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("New label");
			label_10.setPreferredSize(new Dimension(3, 5));
			label_10.setOpaque(true);
			label_10.setForeground(new Color(188, 143, 143));
			label_10.setBackground(new Color(188, 143, 143));
			label_10.setBounds(46, 80, 3, 15);
		}
		return label_10;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("");
			label_11.setOpaque(true);
			label_11.setForeground(new Color(188, 143, 143));
			label_11.setBackground(new Color(188, 143, 143));
			label_11.setBounds(269, 10, 5, 199);
		}
		return label_11;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("");
			label_12.setOpaque(true);
			label_12.setBackground(Color.GRAY);
			label_12.setBounds(15, 267, 262, 5);
		}
		return label_12;
	}
	private JLabel getLabel_13() {
		if (label_13 == null) {
			label_13 = new JLabel("");
			label_13.setOpaque(true);
			label_13.setBackground(Color.GRAY);
			label_13.setBounds(272, 13, 5, 259);
		}
		return label_13;
	}
	private JLabel getLabel_14() {
		if (label_14 == null) {
			label_14 = new JLabel("");
			label_14.setOpaque(true);
			label_14.setBackground(Color.GRAY);
			label_14.setBounds(14, 10, 5, 259);
		}
		return label_14;
	}
	private JLabel getLabel_15() {
		if (label_15 == null) {
			label_15 = new JLabel("");
			label_15.setOpaque(true);
			label_15.setBackground(Color.GRAY);
			label_15.setBounds(12, 12, 262, 5);
		}
		return label_15;
	}
	private JLabel getLabel_16() {
		if (label_16 == null) {
			label_16 = new JLabel("New label");
			label_16.setOpaque(true);
			label_16.setBackground(Color.GRAY);
			label_16.setBounds(122, 54, 116, 21);
		}
		return label_16;
	}
	private JLabel getLabel_17() {
		if (label_17 == null) {
			label_17 = new JLabel("New label");
			label_17.setOpaque(true);
			label_17.setBackground(Color.GRAY);
			label_17.setBounds(122, 129, 116, 21);
		}
		return label_17;
	}
	private JLabel getLabel_18() {
		if (label_18 == null) {
			label_18 = new JLabel("New label");
			label_18.setOpaque(true);
			label_18.setBackground(Color.GRAY);
			label_18.setBounds(122, 104, 116, 21);
		}
		return label_18;
	}
	private JLabel getLabel_19() {
		if (label_19 == null) {
			label_19 = new JLabel("New label");
			label_19.setOpaque(true);
			label_19.setBackground(Color.GRAY);
			label_19.setBounds(122, 79, 116, 21);
		}
		return label_19;
	}
	private JLabel getLabel_20() {
		if (label_20 == null) {
			label_20 = new JLabel("New label");
			label_20.setOpaque(true);
			label_20.setBackground(Color.GRAY);
			label_20.setBounds(102, 168, 76, 32);
		}
		return label_20;
	}
}
