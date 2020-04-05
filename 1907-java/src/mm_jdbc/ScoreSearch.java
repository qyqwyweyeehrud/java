package mm_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ScoreSearch extends JInternalFrame {
	
	ScoreDao dao= new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	private JLabel label;
	private JButton button;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JLabel label_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreSearch frame = new ScoreSearch();
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
	public ScoreSearch() {
		super("¼öÁ¤",false,true,true,true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		setBounds(100, 100, 425, 590);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getButton());
		getContentPane().add(getTextField());
		getContentPane().add(getLabel_1());
		getContentPane().add(getScrollPane());

	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC870\uD68C");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Å¸ÀÌÆ÷_½Ö¹®µ¿ B", Font.PLAIN, 15));
			label.setBounds(14, 10, 151, 15);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\u25B6");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String find = textField.getText();
					List<ScoreVo> list = dao.select(find);		
					for(ScoreVo vo : list) {
						textArea.append(vo.toString());
					}
				}
			});
			button.setForeground(Color.WHITE);
			button.setFont(new Font("±¼¸²", Font.PLAIN, 26));
			button.setBorder(null);
			button.setBackground(new Color(178, 34, 34));
			button.setBounds(323, 116, 59, 33);
		}
		return button;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(16, 112, 370, 41);
		}
		return textField;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(2, 184, 403, 381);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon("C:\\Users\\JHTA\\Pictures\\i3695141694.gif"));
			label_1.setBounds(-218, 0, 623, 174);
		}
		return label_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
