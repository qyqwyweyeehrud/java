package J_collection;

import java.awt.EventQueue;
import java.util.List;
import java.util.Map;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ScoreInput extends JInternalFrame {
	Map<String , List<ScoreVo>> map;
	MemberMain mm;
	
	ButtonGroup group = new ButtonGroup();
	public JButton btnfind;
	private JLabel status;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_20;
	private JLabel label_22;
	private InputPanel panel;

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
		super("\uC131\uC801\uC785\uB825",false,true,true,true);
		getContentPane().setBackground(new Color(245, 245, 245));
		setBounds(100, 100, 305, 458);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnfind());
		getContentPane().add(getStatus());
		getContentPane().add(getLabel_5());
		getContentPane().add(getLabel_6());
		getContentPane().add(getLabel_11());
		getContentPane().add(getLabel_12());
		getContentPane().add(getLabel_13());
		getContentPane().add(getLabel_14());
		getContentPane().add(getLabel_15());
		getContentPane().add(getLabel_20());
		getContentPane().add(getLabel_22());
		getContentPane().add(getPanel());
		setVisible(true);

	}
	public ScoreInput(Map<String,List<ScoreVo>> map,MemberMain mm) {
		this();
		this.map = map;
		this.mm = mm;
		
		
	}
	
	public void sync() {
		Object[] obj = mm.getContentPane().getComponents();
		for(int i= 0; i< obj.length ; i++) {
			if(obj[i] instanceof ScoreSearch) {
				ScoreSearch ss = (ScoreSearch)obj[i];
				ss.btnfinddd.doClick();
			}
		}
	}
	
	
	private JButton getBtnfind() {
		if (btnfind == null) {
			btnfind = new JButton("\uC785\uB825");
			btnfind.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sno = panel.tsno.getText();
					String mName = panel.tmName.getText();
					int kor = Integer.parseInt(panel.tkor.getText());
					int eng = Integer.parseInt(panel.teng.getText());
					int mat = Integer.parseInt(panel.tmat.getText());
					String exam ="";
					int grade = 0;
					
					if(panel.rExam1.isSelected()) {
						exam = "중간고사";
					}else{
						exam = "기말고사";
					}
					
					grade = panel.cGrade.getSelectedIndex()+1;//인덱스는 0부터셈을하기때문에 +1
					
					ScoreVo vo = new ScoreVo(sno,mName,exam,grade,kor,eng,mat);
					
					panel.ttot.setText(vo.getTot()+"");
					panel.tavg.setText(String.format("%5.1f", vo.getAvg()));//전체 5자리에 숫자3자리,점1자리,소수점1자리
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.insert(vo);
					if(b) {
						status.setText("데이터가 저장되었습니다");
						sync();
					}else {
						status.setText("저장중에 오류가 발생했습니다");
					}
				}
			});
			btnfind.setForeground(Color.WHITE);
			btnfind.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			btnfind.setBackground(new Color(188, 143, 143));
			btnfind.setBounds(100, 308, 76, 32);
		}
		return btnfind;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(Color.WHITE);
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setBackground(new Color(188, 143, 143));
			status.setBounds(12, 350, 262, 61);
		}
		return status;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("");
			label_5.setOpaque(true);
			label_5.setBackground(new Color(188, 143, 143));
			label_5.setBounds(12, 10, 262, 5);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("");
			label_6.setOpaque(true);
			label_6.setBackground(new Color(188, 143, 143));
			label_6.setBounds(12, 10, 5, 341);
		}
		return label_6;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("");
			label_11.setOpaque(true);
			label_11.setForeground(new Color(188, 143, 143));
			label_11.setBackground(new Color(188, 143, 143));
			label_11.setBounds(269, 10, 5, 341);
		}
		return label_11;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("");
			label_12.setOpaque(true);
			label_12.setBackground(Color.GRAY);
			label_12.setBounds(15, 409, 262, 5);
		}
		return label_12;
	}
	private JLabel getLabel_13() {
		if (label_13 == null) {
			label_13 = new JLabel("");
			label_13.setOpaque(true);
			label_13.setBackground(Color.GRAY);
			label_13.setBounds(272, 13, 5, 401);
		}
		return label_13;
	}
	private JLabel getLabel_14() {
		if (label_14 == null) {
			label_14 = new JLabel("");
			label_14.setOpaque(true);
			label_14.setBackground(Color.GRAY);
			label_14.setBounds(12, 10, 7, 401);
		}
		return label_14;
	}
	private JLabel getLabel_15() {
		if (label_15 == null) {
			label_15 = new JLabel("");
			label_15.setOpaque(true);
			label_15.setBackground(Color.GRAY);
			label_15.setBounds(12, 12, 262, 5);
		}
		return label_15;
	}
	private JLabel getLabel_20() {
		if (label_20 == null) {
			label_20 = new JLabel("New label");
			label_20.setOpaque(true);
			label_20.setBackground(Color.GRAY);
			label_20.setBounds(102, 310, 76, 32);
		}
		return label_20;
	}
	private JLabel getLabel_22() {
		if (label_22 == null) {
			label_22 = new JLabel("\uC131\uC801\uC785\uB825");
			label_22.setHorizontalAlignment(SwingConstants.CENTER);
			label_22.setForeground(new Color(188, 143, 143));
			label_22.setFont(new Font("나눔고딕", Font.PLAIN, 18));
			label_22.setBounds(63, 25, 162, 27);
		}
		return label_22;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBorder(null);
			panel.setBounds(29, 51, 231, 253);
		}
		return panel;
	}
}
