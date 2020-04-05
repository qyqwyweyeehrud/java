package J_colletionExercise;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MemberModify extends JInternalFrame {
	List<MemberVo> list;
	private JTextField mid;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;
	private int index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberModify frame = new MemberModify();
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
	public MemberModify() {
		super("수정삭제",false,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getMid());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		setVisible(true);

	}
	
	public MemberModify(List<MemberVo> list) {
		this();
		this.list = list;
		
	}
	
	
	public void search() {
		index = -1;
		String find = mid.getText();
		for(int i = 0 ; i<list.size() ; i++) {
			MemberVo vo = list.get(i);
			if(vo.getMid().equals(find)) {
				index = i;
			}
		}
		
		MemberVo vo = list.get(index);
		if(index>=0) {
			mid.setText(vo.getMid());
			pwd.setText(vo.getPwd());
			mName.setText(vo.getmName());
			phone.setText(vo.getPhone());
			
			status.setText(vo.getMid()+"가 검색되었습니다");
		}
	}
	
	public void modify() {
		
		MemberVo vo = list.get(index);
		MemberVo v = new MemberVo(mid.getText(),mName.getText(),pwd.getText(),phone.getText());
		//vo.setMid(mid.getText());
		//vo.setmName(mName.getText());
		//vo.setPwd(pwd.getText());
		//vo.setPhone(phone.getText());
		list.set(index, v);
		
		status.setText("수정되엇습니다");
	}
	
	public void delet() {
		
		MemberVo vo = list.get(index);
		list.remove(vo);
		
		status.setText("삭제 되었습니다");
	}
	
	
	

	private JTextField getMid() {
		if (mid == null) {
			mid = new JTextField();
			mid.setBounds(79, 21, 116, 21);
			mid.setColumns(10);
		}
		return mid;
	}
	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBounds(79, 63, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(79, 103, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(79, 147, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton.setBounds(240, 20, 97, 23);
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
			btnNewButton_1.setBounds(24, 206, 97, 23);
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
			btnNewButton_2.setBounds(156, 206, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBounds(24, 239, 398, 15);
		}
		return status;
	}
}
