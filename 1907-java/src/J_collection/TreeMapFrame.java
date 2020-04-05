package J_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class TreeMapFrame extends JInternalFrame {
	TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeMapFrame frame = new TreeMapFrame();
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
	public TreeMapFrame() {
		super("TreeMap",false,true,true,true);
		setBounds(100, 100, 355, 389);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());
		setVisible(true);
	}
	
	public void process() {
		scores = new TreeMap<Integer,String>();
		scores.put(80, "kim");
		scores.put(70, "park");
		scores.put(30, "tee");
		scores.put(50, "yee");
		
		textArea.setText("");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		textArea.append("최소값:"+entry.getKey()+">"+entry.getValue()+"\n");
		entry = scores.lastEntry();
		textArea.append("최대값:"+entry.getKey() + ">"+ entry.getValue()+"\n");
		entry = scores.lowerEntry(55);
		textArea.append("55점아래:"+entry.getKey() + ">" +entry.getValue()+"\n");
		entry = scores.higherEntry(70);
		textArea.append("70점이상:" +entry.getKey() + ">" +entry.getValue()+"\n");
	}
	
	public void asc() {
		if(scores !=null) {
			textArea.setText("");
			NavigableMap<Integer, String> tempMap = scores.descendingMap();
			NavigableMap<Integer, String> ascMap = tempMap.descendingMap();
			Set<Map.Entry<Integer, String>> set = ascMap.entrySet();
			for(Map.Entry<Integer, String> d : set) {
				textArea.append(d.getKey() + ":" +d.getValue()+"\n");
			}
		}else {
			textArea.setText("먼저 싱행번튼을 눌러주세요");
		}
	}
	
	public void desc() {
		if(scores !=null) {
			textArea.setText("");
			NavigableMap<Integer, String> tempMap = scores.descendingMap();
			Set<Map.Entry<Integer, String>> set = tempMap.entrySet();
			for(Map.Entry<Integer, String> d : set) {
				textArea.append(d.getKey() +":" + d.getValue()+"\n");
			}
		}else {
			textArea.setText("먼저실행버튼을 눌러주세요");
		}
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					process();
				}
			});
			btnNewButton.setBounds(12, 10, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("asc");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					asc();
				}
			});
			btnNewButton_1.setBounds(121, 10, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("desc");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					desc();
				}
			});
			btnNewButton_2.setBounds(230, 10, 97, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 45, 315, 306);
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
