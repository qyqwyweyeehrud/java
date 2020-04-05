package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MemberSelect extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;
	private JLabel lblt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberSelect frame = new MemberSelect();
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
	public MemberSelect() {
		super("회원조회",false,true,true,true);
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 410, 614);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getFind());
		getContentPane().add(getScrollPane());
		getContentPane().add(getLblNewLabel_1());
		setVisible(true);

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC870\uD68C");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.PLAIN, 15));
			lblNewLabel.setBounds(12, 20, 151, 15);
		}
		return lblNewLabel;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(14, 122, 370, 41);
			find.setColumns(10);
		}
		return find;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u25B6");
			btnNewButton.setBorder(null);
			btnNewButton.setFont(new Font("굴림", Font.PLAIN, 26));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(178, 34, 34));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDao dao = new MemberDao();
					String f = find.getText();
					List<MemberVo> list = dao.select(f);//멤버디에이오에 f를 던져서 리스트에 담을것이다
					
					textArea.setText("");
					for(MemberVo vo : list) {
						textArea.append(vo.toString());
					}
				}
			});
			btnNewButton.setBounds(321, 126, 59, 33);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 194, 403, 381);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblt());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\i3695141694.gif"));
			lblNewLabel_1.setBounds(-220, 10, 623, 174);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblt() {
		if (lblt == null) {
			lblt = new JLabel(" \uC544\uC774\uB514                        \uC774\uB984               \uAC00\uC785\uB0A0\uC9DC          \uD2F0\uC5B4");
		}
		return lblt;
	}
}
