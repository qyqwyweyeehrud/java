package h_api;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class MessageExam extends JInternalFrame {
	private JPanel panel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageExam frame = new MessageExam();
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
	public MessageExam() {
		super("Message Format",false,true,true,true);
		setVisible(true);
		setBounds(100, 100, 349, 331);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnNewButton(), BorderLayout.EAST);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("DM\uBC1C\uC1A1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String[][] data = null;
					SimpleDateFormat sdf = new SimpleDateFormat("yy년MM월ss일");
					String now = sdf.format( new Date());
					data = new String[][] {
						{"11-111","홍길동","밥먹자","고객관리팀",now},
						{"22-222","일이제","공격 앞으로","전략팀",now},
						{"33-333","김도경,","데데데데데","기능팀",now},
						{"44-444","도경이","두두두두두","총무팀",now}
					};
					
					String dm ="우편번호:{0} \n고객명:{1} \n\n {2}"
							+ " \n\n 발송처:{3} \n\n{4}"
							+ "\n------------------------------------\n\n";
					
					StringBuilder sb = new StringBuilder();
					
					for(int i =0; i<data.length;i++) {
						String temp = MessageFormat.format(dm, data[i][0],data[i][1],data[i][2],data[i][3],data[i][4]);//==data[i]
						sb.append(temp);
					}
					
					textArea.setText(sb.toString());
				}
			});
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
