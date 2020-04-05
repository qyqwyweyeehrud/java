package semi;
//회원 로그인 창
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField cId;
	private JTextField cPwd;
	private JButton button;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCId());
		contentPane.add(getCPwd());
		contentPane.add(getButton());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		setVisible(true);
	}

	private JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setColumns(10);
			cId.setBounds(139, 98, 116, 21);
		}
		return cId;
	}
	private JTextField getCPwd() {
		if (cPwd == null) {
			cPwd = new JTextField();
			cPwd.setColumns(10);
			cPwd.setBounds(139, 125, 116, 21);
		}
		return cPwd;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uB85C\uADF8\uC778");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					boolean is_admin = false;
					if(is_admin) {
						AdminMain am = new AdminMain();
						
					}
					else {
						UserMain um = new UserMain();
						
						setVisible(false);
					}
					
						
					
					
					
				}
			});
			button.setBounds(115, 200, 97, 48);
		}
		return button;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uBE44\uBC00\uBC88\uD638");
			label.setBounds(70, 131, 57, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC544\uC774\uB514");
			label_1.setBounds(70, 98, 57, 15);
		}
		return label_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uB85C\uADF8\uC778");
			lblNewLabel.setBounds(115, 51, 128, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514\uAC00 \uC5C6\uB098\uC694?");
			lblNewLabel_1.setBounds(127, 283, 121, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Go");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserCreate uc = new UserCreate();
				}
			});
			btnNewButton.setBounds(249, 279, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC544\uC774\uB514\uB97C \uC783\uC73C\uC167\uB098\uC694?");
			lblNewLabel_2.setBounds(127, 315, 128, 15);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Go");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FindId fi = new FindId();
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(249, 311, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uCD08\uAE30\uD654\uBA74\uC73C\uB85C \uAC00\uAE30");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					FirstFrame ff = new FirstFrame();
					
				}
			});
			btnNewButton_2.setBounds(12, 10, 133, 23);
		}
		return btnNewButton_2;
	}
}
