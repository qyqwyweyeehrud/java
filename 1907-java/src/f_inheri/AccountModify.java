package f_inheri;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountModify extends JPanel {
	private JLabel label;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField mName;
	private JLabel lblNewLabel_1;
	private JTextField amount;
	private JButton btnNewButton_1;
	
	private int pos;// 검색된 고객의 위치번호
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public AccountModify() {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		add(getLabel());
		add(getSno());
		add(getBtnNewButton());
		add(getLblNewLabel());
		add(getMName());
		add(getLblNewLabel_1());
		add(getAmount());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uACC4\uC815 \uACC4\uC88C \uC218\uC815");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(new Color(255, 255, 255));
			label.setFont(new Font("굴림", Font.BOLD, 30));
			label.setBounds(12, 57, 426, 42);
		}
		return label;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(118, 109, 145, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!sno.getText().equals("")) {
						String find = sno.getText();
						pos = -1;//검색 버튼이 클릭될때마다 pos라는 찾지못햇다 라는 개념으로 -1,
						for(int i = 0;i<Bank.ac.length;i++) {
							Account a = Bank.ac[i];
								if(a.getsNo().equals(find)) {
									mName.setText(a.getmName());
									amount.setText(a.getAmount()+"");//getAmount는 long타입이라서 ""를 붙혀 강제로 문자열로 만들어준다
									pos=i;//뱅크.ac의 포스번째의 데이터를 수정하기위해서
									break;
							}
						}
					}else {
						status.setText("계좌번호에 공백이 있습니다");
						sno.requestFocus();
					}
				}
					
			});
			btnNewButton.setBounds(263, 109, 70, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBounds(118, 159, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(180, 156, 153, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(118, 190, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(180, 187, 153, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815 \uD655\uC778");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						if(pos>=0) {//pos가 -1일경우 오류가 나기에
							Account a = Bank.ac[pos];
							Long amt = Long.parseLong(amount.getText());
							a.setmName(mName.getText());
							a.setAmount(amt);
							
							status.setText("예금주:"+mName.getText()+","+"예금액:"+amt+"으로 수정되었습니다.");
						}
					}else if(mName.getText().equals("")){
						status.setText("예금주에 공백이 있습니다");
						mName.requestFocus();
					}else if(amount.getText().equals("")) {
						status.setText("예금액에 공백이 있습니다");
						amount.requestFocus();
					}
				}
			});
			btnNewButton_1.setBounds(180, 218, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(25, 25, 112));
			status.setBounds(12, 251, 426, 39);
		}
		return status;
	}
}
