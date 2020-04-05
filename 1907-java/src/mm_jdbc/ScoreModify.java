package mm_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class ScoreModify extends JInternalFrame {
	
	ScoreDao dao = new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private JTextField tScore;
	private JLabel label;
	private JTextField tSubject;
	private JLabel label_1;
	private JTextField tDate;
	private JLabel label_2;
	private JTextField tId;
	private JLabel label_3;
	private JLabel label_4;
	private JButton button;
	private JLabel label_5;
	private JTextField tSerial;
	private JButton button_1;
	private JTextField tName;
	private JLabel label_6;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreModify frame = new ScoreModify();
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
	public ScoreModify() {
		super("수정",false,true,true,true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		setBounds(100, 100, 267, 602);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getLabel_6());
		getContentPane().add(getLabel_4());
		getContentPane().add(getTScore());
		getContentPane().add(getTSubject());
		getContentPane().add(getTDate());
		getContentPane().add(getTId());
		getContentPane().add(getButton());
		getContentPane().add(getLabel_5());
		getContentPane().add(getButton_1());
		getContentPane().add(getTSerial());
		getContentPane().add(getTName());
		getContentPane().add(getStatus());

	}

	private JTextField getTScore() {
		if (tScore == null) {
			tScore = new JTextField();
			tScore.setHorizontalAlignment(SwingConstants.CENTER);
			tScore.setForeground(Color.DARK_GRAY);
			tScore.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tScore.setColumns(10);
			tScore.setBounds(12, 384, 225, 45);
		}
		return tScore;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC810\uC218");
			label.setForeground(Color.LIGHT_GRAY);
			label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label.setBounds(15, 385, 64, 21);
		}
		return label;
	}
	private JTextField getTSubject() {
		if (tSubject == null) {
			tSubject = new JTextField();
			tSubject.setHorizontalAlignment(SwingConstants.CENTER);
			tSubject.setForeground(Color.DARK_GRAY);
			tSubject.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tSubject.setColumns(10);
			tSubject.setBounds(12, 329, 225, 45);
		}
		return tSubject;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uACFC\uBAA9");
			label_1.setForeground(Color.LIGHT_GRAY);
			label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_1.setBounds(15, 330, 64, 21);
		}
		return label_1;
	}
	private JTextField getTDate() {
		if (tDate == null) {
			tDate = new JTextField();
			tDate.setHorizontalAlignment(SwingConstants.CENTER);
			tDate.setForeground(Color.DARK_GRAY);
			tDate.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tDate.setColumns(10);
			tDate.setBounds(12, 274, 225, 45);
		}
		return tDate;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC751\uC2DC\uC77C");
			label_2.setForeground(Color.LIGHT_GRAY);
			label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_2.setBounds(15, 275, 64, 21);
		}
		return label_2;
	}
	private JTextField getTId() {
		if (tId == null) {
			tId = new JTextField();
			tId.setEnabled(false);
			tId.setHorizontalAlignment(SwingConstants.CENTER);
			tId.setForeground(Color.DARK_GRAY);
			tId.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tId.setColumns(10);
			tId.setBounds(12, 166, 225, 45);
		}
		return tId;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC544\uC774\uB514");
			label_3.setForeground(Color.LIGHT_GRAY);
			label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_3.setBounds(15, 167, 64, 21);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC18C\uD658\uC0AC\uC815\uBCF4\uC218\uC815");
			label_4.setForeground(Color.BLACK);
			label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
			label_4.setBounds(12, 10, 391, 45);
		}
		return label_4;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\u25B6");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					ScoreVo vo = new ScoreVo();
						
					vo.setSerial(Integer.parseInt(tSerial.getText()));
					//vo.setmId(tId.getText());
					//vo.setmName(tName.getText());
					vo.setrDate(sdf.parse(tDate.getText()));
					vo.setSubject(tSubject.getText());
					vo.setScore(Integer.parseInt(tScore.getText()));
					
					int cnt =dao.update(vo);
					if(cnt>0) {
						status.setText("수정이 완료되었습니다");
					}else {
						status.setText("수정중 오류발생");
					}
					
					}catch(Exception ex) {
						
					}
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 30));
			button.setBorder(null);
			button.setBackground(new Color(165, 42, 42));
			button.setBounds(83, 458, 73, 61);
		}
		return button;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uAC80\uC0C9");
			label_5.setForeground(Color.LIGHT_GRAY);
			label_5.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_5.setBounds(16, 84, 53, 21);
		}
		return label_5;
	}
	private JTextField getTSerial() {
		if (tSerial == null) {
			tSerial = new JTextField();
			tSerial.setColumns(10);
			tSerial.setBounds(12, 80, 225, 45);
		}
		return tSerial;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\u25B6");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int serial = Integer.parseInt(tSerial.getText());
					ScoreVo vo = dao.search(serial);
					tId.setText("");
					tDate.setText("");
					tName.setText("");
					tSubject.setText("");
					tScore.setText("");
					if(vo ==null) {
						status.setText("자료가 없습니다");
						
					}else {
						tId.setText(vo.getmId());
						tName.setText(vo.getmName());
						tDate.setText(sdf.format(vo.getrDate()));
						tSubject.setText(vo.getSubject());
						tScore.setText(vo.getScore()+"");
						status.setText("자료를 수정하세요");
						
					
					}
					
				}
			});
			button_1.setForeground(Color.WHITE);
			button_1.setBorder(null);
			button_1.setBackground(new Color(178, 34, 34));
			button_1.setBounds(184, 85, 43, 34);
		}
		return button_1;
	}
	private JTextField getTName() {
		if (tName == null) {
			tName = new JTextField();
			tName.setEnabled(false);
			tName.setHorizontalAlignment(SwingConstants.CENTER);
			tName.setForeground(Color.DARK_GRAY);
			tName.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tName.setColumns(10);
			tName.setBounds(12, 219, 225, 45);
		}
		return tName;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC774\uB984");
			label_6.setForeground(Color.LIGHT_GRAY);
			label_6.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_6.setBounds(15, 220, 64, 21);
		}
		return label_6;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(Color.RED);
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setBounds(12, 439, 225, 15);
		}
		return status;
	}
}
