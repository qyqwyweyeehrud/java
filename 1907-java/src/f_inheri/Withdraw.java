package f_inheri;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Withdraw extends JPanel {
	private JLabel lblNewLabel;
	private JTextField sno;
	private JButton btnNewButton;
	private JTextField mName;
	private JLabel lblNewLabel_1;
	private JTextField amount;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField wamt;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_1;
	
	private int pos;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Withdraw() {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		add(getLblNewLabel());
		add(getSno());
		add(getBtnNewButton());
		add(getMName());
		add(getLblNewLabel_1());
		add(getAmount());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getWamt());
		add(getLblNewLabel_4());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCD9C \uAE08");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBounds(12, 40, 429, 47);
		}
		return lblNewLabel;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(146, 97, 158, 21);
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
						
						
						
						try {
							DecimalFormat df = new DecimalFormat("##,###,###,###.#");
							String find = sno.getText();
							pos = -1;
								for(int i =0;i<=Bank.count;i++) {
									Account a = Bank.ac[i];
										if(find.equals(a.getsNo())) {
											mName.setText(a.getmName());
											amount.setText(df.format(a.getAmount()));
											pos = i;
											status.setText("출금할 출금액을 입력해주세요");
											break;
										}
						
								}
							}catch(Exception ex) {
								status.setText("계좌 정보가 없습니다");
								mName.setText("");
								amount.setText("");
								sno.requestFocus();
								sno.selectAll();
							}
						
						
					}else {
					status.setText("계좌 번호에 공백이 있습니다");
					mName.setText("");
					amount.setText("");
					wamt.setText("");
					}
				}
			});
			btnNewButton.setBounds(316, 97, 65, 23);
		}
		return btnNewButton;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setEditable(false);
			mName.setBounds(146, 128, 158, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(90, 128, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setEditable(false);
			amount.setBounds(146, 159, 158, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(90, 97, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uD604 \uC794\uC561");
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(90, 159, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getWamt() {
		if (wamt == null) {
			wamt = new JTextField();
			wamt.setBounds(146, 190, 158, 21);
			wamt.setColumns(10);
		}
		return wamt;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uCD9C\uAE08\uC561");
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setBounds(90, 187, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uCD9C\uAE08");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					Long amt = Long.parseLong(wamt.getText());
						if(pos>=0) {
							Account a = Bank.ac[pos];
							if(a.getAmount()<amt) {
								status.setText("잔고가 부족합니다");
								wamt.requestFocus();
								wamt.selectAll();
								
							}else {
							long temp = a.getAmount() - amt;
							a.setAmount(temp);
							status.setText("출금 되었습니다>"+"출금액:"+amt+"잔고:"+temp);
							
							wamt.setText("");
							wamt.requestFocus();
							}
						}
					}catch(Exception ex) {
						status.setText("출금액에 문자나 공백이 있습니다");
						wamt.requestFocus();
						wamt.selectAll();
						
					}
				}
			});
			btnNewButton_1.setBounds(178, 224, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(25, 25, 112));
			status.setBounds(12, 264, 429, 15);
		}
		return status;
	}
}
