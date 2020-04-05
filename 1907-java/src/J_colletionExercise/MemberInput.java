package J_colletionExercise;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class MemberInput extends JInternalFrame {
	List<MemberVo> list;
	private JTextField mid;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInput frame = new MemberInput();
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
	public MemberInput() {
		super("회원입력",false,true,true,true);
		setBounds(100, 100, 435, 486);
		getContentPane().setLayout(null);
		getContentPane().add(getMid());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getStatus());
		getContentPane().add(getBtnNewButton());
		setVisible(true);

	}
	
	public MemberInput(List<MemberVo> list) {
		this();
		this.list = list;
	}
	
	public void sort(){
		String id = mid.getText();
		String pw = pwd.getText();
		String n = mName.getText();
		String p = phone.getText();
		
		MemberVo vo = new MemberVo(id,pw,n,p);
		list.add(vo);
		
		status.setText("입력완료");
		
	}

	private JTextField getMid() {
		if (mid == null) {
			mid = new JTextField();
			mid.setBounds(113, 45, 116, 21);
			mid.setColumns(10);
		}
		return mid;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBounds(113, 90, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(113, 143, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(113, 190, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBounds(12, 257, 395, 15);
		}
		return status;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uB825");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sort();
				}
			});
			btnNewButton.setBounds(132, 221, 97, 23);
		}
		return btnNewButton;
	}
}
