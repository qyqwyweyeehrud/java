package J_colletionExercise;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.awt.event.ActionEvent;

public class ProductInput extends JInternalFrame {
	Set<ProductVo> set;
	private JTextField pCode;
	private JTextField pName;
	private JTextField pEa;
	private JTextField pNal;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInput frame = new ProductInput();
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
	public ProductInput() {
		super("제품입고",false,true,true,true);
		setBounds(100, 100, 450, 376);
		getContentPane().setLayout(null);
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getPEa());
		getContentPane().add(getPNal());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
		setVisible(true);

	}
	
	public ProductInput(Set<ProductVo> set) {
		this();
		this.set = set;
	}
	
	public void input() {
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		String serial = sdf.format(new Date()) +"-"+ MemberMain.iSerial;
		String pC = pCode.getText();
		String pN = pName.getText();
		int ea = Integer.parseInt(pEa.getText());
		Date n = sdf.parse(pNal.getText());
		
		ProductVo pv = new ProductVo(serial,pC,pN,ea,n);
		set.add(pv);
		MemberMain.iSerial++;
		status.setText(serial+"의 제품이 등록되었습니다");
		
		} catch (ParseException e) {
			status.setText("날짜형식을 yyyy-MM-dd(E) 형식으로 입력해주세요");
		}
		
	}

	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(159, 48, 116, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(159, 89, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getPEa() {
		if (pEa == null) {
			pEa = new JTextField();
			pEa.setBounds(159, 134, 116, 21);
			pEa.setColumns(10);
		}
		return pEa;
	}
	private JTextField getPNal() {
		if (pNal == null) {
			pNal = new JTextField();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
			pNal.setText(sdf.format(new Date()));
			pNal.setBounds(159, 181, 116, 21);
			pNal.setColumns(10);
		}
		return pNal;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel.setBounds(90, 51, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setBounds(90, 92, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC218\uB7C9");
			lblNewLabel_2.setBounds(90, 137, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uACE0\uC77C\uC790");
			lblNewLabel_3.setBounds(90, 184, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uACE0");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					input();
				}
			});
			btnNewButton.setBounds(147, 234, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBounds(12, 304, 389, 15);
		}
		return status;
	}
}
