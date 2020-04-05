package h_api2;

import javax.swing.JPanel;

import java.util.Objects;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class SortByscore extends JPanel {
	private JLabel lblNewLabel;
	public JLabel status;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public SortByscore(JLabel status) {
		this();
		this.status = status;
		sortList();
	}
	public SortByscore() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());

	}
	
	public void sortList() {
		int result = 0;
		Student temp = null;
		Student s1 =null;
		Student s2 =null;
		for(int i =0; i<StudentApp.count;i++) {
			for(int j = i+1 ; j<StudentApp.count;j++) {
				s1 = StudentApp.student[i];
				s2 = StudentApp.student[j];
				result = Objects.compare(s1,s2,new StudentComp('s'));
				if(result>0) {
					temp = StudentApp.student[i];
					StudentApp.student[i] =StudentApp.student[j];
					StudentApp.student[j] =temp;
				}
			}
		}
		textArea.setText("");
		for(int i =0; i<StudentApp.count;i++) {
			textArea.append(StudentApp.student[i]+"\n");
		}
		status.setText("성적순으로 정렬되었습니다");
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801\uC21C \uC815\uB82C");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 20));
			lblNewLabel.setForeground(new Color(139, 69, 19));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 0, 426, 36);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 35, 398, 255);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 16));
			textArea.setForeground(new Color(255, 255, 255));
			textArea.setBackground(new Color(85, 107, 47));
			textArea.setEditable(false);
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88                 \uC131\uBA85                 \uC131\uC801");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setForeground(new Color(222, 184, 135));
			lblNewLabel_1.setBackground(new Color(139, 69, 19));
		}
		return lblNewLabel_1;
	}
}
