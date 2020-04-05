package homwork;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardSearch extends JInternalFrame {
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardSearch frame = new BoardSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public void sortList() {
		
		/*
		BoardVo temp = null;
	      int result = 0;
	      for(int i = 0; i<BoardMain.count-1; i++) {
	         for(int j=(i+1); j<BoardMain.count; j++) {
	            BoardVo s1 = BoardMain.data[i];
	            BoardVo s2 = BoardMain.data[j];
	            result = Objects.compare(s1, s2, new BoardComparator('n'));
	            if(result<0) {
	               temp = BoardMain.data[i];
	               BoardMain.data[i] = BoardMain.data[j];
	               BoardMain.data[j] = temp;
	            } // if
	         } // j
	      } // i
	      */
		Collections.sort(Arrays.asList(BoardMain.data), new BoardComparator());//위에 버블소트말고 이 문장하나도 소트가됨
																			//여기에 생성자에 값을전달해서 a면 어센딩 b면 디센딩 으로 
	      
	      textArea.setText("");
	      for(int i=0; i<BoardMain.count;i++) {
	         textArea.append(BoardMain.data[i].toString() + "\n");
	      }
	   


		
	}

	/**
	 * Create the frame.
	 */
	public BoardSearch() {
		super("Board Search",false,true,true,true);
		getContentPane().setBackground(new Color(245, 222, 179));
		setVisible(true);
		setBounds(100, 100, 318, 329);
		getContentPane().setLayout(null);
		getContentPane().add(getScrollPane());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnNewButton());

	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 66, 278, 224);
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
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC791\uC131\uC77C\uC21C \uC870\uD68C");
			lblNewLabel.setForeground(new Color(0, 0, 0));
			lblNewLabel.setBackground(new Color(0, 100, 0));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
			lblNewLabel.setBounds(12, 24, 278, 32);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC791\uC131\uC77C\uC21C \uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sortList();
				}
			});
			btnNewButton.setBounds(32, 10, 97, 23);
		}
		return btnNewButton;
	}
}
