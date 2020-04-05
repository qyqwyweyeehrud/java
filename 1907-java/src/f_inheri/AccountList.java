package f_inheri;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AccountList extends JPanel {
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public AccountList() {
		setBackground(new Color(255, 182, 193));
		setLayout(null);
		add(getLblNewLabel());
		add(getScrollPane());
		showList();

	}
	
	public void showList() {
		String str = "";
		DecimalFormat df = new DecimalFormat("##,###,###,###.#");//10,000,000,000.0
		
		for(int i = 0;i<Bank.count;i++) {
			Account a = Bank.ac[i];//ac는 Account형 타입/어카운트형 a에 i번째
			str += a.getsNo();//a가 가지고있는 예금주,금액,계좌번호르 가져옴
			str += "\t" +a.getmName();
			str += "\t" +df.format(a.getAmount());
			str += "\n";
			
		}
		textArea.setText(str);//set,추가하라
	}
	

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC88C \uBAA9\uB85D");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
			lblNewLabel.setBounds(12, 10, 426, 59);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 67, 426, 223);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
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
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638                \uC608\uAE08\uC8FC                \uC608\uAE08\uC794\uC561");
		}
		return lblNewLabel_1;
	}
}
