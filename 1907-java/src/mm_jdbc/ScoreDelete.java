package mm_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ScoreDelete extends JInternalFrame {
	
	ScoreDao dao = new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private JButton button;
	private JTextField tSco;
	private JTextField tSub;
	private JTextField tDate;
	private JTextField tName;
	private JTextField tId;
	private JTextField tserial;
	private JButton button_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel tSubject;
	private JLabel tScore;
	private JLabel label_6;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreDelete frame = new ScoreDelete();
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
	public ScoreDelete() {
		super("»èÁ¦",false,true,true,true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		setBounds(100, 100, 272, 603);
		getContentPane().setLayout(null);
		getContentPane().add(getButton());
		getContentPane().add(getButton_1());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_2());
		getContentPane().add(getLabel_3());
		getContentPane().add(getTSubject());
		getContentPane().add(getTScore());
		getContentPane().add(getLabel_6());
		getContentPane().add(getTSco());
		getContentPane().add(getTSub());
		getContentPane().add(getTDate());
		getContentPane().add(getTName());
		getContentPane().add(getTId());
		getContentPane().add(getTserial());
		getContentPane().add(getStatus());

	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("\u25B6");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int ser = Integer.parseInt(tserial.getText());
					int cnt = dao.delete(ser);
					if(cnt>0) {
						status.setText("ÀÚ·á°¡ »èÁ¦µÇ¾ú½À´Ï´Ù");
						tId.setText("");
						tName.setText("");
						tDate.setText("");
						tSco.setText("");
						tSub.setText("");
						tserial.requestFocus();
						tserial.selectAll();
					}else {
						status.setText("ÀÚ·á »èÁ¦Áß ¿À·ù¹ß»ý");
					}
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.BOLD, 30));
			button.setBorder(null);
			button.setBackground(new Color(165, 42, 42));
			button.setBounds(83, 458, 73, 61);
		}
		return button;
	}
	private JTextField getTSco() {
		if (tSco == null) {
			tSco = new JTextField();
			tSco.setHorizontalAlignment(SwingConstants.CENTER);
			tSco.setForeground(Color.DARK_GRAY);
			tSco.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tSco.setColumns(10);
			tSco.setBounds(12, 384, 225, 45);
		}
		return tSco;
	}
	private JTextField getTSub() {
		if (tSub == null) {
			tSub = new JTextField();
			tSub.setHorizontalAlignment(SwingConstants.CENTER);
			tSub.setForeground(Color.DARK_GRAY);
			tSub.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tSub.setColumns(10);
			tSub.setBounds(12, 329, 225, 45);
		}
		return tSub;
	}
	private JTextField getTDate() {
		if (tDate == null) {
			tDate = new JTextField();
			tDate.setHorizontalAlignment(SwingConstants.CENTER);
			tDate.setForeground(Color.DARK_GRAY);
			tDate.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tDate.setColumns(10);
			tDate.setBounds(12, 274, 225, 45);
		}
		return tDate;
	}
	private JTextField getTName() {
		if (tName == null) {
			tName = new JTextField();
			tName.setHorizontalAlignment(SwingConstants.CENTER);
			tName.setForeground(Color.DARK_GRAY);
			tName.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tName.setColumns(10);
			tName.setBounds(12, 219, 225, 45);
		}
		return tName;
	}
	private JTextField getTId() {
		if (tId == null) {
			tId = new JTextField();
			tId.setHorizontalAlignment(SwingConstants.CENTER);
			tId.setForeground(Color.DARK_GRAY);
			tId.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tId.setColumns(10);
			tId.setBounds(12, 166, 225, 45);
		}
		return tId;
	}
	private JTextField getTserial() {
		if (tserial == null) {
			tserial = new JTextField();
			tserial.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tserial.setColumns(10);
			tserial.setBounds(12, 80, 225, 45);
		}
		return tserial;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\u25B6");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int serial = Integer.parseInt(tserial.getText());
					ScoreVo vo = dao.search(serial);
					tId.setText("");
					tDate.setText("");
					tName.setText("");
					tSubject.setText("");
					tScore.setText("");
					if(vo ==null) {
						status.setText("ÀÚ·á°¡ ¾ø½À´Ï´Ù");
						
					}else {
						tId.setText(vo.getmId());
						tName.setText(vo.getmName());
						tDate.setText(sdf.format(vo.getrDate()));
						tSub.setText(vo.getSubject());
						tSco.setText(vo.getScore()+"");
						status.setText("ÀÚ·á¸¦ »èÁ¦ÇÏ¼¼¿ä");
						
					
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
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uAC80\uC0C9");
			label.setForeground(Color.LIGHT_GRAY);
			label.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 11));
			label.setBounds(16, 84, 53, 21);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC544\uC774\uB514");
			label_1.setForeground(Color.LIGHT_GRAY);
			label_1.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 11));
			label_1.setBounds(15, 167, 64, 21);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC774\uB984");
			label_2.setForeground(Color.LIGHT_GRAY);
			label_2.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 11));
			label_2.setBounds(15, 220, 64, 21);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC751\uC2DC\uC77C");
			label_3.setForeground(Color.LIGHT_GRAY);
			label_3.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 11));
			label_3.setBounds(15, 275, 64, 21);
		}
		return label_3;
	}
	private JLabel getTSubject() {
		if (tSubject == null) {
			tSubject = new JLabel("\uACFC\uBAA9");
			tSubject.setForeground(Color.LIGHT_GRAY);
			tSubject.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 11));
			tSubject.setBounds(15, 330, 64, 21);
		}
		return tSubject;
	}
	private JLabel getTScore() {
		if (tScore == null) {
			tScore = new JLabel("\uC810\uC218");
			tScore.setForeground(Color.LIGHT_GRAY);
			tScore.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 11));
			tScore.setBounds(15, 385, 64, 21);
		}
		return tScore;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC18C\uD658\uC0AC\uC815\uBCF4\uC0AD\uC81C");
			label_6.setForeground(Color.BLACK);
			label_6.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 24));
			label_6.setBounds(12, 10, 391, 45);
		}
		return label_6;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(Color.RED);
			status.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			status.setBounds(12, 439, 225, 15);
		}
		return status;
	}
}
