package f_inheri;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class MyFirst extends JFrame {//MyFirst는 JFrame에게 상속받음

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirst frame = new MyFirst();
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
	public MyFirst() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//모두대문자면 상수
		setBounds(100, 100, 424, 449);
		contentPane = new JPanel();//셀로판지
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//외곽선
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 35));
			panel.setLayout(new BorderLayout(0, 0));
		}
		return panel;
	}
}
