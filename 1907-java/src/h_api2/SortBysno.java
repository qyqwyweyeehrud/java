package h_api2;

import javax.swing.JPanel;

import java.util.Objects;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class SortBysno extends JPanel {
	private JLabel lblNewLabel;
	public JLabel status;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	
	public SortBysno(JLabel status) {
		this();
		this.status = status;
		sortList();
	}
	public SortBysno() {
		setBackground(new Color(222, 184, 135));
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());

	}
	public void sortList() {
		Student temp = null;
		int  result = 0;
		for(int i=0;i<StudentApp.count-1;i++) {
			for(int j =i+1;j<StudentApp.count;j++) {
				Student s1 = StudentApp.student[i];
				Student s2 = StudentApp.student[j];
				result = Objects.compare(s1, s2, new StudentComp('n'));
				if(result>0) {
					temp = StudentApp.student[i];
					StudentApp.student[i] =StudentApp.student[j];;
					StudentApp.student[j] = temp;
				}
			}
		}
		textArea.setText("");//기존에 표시된 내용을 모두삭제
		for(int i =0;i<StudentApp.count;i++) {
			textArea.append(StudentApp.student[i]+"\n");
		}
		status.setText("데이터가 학번순으로 정렬되었습니다.");
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88\uC21C \uC815\uB82C");
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
			scrollPane.setBounds(12, 35, 426, 255);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 16));
			textArea.setForeground(new Color(255, 255, 255));
			textArea.setBackground(new Color(85, 107, 47));
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88             \uC774\uB984             \uC131\uC801");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
			lblNewLabel_1.setForeground(new Color(222, 184, 135));
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(new Color(139, 69, 19));
		}
		return lblNewLabel_1;
	}
}
