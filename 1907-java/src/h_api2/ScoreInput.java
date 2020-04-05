0package h_api2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class ScoreInput extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField sno;
	private JTextField mName;
	private JTextField score;
	private JButton btnNewButton;
	public JLabel status;
	/**
	 * Create the panel.
	 */
	public ScoreInput(JLabel status) {//status넘겨받기
		this();//매개변수가없는 자기자신의 생성자 호출
		this.status = status;//생성자를 오버로딩해서 왜? 매개변수를 왜? 필드에 status를 왜선언했지
		
		
	}
	public ScoreInput() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getSno());
		add(getMName());
		add(getScore());
		add(getBtnNewButton());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel.setForeground(new Color(139, 69, 19));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 17));
			lblNewLabel.setBounds(12, 63, 426, 38);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(140, 111, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uC0DD\uBA85");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(140, 139, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC131\uC801");
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(140, 167, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(189, 108, 116, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(189, 136, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getScore() {
		if (score == null) {
			score = new JTextField();
			score.setBounds(189, 164, 116, 21);
			score.setColumns(10);
		}
		return score;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC131\uC801\uC785\uB825");
			btnNewButton.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			btnNewButton.setForeground(new Color(222, 184, 135));
			btnNewButton.setBackground(new Color(139, 69, 19));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int no = Integer.parseInt(sno.getText());
					String irum = mName.getText();
					int s = Integer.parseInt(score.getText());
					
					Student std = new Student(no,irum,s);
					StudentApp.student[StudentApp.count] = std;
					StudentApp.count++;
					
					status.setText(StudentApp.count+"번째 성적이 추가됨");
				}
			});
			btnNewButton.setBounds(176, 192, 108, 32);
		}
		return btnNewButton;
	}
}
