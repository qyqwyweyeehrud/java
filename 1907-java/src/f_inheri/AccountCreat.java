package f_inheri;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AccountCreat extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sno;
	private JLabel lblNewLabel_2;
	private JTextField mName;
	private JLabel lblNewLabel_3;
	private JTextField amount;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public AccountCreat() {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getSno());
		add(getLblNewLabel_2());
		add(getMName());
		add(getLblNewLabel_3());
		add(getAmount());
		add(getBtnNewButton());
		add(getStatus());
		setVisible(true);

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC88C\uC0DD\uC131");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
			lblNewLabel.setBounds(12, 52, 426, 52);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(129, 117, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(204, 114, 116, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(129, 153, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(204, 150, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(129, 189, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getAmount() {
		if (amount == null) {
			amount = new JTextField();
			amount.setBounds(204, 186, 116, 21);
			amount.setColumns(10);
		}
		return amount;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCD94\uAC00");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//����׸��� �ԷµǾ��°� üũ
					if(!sno.getText().equals("") && !mName.getText().equals("") && !amount.getText().equals("")) {
						
							try {
								//���¹�ȣ�� �ߺ�����üũ
								for(int i = 0; i<Bank.count;i++) {
									Account a = Bank.ac[i];
									if(a.getsNo().equals(sno.getText())) {
										throw new IOException("���¹�ȣ�� �ߺ��Ǿ����ϴ�");//���ܸ� �Ϻη� �߻���Ű�°���//�̹����� ������ ������ catch�������� ��
									}//throw = �߻����Ѷ� // throws = ������
								}
								//Ʈ���̾ȿ� �����ȿ��� �������������� catch���� ���ä��
								//���ݾ��� ���ڷθ� �̷�������� üũ
								Long amt = Long.parseLong(amount.getText());//���ڷε��� ������ ���ڷ� �ٲ��ش�
								Account ac = new Account(mName.getText(),sno.getText(),amt);
								Bank.ac[Bank.count] = ac;
								Bank.count++;//count�� 100���� �۰ų������� �̶�� �������ɸ� ���� ���� ���α׷���
								
								status.setText(Bank.count + "��° ���� ��ϵǾ����ϴ�");
								mName.setText("");
								amount.setText("");
								sno.requestFocus();
								sno.selectAll();
							}catch(IOException ex2) {
								status.setText(ex2.getMessage());
								sno.requestFocus();
								sno.selectAll();
							}catch(Exception ex) {
								status.setText("���ݾ׿� ���ڳ� ������ �ֽ��ϴ�");
								amount.requestFocus();//Ŀ�� �̵���Ŵ
								amount.selectAll();//
							}
						
					}else {
						status.setText("�Է��׸��� Ȯ���ϼ���");
						sno.requestFocus();
					}
				}
			});
			btnNewButton.setBounds(179, 217, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(new Color(25, 25, 112));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(255, 192, 203));
			status.setBounds(129, 275, 191, 15);
		}
		return status;
	}
}
