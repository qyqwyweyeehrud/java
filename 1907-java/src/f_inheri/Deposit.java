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



public class Deposit extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sno;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JTextField mName;
	private JLabel lblNewLabel_3;
	private JTextField amount;
	private JButton btnNewButton_1;
	
	private int pos;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Deposit() {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getSno());
		add(getBtnNewButton());
		add(getLblNewLabel_2());
		add(getMName());
		add(getLblNewLabel_3());
		add(getAmount());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC608 \uAE08");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
			lblNewLabel.setBounds(12, 44, 426, 43);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(86, 112, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(155, 109, 145, 21);
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
					
							String find = sno.getText();
							pos = -1;
							for(int i =0;i<Bank.ac.length;i++) {
								Account a = Bank.ac[i];
									if(a.getsNo().equals(find)) {
										mName.setText(a.getmName());
										pos = i;
										status.setText("입금하실 예금액을 넣어주세요");
										break;
								}
							}
						}catch(Exception ex) {
							status.setText("계좌 정보가 없습니다.");
							sno.requestFocus();
							sno.selectAll();
						}
					}else {
						status.setText("계좌 번호가 공백입니다.");
						sno.requestFocus();
						
					}
				}
			});
			btnNewButton.setBounds(312, 109, 68, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(86, 137, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setEditable(false);
			mName.setBounds(155, 134, 145, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(86, 162, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(155, 159, 145, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC608\uAE08\uCC98\uB9AC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Long amt = Long.parseLong(amount.getText());
							if(pos>=0) {
								Account a = Bank.ac[pos];
								long temp = a.getAmount()+amt;
								a.setAmount(temp);
								status.setText("예금성공>"+"예금액:"+amt + "잔고:"+temp);
						}
					}catch(Exception ex){
						status.setText("예금액에 문자나 공백이 있습니다.");
						amount.requestFocus();
						amount.selectAll();
					}
				}
			});
			btnNewButton_1.setBounds(179, 190, 97, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(new Color(25, 25, 112));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 244, 426, 15);
		}
		return status;
	}
}
