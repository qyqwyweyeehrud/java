package J_collection;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class InputPanel extends JPanel {
	ButtonGroup group = new ButtonGroup();
	
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	public JTextField tavg;
	public JTextField ttot;
	public JTextField tmat;
	public JTextField teng;
	public JTextField tkor;
	public JTextField tmName;
	public JTextField tsno;
	public JRadioButton rExam1;
	public JRadioButton rExam2;
	public JComboBox cGrade;
	private JLabel label_25;

	/**
	 * Create the panel.
	 */
	public InputPanel() {
		setBackground(new Color(245, 245, 245));
		setLayout(null);
		add(getLabel_9());
		add(getLabel_10());
		add(getLabel_11());
		add(getLabel_12());
		add(getLabel_13());
		add(getLabel_14());
		add(getLabel_15());
		add(getLabel_16());
		add(getLabel_17());
		add(getLabel_18());
		add(getLabel_19());
		add(getLabel_20());
		add(getLabel_21());
		add(getLabel_22());
		add(getLabel_23());
		add(getLabel_24());
		add(getTavg());
		add(getTtot());
		add(getTmat());
		add(getTeng());
		add(getTkor());
		add(getTmName());
		add(getTsno());
		add(getLabel());
		add(getLabel_1());
		add(getLabel_2());
		add(getLabel_3());
		add(getLabel_4());
		add(getLabel_5());
		add(getLabel_6());
		add(getLabel_7());
		add(getLabel_8());
		add(getRExam1());
		add(getRExam2());
		add(getCGrade());
		add(getLabel_25());

	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setOpaque(true);
			label.setBackground(Color.GRAY);
			label.setBounds(88, 12, 116, 21);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setOpaque(true);
			label_1.setBackground(Color.GRAY);
			label_1.setBounds(88, 37, 116, 21);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("New label");
			label_2.setOpaque(true);
			label_2.setBackground(Color.GRAY);
			label_2.setBounds(88, 113, 116, 21);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("New label");
			label_3.setOpaque(true);
			label_3.setBackground(Color.GRAY);
			label_3.setBounds(88, 138, 116, 21);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("New label");
			label_4.setOpaque(true);
			label_4.setBackground(Color.GRAY);
			label_4.setBounds(88, 163, 116, 21);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("New label");
			label_5.setOpaque(true);
			label_5.setBackground(Color.GRAY);
			label_5.setBounds(88, 188, 116, 21);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("New label");
			label_6.setOpaque(true);
			label_6.setBackground(Color.GRAY);
			label_6.setBounds(88, 213, 116, 21);
		}
		return label_6;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("New label");
			label_7.setPreferredSize(new Dimension(3, 5));
			label_7.setOpaque(true);
			label_7.setForeground(new Color(188, 143, 143));
			label_7.setBackground(new Color(188, 143, 143));
			label_7.setBounds(12, 13, 3, 15);
		}
		return label_7;
	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("New label");
			label_8.setPreferredSize(new Dimension(3, 5));
			label_8.setOpaque(true);
			label_8.setForeground(new Color(188, 143, 143));
			label_8.setBackground(new Color(188, 143, 143));
			label_8.setBounds(12, 38, 3, 15);
		}
		return label_8;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("New label");
			label_9.setPreferredSize(new Dimension(3, 5));
			label_9.setOpaque(true);
			label_9.setForeground(new Color(188, 143, 143));
			label_9.setBackground(new Color(188, 143, 143));
			label_9.setBounds(12, 64, 3, 15);
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("New label");
			label_10.setPreferredSize(new Dimension(3, 5));
			label_10.setOpaque(true);
			label_10.setForeground(new Color(188, 143, 143));
			label_10.setBackground(new Color(188, 143, 143));
			label_10.setBounds(12, 89, 3, 15);
		}
		return label_10;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("New label");
			label_11.setPreferredSize(new Dimension(3, 5));
			label_11.setOpaque(true);
			label_11.setForeground(new Color(188, 143, 143));
			label_11.setBackground(new Color(188, 143, 143));
			label_11.setBounds(12, 114, 3, 15);
		}
		return label_11;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("New label");
			label_12.setPreferredSize(new Dimension(3, 5));
			label_12.setOpaque(true);
			label_12.setForeground(new Color(188, 143, 143));
			label_12.setBackground(new Color(188, 143, 143));
			label_12.setBounds(12, 139, 3, 15);
		}
		return label_12;
	}
	private JLabel getLabel_13() {
		if (label_13 == null) {
			label_13 = new JLabel("New label");
			label_13.setPreferredSize(new Dimension(3, 5));
			label_13.setOpaque(true);
			label_13.setForeground(new Color(188, 143, 143));
			label_13.setBackground(new Color(188, 143, 143));
			label_13.setBounds(12, 164, 3, 15);
		}
		return label_13;
	}
	private JLabel getLabel_14() {
		if (label_14 == null) {
			label_14 = new JLabel("New label");
			label_14.setPreferredSize(new Dimension(3, 5));
			label_14.setOpaque(true);
			label_14.setForeground(new Color(188, 143, 143));
			label_14.setBackground(new Color(188, 143, 143));
			label_14.setBounds(12, 188, 3, 15);
		}
		return label_14;
	}
	private JLabel getLabel_15() {
		if (label_15 == null) {
			label_15 = new JLabel("New label");
			label_15.setPreferredSize(new Dimension(3, 5));
			label_15.setOpaque(true);
			label_15.setForeground(new Color(188, 143, 143));
			label_15.setBackground(new Color(188, 143, 143));
			label_15.setBounds(12, 213, 3, 15);
		}
		return label_15;
	}
	private JLabel getLabel_16() {
		if (label_16 == null) {
			label_16 = new JLabel("\uD559\uBC88");
			label_16.setForeground(new Color(128, 0, 0));
			label_16.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_16.setBounds(17, 13, 57, 15);
		}
		return label_16;
	}
	private JLabel getLabel_17() {
		if (label_17 == null) {
			label_17 = new JLabel("\uC131\uBA85");
			label_17.setForeground(new Color(128, 0, 0));
			label_17.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_17.setBounds(17, 38, 57, 15);
		}
		return label_17;
	}
	private JLabel getLabel_18() {
		if (label_18 == null) {
			label_18 = new JLabel("\uC2DC\uD5D8\uC885\uB958");
			label_18.setForeground(new Color(128, 0, 0));
			label_18.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_18.setBounds(17, 64, 57, 15);
		}
		return label_18;
	}
	private JLabel getLabel_19() {
		if (label_19 == null) {
			label_19 = new JLabel("\uD559\uB144");
			label_19.setForeground(new Color(128, 0, 0));
			label_19.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_19.setBounds(17, 89, 57, 15);
		}
		return label_19;
	}
	private JLabel getLabel_20() {
		if (label_20 == null) {
			label_20 = new JLabel("\uAD6D\uC5B4");
			label_20.setForeground(new Color(128, 0, 0));
			label_20.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_20.setBounds(17, 114, 57, 15);
		}
		return label_20;
	}
	private JLabel getLabel_21() {
		if (label_21 == null) {
			label_21 = new JLabel("\uC601\uC5B4");
			label_21.setForeground(new Color(128, 0, 0));
			label_21.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_21.setBounds(17, 139, 57, 15);
		}
		return label_21;
	}
	private JLabel getLabel_22() {
		if (label_22 == null) {
			label_22 = new JLabel("\uC218\uD559");
			label_22.setForeground(new Color(128, 0, 0));
			label_22.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_22.setBounds(17, 164, 57, 15);
		}
		return label_22;
	}
	private JLabel getLabel_23() {
		if (label_23 == null) {
			label_23 = new JLabel("\uCD1D\uC810");
			label_23.setForeground(new Color(128, 0, 0));
			label_23.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_23.setBounds(17, 189, 57, 15);
		}
		return label_23;
	}
	private JLabel getLabel_24() {
		if (label_24 == null) {
			label_24 = new JLabel("\uD3C9\uADE0");
			label_24.setForeground(new Color(128, 0, 0));
			label_24.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			label_24.setBounds(17, 214, 57, 15);
		}
		return label_24;
	}
	private JTextField getTavg() {
		if (tavg == null) {
			tavg = new JTextField();
			tavg.setEditable(false);
			tavg.setHorizontalAlignment(SwingConstants.LEFT);
			tavg.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tavg.setColumns(10);
			tavg.setBorder(null);
			tavg.setBounds(86, 211, 116, 21);
		}
		return tavg;
	}
	private JTextField getTtot() {
		if (ttot == null) {
			ttot = new JTextField();
			ttot.setEditable(false);
			ttot.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			ttot.setColumns(10);
			ttot.setBorder(null);
			ttot.setBounds(86, 186, 116, 21);
		}
		return ttot;
	}
	private JTextField getTmat() {
		if (tmat == null) {
			tmat = new JTextField();
			tmat.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tmat.setColumns(10);
			tmat.setBorder(null);
			tmat.setBounds(86, 161, 116, 21);
		}
		return tmat;
	}
	private JTextField getTeng() {
		if (teng == null) {
			teng = new JTextField();
			teng.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			teng.setColumns(10);
			teng.setBorder(null);
			teng.setBackground(Color.WHITE);
			teng.setBounds(86, 136, 116, 21);
		}
		return teng;
	}
	private JTextField getTkor() {
		if (tkor == null) {
			tkor = new JTextField();
			tkor.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tkor.setColumns(10);
			tkor.setBorder(null);
			tkor.setBounds(86, 111, 116, 21);
		}
		return tkor;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tmName.setColumns(10);
			tmName.setBorder(null);
			tmName.setBounds(86, 35, 116, 21);
		}
		return tmName;
	}
	private JTextField getTsno() {
		if (tsno == null) {
			tsno = new JTextField();
			tsno.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			tsno.setColumns(10);
			tsno.setBorder(null);
			tsno.setBackground(Color.WHITE);
			tsno.setBounds(86, 10, 116, 21);
		}
		return tsno;
	}
	private JRadioButton getRExam1() {
		if (rExam1 == null) {
			rExam1 = new JRadioButton("\uC911\uAC04");
			group.add(rExam1);
			rExam1.setSelected(true);
			rExam1.setForeground(new Color(188, 143, 143));
			rExam1.setSelected(true);
			rExam1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			rExam1.setBackground(new Color(245, 245, 245));
			rExam1.setBounds(86, 60, 49, 23);
		}
		return rExam1;
	}
	private JRadioButton getRExam2() {
		if (rExam2 == null) {
			rExam2 = new JRadioButton("\uAE30\uB9D0");
			group.add(rExam2);
			rExam2.setForeground(new Color(188, 143, 143));
			rExam2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			rExam2.setBackground(new Color(245, 245, 245));
			rExam2.setBounds(153, 60, 49, 23);
		}
		return rExam2;
	}
	private JComboBox getCGrade() {
		if (cGrade == null) {
			cGrade = new JComboBox();
			cGrade.setForeground(new Color(255, 255, 255));
			cGrade.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 12));
			cGrade.setBackground(new Color(188, 143, 143));
			cGrade.setBounds(86, 86, 116, 21);
			cGrade.addItem("1ÇÐ³â");
			cGrade.addItem("2ÇÐ³â");
			cGrade.addItem("3ÇÐ³â");
			cGrade.addItem("4ÇÐ³â");
			cGrade.setSelectedIndex(0);
			
		}
		return cGrade;
	}
	private JLabel getLabel_25() {
		if (label_25 == null) {
			label_25 = new JLabel("New label");
			label_25.setOpaque(true);
			label_25.setBackground(Color.GRAY);
			label_25.setBounds(88, 88, 116, 21);
		}
		return label_25;
	}
}
