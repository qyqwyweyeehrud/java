package J_colletionExercise;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ProductOutput extends JInternalFrame {
	Set<ProductVo> oset;
	private JTextField pCode;
	private JTextField pName;
	private JTextField pEa;
	private JTextField pNal;
	private JButton btnNewButton;
	private JLabel 제품코드;
	private JLabel 제품명;
	private JLabel 수량;
	private JLabel 출고일자;
	private JLabel status;

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
		setBounds(100, 100, 450, 451);
		getContentPane().setLayout(null);
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getPEa());
		getContentPane().add(getPNal());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(get제품코드());
		getContentPane().add(get제품명());
		getContentPane().add(get수량());
		getContentPane().add(get출고일자());
		getContentPane().add(getStatus());
		setVisible(true);

	}
	public ProductOutput(Set<ProductVo> oset) {
		this();
		this.oset = oset;
	}
	public void output(){
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		String serial = sdf.format(new Date()) +"-"+MemberMain.eSerial;
		String pC = pCode.getText();
		String pn = pName.getText();
		int ea = Integer.parseInt(pEa.getText());
		Date n = sdf.parse(pNal.getText());
			
		MemberMain.eSerial++;
		ProductVo vo = new ProductVo(serial,pC,pn,ea,n);
		oset.add(vo);
		
		status.setText("출고완료");
		
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			status.setText("날짜를 확인");
		}
		
	}

	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(94, 63, 116, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(94, 116, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getPEa() {
		if (pEa == null) {
			pEa = new JTextField();
			pEa.setBounds(94, 175, 116, 21);
			pEa.setColumns(10);
		}
		return pEa;
	}
	private JTextField getPNal() {
		if (pNal == null) {
			pNal = new JTextField();
			pNal.setBounds(94, 242, 116, 21);
			pNal.setColumns(10);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
			pNal.setText(sdf.format(new Date()));
		}
		return pNal;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCD9C\uACE0");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					output();
				}
			});
			btnNewButton.setBounds(94, 311, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel get제품코드() {
		if (제품코드 == null) {
			제품코드 = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			제품코드.setBounds(12, 66, 57, 15);
		}
		return 제품코드;
	}
	private JLabel get제품명() {
		if (제품명 == null) {
			제품명 = new JLabel("\uC81C\uD488\uBA85");
			제품명.setBounds(12, 119, 57, 15);
		}
		return 제품명;
	}
	private JLabel get수량() {
		if (수량 == null) {
			수량 = new JLabel("\uC218\uB7C9");
			수량.setBounds(12, 178, 57, 15);
		}
		return 수량;
	}
	private JLabel get출고일자() {
		if (출고일자 == null) {
			출고일자 = new JLabel("\uCD9C\uACE0\uC77C\uC790");
			출고일자.setBounds(25, 245, 57, 15);
		}
		return 출고일자;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBounds(114, 370, 57, 15);
		}
		return status;
	}
}
