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

public class MyFirst extends JFrame {//MyFirst�� JFrame���� ��ӹ���

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��δ빮�ڸ� ���
		setBounds(100, 100, 424, 449);
		contentPane = new JPanel();//��������
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//�ܰ���
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
