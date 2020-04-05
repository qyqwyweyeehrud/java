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

public class ScoreInput extends JInternalFrame {
	private JTextField TSubject;
	private JLabel label;
	private JButton button;
	private JLabel label_1;
	private JTextField tScore;
	private JLabel label_2;
	private JTextField tDate;
	private JLabel label_3;
	private JTextField tMid;
	private JLabel label_4;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreInput frame = new ScoreInput();
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
	public ScoreInput() {
		super("입력",false,true,true,true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		setBounds(100, 100, 266, 493);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_4());
		getContentPane().add(getLabel_3());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTSubject());
		getContentPane().add(getButton());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTScore());
		getContentPane().add(getTDate());
		getContentPane().add(getTMid());
		getContentPane().add(getStatus());

	}
	private JTextField getTSubject() {
		if (TSubject == null) {
			TSubject = new JTextField();
			TSubject.setHorizontalAlignment(SwingConstants.CENTER);
			TSubject.setForeground(Color.DARK_GRAY);
			TSubject.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			TSubject.setColumns(10);
			TSubject.setBounds(12, 217, 225, 45);
		}
		return TSubject;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uACFC\uBAA9");
			label.setForeground(Color.LIGHT_GRAY);
			label.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label.setBounds(15, 218, 64, 21);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\u25B6");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					ScoreVo vo = new ScoreVo();
					vo.setmId(tMid.getText());
					vo.setrDate(sdf.parse(tDate.getText()));
					vo.setSubject(TSubject.getText());
					vo.setScore(Integer.parseInt(tScore.getText()));
					/*
					String tier ="";
					int a = Integer.parseInt(tScore.getText());
					if(a <=20) {
						tier = "아이언";
					}else if(a >20 && a<=40) {
						tier = "실버";
					}else if(a >40 && a<=60) {
						tier = "골드";
					}else if(a >60 && a<=80) {
						tier = "플레티넘";
					}else if(a >80 && a<=90) {
						tier = "다이아";
					}else if(a >90 && a<=95) {
						tier = "마스터";
					}else if(a >95 && a<=100) {
						tier = "챌린저";
					}
					*/
					ScoreDao dao = new ScoreDao();
					int cnt = dao.insert(vo);
					if(cnt>0) {
						status.setText("정보입력이 완료되었습니다");
					}else {
						status.setText("정보입력중 오류발생");
					}
					}catch(Exception ex){
						
					}
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 30));
			button.setBorder(null);
			button.setBackground(new Color(165, 42, 42));
			button.setBounds(83, 346, 73, 61);
		}
		return button;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC18C\uD658\uC0AC\uC815\uBCF4\uC785\uB825");
			label_1.setForeground(Color.BLACK);
			label_1.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 24));
			label_1.setBounds(12, 38, 391, 45);
		}
		return label_1;
	}
	private JTextField getTScore() {
		if (tScore == null) {
			tScore = new JTextField();
			tScore.setHorizontalAlignment(SwingConstants.CENTER);
			tScore.setForeground(Color.DARK_GRAY);
			tScore.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tScore.setColumns(10);
			tScore.setBounds(12, 272, 225, 45);
		}
		return tScore;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC810\uC218");
			label_2.setForeground(Color.LIGHT_GRAY);
			label_2.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_2.setBounds(15, 273, 64, 21);
		}
		return label_2;
	}
	private JTextField getTDate() {
		if (tDate == null) {
			tDate = new JTextField();
			tDate.setHorizontalAlignment(SwingConstants.CENTER);
			tDate.setForeground(Color.DARK_GRAY);
			tDate.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tDate.setColumns(10);
			tDate.setBounds(12, 162, 225, 45);
			
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			tDate.setText(sdf.format(d));
		}
		return tDate;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC751\uC2DC\uC77C");
			label_3.setForeground(Color.LIGHT_GRAY);
			label_3.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_3.setBounds(15, 163, 64, 21);
		}
		return label_3;
	}
	private JTextField getTMid() {
		if (tMid == null) {
			tMid = new JTextField();
			tMid.setHorizontalAlignment(SwingConstants.CENTER);
			tMid.setForeground(Color.DARK_GRAY);
			tMid.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			tMid.setColumns(10);
			tMid.setBounds(12, 107, 225, 45);
		}
		return tMid;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC544\uC774\uB514");
			label_4.setForeground(Color.LIGHT_GRAY);
			label_4.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 11));
			label_4.setBounds(15, 108, 64, 21);
		}
		return label_4;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setForeground(Color.RED);
			status.setBounds(12, 327, 225, 15);
		}
		return status;
	}
}
