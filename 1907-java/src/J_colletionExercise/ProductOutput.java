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
	private JLabel ��ǰ�ڵ�;
	private JLabel ��ǰ��;
	private JLabel ����;
	private JLabel �������;
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
		super("��ǰ���",false,true,true,true);
		setBounds(100, 100, 450, 451);
		getContentPane().setLayout(null);
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getPEa());
		getContentPane().add(getPNal());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(get��ǰ�ڵ�());
		getContentPane().add(get��ǰ��());
		getContentPane().add(get����());
		getContentPane().add(get�������());
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
		
		status.setText("���Ϸ�");
		
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			status.setText("��¥�� Ȯ��");
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
	private JLabel get��ǰ�ڵ�() {
		if (��ǰ�ڵ� == null) {
			��ǰ�ڵ� = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			��ǰ�ڵ�.setBounds(12, 66, 57, 15);
		}
		return ��ǰ�ڵ�;
	}
	private JLabel get��ǰ��() {
		if (��ǰ�� == null) {
			��ǰ�� = new JLabel("\uC81C\uD488\uBA85");
			��ǰ��.setBounds(12, 119, 57, 15);
		}
		return ��ǰ��;
	}
	private JLabel get����() {
		if (���� == null) {
			���� = new JLabel("\uC218\uB7C9");
			����.setBounds(12, 178, 57, 15);
		}
		return ����;
	}
	private JLabel get�������() {
		if (������� == null) {
			������� = new JLabel("\uCD9C\uACE0\uC77C\uC790");
			�������.setBounds(25, 245, 57, 15);
		}
		return �������;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBounds(114, 370, 57, 15);
		}
		return status;
	}
}
