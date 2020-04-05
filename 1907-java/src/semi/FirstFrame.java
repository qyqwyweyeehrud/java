package semi;
/*
초기화면
로그인창 / 손님id로 로그인하면 손님 전용 프레임 띄움
관리자 ID로 로그인 하면 관리자 전용 프레임 띄움
회원가입 버튼을 클릭하면 회원가입 프레임 띄움 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import f_inheri.AccountCreat;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;

public class FirstFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton_2;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
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
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getLblNewLabel(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getPanel_1(), BorderLayout.CENTER);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("book cafe");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(Color.ORANGE);
			lblNewLabel.setPreferredSize(new Dimension(57, 100));
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 80));
			panel.setLayout(null);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getBtnNewButton_2());
			panel_1.add(getButton());
		}
		return panel_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uD68C\uC6D0");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login ac = new Login();
					ac.toFront();
				}
			});
			btnNewButton_2.setBounds(39, 56, 270, 284);
		}
		return btnNewButton_2;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uAD00\uB9AC\uC790");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login ac = new Login();
					ac.toFront();
					
				}
			});
			button.setBounds(321, 56, 270, 284);
		}
		return button;
	}
}
