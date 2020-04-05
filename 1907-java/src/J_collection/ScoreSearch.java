package J_collection;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreSearch extends JInternalFrame {
	Map<String , List<ScoreVo>> map;//콜바이 레퍼런스/ 생성자를통해서 전달받았더라
	DefaultListModel<String> modelsno = new DefaultListModel<String>();
	DefaultListModel<String> modelExam = new DefaultListModel<String>();
	List<ScoreVo> list;
	
	
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JList listSno;
	private JScrollPane scrollPane_1;
	private JList listExam;
	private InputPanel panel;
	public JButton btnfinddd;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton button;
	private JLabel status;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel label_1;
	private JLabel lblNewLabel_1;
	
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
		super("성적조회",false,true,true,true);
		getContentPane().setBackground(new Color(245, 245, 245));
		setBounds(100, 100, 520, 504);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getScrollPane());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getPanel());
		getContentPane().add(getBtnfinddd());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getButton());
		getContentPane().add(getStatus());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLabel());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLblNewLabel_1());
		setVisible(true);

	}
	
	public ScoreSearch(Map<String,List<ScoreVo>> map) {
		this();
		this.map = map;
		//학번을 추출하여 
		Set<String> set =map.keySet();//키셋 매소드실행하면 키값들이 튀어나온다.
		//jList에 표시해줄것임
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			modelsno.addElement(iter.next());
		}
		listSno.setModel(modelsno);
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC218\uC815 / \uC0AD\uC81C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(188, 143, 143));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 20));
			lblNewLabel.setBounds(144, 43, 218, 35);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBorder(null);
			scrollPane.setBounds(12, 88, 121, 338);
			scrollPane.setViewportView(getListSno());
		}
		return scrollPane;
	}
	private JList getListSno() {
		if (listSno == null) {
			listSno = new JList();
			listSno.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent ev) {
					String sno = (String)listSno.getSelectedValue();
					if(sno==null) return;//선택되지않은경우라면 밑으로 흐러갈수있도록
					
					list = map.get(sno);
					modelExam = new DefaultListModel<>();
					for(int i=0;i<list.size();i++) {
						ScoreVo vo =list.get(i);
						String temp = String.format("%s:%d(%s)", vo.getmName(),vo.getGrade(),vo.getExam());
						modelExam.addElement(temp);
					}
					listExam.setModel(modelExam);
				}
			});
			listSno.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			listSno.setBorder(new LineBorder(new Color(188, 143, 143), 1, true));
		}
		return listSno;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBorder(null);
			scrollPane_1.setBounds(144, 88, 121, 338);
			scrollPane_1.setViewportView(getListExam());
		}
		return scrollPane_1;
	}
	private JList getListExam() {
		if (listExam == null) {
			listExam = new JList();
			listExam.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					int index = listExam.getSelectedIndex();
					int grade = -1;
					if(index < 0) {
						return;
						//listExam.setSelectedIndex(index);
					}
					
					ScoreVo vo = list.get(index);
					panel.tsno.setText(vo.getSno());
					panel.tmName.setText(vo.getmName());
					panel.tkor.setText(vo.getKor()+"");
					panel.teng.setText(vo.getEng()+"");
					panel.tmat.setText(vo.getMat()+"");
					panel.ttot.setText(vo.getTot()+"");
					panel.tavg.setText(String.format("%5.1f", vo.getAvg()));
					
					//시험종류선택
					if(vo.getExam().equals("중간고사")) {
						panel.rExam1.setSelected(true);
					}else {
						panel.rExam2.setSelected(true);
					}
					//학년선택
					grade = vo.getGrade()-1;
					panel.cGrade.setSelectedIndex(grade);
					
				}
			});
			listExam.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			listExam.setBorder(new LineBorder(new Color(188, 143, 143), 1, true));
		}
		return listExam;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(277, 132, 211, 255);
		}
		return panel;
	}
	private JButton getBtnfinddd() {
		if (btnfinddd == null) {
			btnfinddd = new JButton("\uAC80\uC0C9");
			btnfinddd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					String findstr = textField.getText();
					ScoreDao dao = new ScoreDao(map);
					Map<String,List<ScoreVo>> newMap = dao.list(findstr);
					
					Set<String> set = newMap.keySet();
					modelsno = new DefaultListModel<>();//modelSno.clear();
					
					Iterator<String> iter = set.iterator();
					while(iter.hasNext()) {
						modelsno.addElement(iter.next());
					}
					listSno.setModel(modelsno);
					modelExam.clear();
					
					
					//상세정보 삭제
					panel.tsno.setText("");
					panel.tmName.setText("");
					panel.tkor.setText("");
					panel.teng.setText("");
					panel.tmat.setText("");
					panel.ttot.setText("");
					panel.tavg.setText("");
				}
			});
			btnfinddd.setForeground(new Color(255, 255, 255));
			btnfinddd.setBackground(new Color(188, 143, 143));
			btnfinddd.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			btnfinddd.setBounds(419, 88, 69, 29);
		}
		return btnfinddd;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBorder(new LineBorder(new Color(188, 143, 143), 1, true));
			textField.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			textField.setBounds(277, 88, 138, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String key = panel.tsno.getText();
					int index = listExam.getSelectedIndex();
					String mName = panel.tmName.getText();
					int kor = Integer.parseInt(panel.tkor.getText());
					int eng = Integer.parseInt(panel.teng.getText());
					int mat = Integer.parseInt(panel.tmat.getText());
					String exam ="";
					int grade = 0;
					
					if(panel.rExam1.isSelected()) {
						exam = "중간고사";
					}else{
						exam = "기말고사";
					}
					
					grade = panel.cGrade.getSelectedIndex()+1;//인덱스는 0부터셈을하기때문에 +1
					
					ScoreVo vo = new ScoreVo(key,mName,exam,grade,kor,eng,mat);
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.update(key, index, vo);
					if(b) {
						status.setText("학번:"+"'"+key+"'"+"이름:"+"'"+mName+"'"+"의 자료가 정상적으로 수정되었습니다");
					}else {
						status.setText("수정중 오류발생");
					}
					
				}
			});
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBackground(new Color(188, 143, 143));
			btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 13));
			btnNewButton_1.setBounds(277, 397, 92, 29);
		}
		return btnNewButton_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uC0AD\uC81C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = panel.tsno.getText();
					int index = listExam.getSelectedIndex();
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.delete(key, index);
					if(b) {
						status.setText("학번:"+"'"+key+"'"+"이름:"+"'"+panel.tmName.getText()+"'"+"학생의 절보가 삭제 완료되었습니다");
						panel.tsno.setText("");
						panel.tmName.setText("");
						panel.tkor.setText("");
						panel.teng.setText("");
						panel.tmat.setText("");
						panel.ttot.setText("");
						panel.tavg.setText("");
						if(modelExam.size()>0) {
							modelExam.remove(index);
						}
						
					}else {
						status.setText("삭제중 오류발생");
					}
				}
			});
			button.setForeground(new Color(255, 255, 255));
			button.setBackground(new Color(188, 143, 143));
			button.setFont(new Font("나눔고딕", Font.PLAIN, 13));
			button.setBounds(396, 397, 92, 29);
		}
		return button;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBackground(new Color(255, 182, 193));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(188, 143, 143));
			status.setBounds(12, 436, 476, 27);
		}
		return status;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setOpaque(true);
			lblNewLabel_2.setBackground(new Color(169, 169, 169));
			lblNewLabel_2.setBounds(14, 90, 121, 338);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setOpaque(true);
			label.setBackground(new Color(169, 169, 169));
			label.setBounds(146, 90, 121, 338);
		}
		return label;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBackground(new Color(169, 169, 169));
			lblNewLabel_3.setOpaque(true);
			lblNewLabel_3.setBounds(279, 90, 138, 29);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBackground(new Color(169, 169, 169));
			lblNewLabel_4.setOpaque(true);
			lblNewLabel_4.setBounds(421, 92, 69, 27);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBackground(new Color(169, 169, 169));
			lblNewLabel_5.setOpaque(true);
			lblNewLabel_5.setBounds(279, 399, 92, 29);
		}
		return lblNewLabel_5;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setOpaque(true);
			label_1.setBackground(new Color(169, 169, 169));
			label_1.setBounds(398, 399, 92, 29);
		}
		return label_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setOpaque(true);
			lblNewLabel_1.setBackground(new Color(169, 169, 169));
			lblNewLabel_1.setBounds(146, 45, 218, 35);
		}
		return lblNewLabel_1;
	}
}
