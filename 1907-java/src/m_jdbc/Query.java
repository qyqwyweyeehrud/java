package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class Query extends JInternalFrame {
	
	Connection conn = DBConn.getConn();//커넥션이 한번 연결된것 창이닫히면 클로스되게 해줘야함
	
	private JPanel panel;
	private JButton btnNewButton;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query frame = new Query();
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
	public Query() {
		super("뭐리",false,true,true,true);
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent arg0) {//인터널 프레임이 닫힐때 closing할때
				
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		setBounds(100, 100, 667, 459);
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);

	}
	
	public void select() {//컬럼명을뿌려주고 쿼리박스처럼뿌려줄것이다
		String sql = textField.getText();
		//헤더작업
		try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSetMetaData meta = ps.getMetaData();
		
		DefaultTableModel model = new DefaultTableModel();
		
		
		int cnt = meta.getColumnCount();
		for(int i =1 ; i<=cnt ; i++) {//인덱스가 1부터라서
			model.addColumn(meta.getColumnName(i));
		}
		//바디작업
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {//벡터에 한줄을 만들고 addrow해버린다
			 Vector row = new Vector();//오브젝트타입 제너릭생략하면 //한줄에 저장할거다
			 for(int i = 1; i<=cnt ; i++) {
				 row.add(rs.getString(i));
				 //switch//데이터 타입이 어떤건 바차,넘버,데이트 고 하기때문데 모든걸 스트링에 받을수 없기때문에 switch 를 사용해서 add할것임
			 }
			 model.addRow(row);
		 }
		
		
		table.setModel(model);
		rs.close();
		ps.close();
		
		}catch(Exception ex) {
			
		}
		
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 40));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnNewButton(), BorderLayout.EAST);
			panel.add(getTextField(), BorderLayout.CENTER);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\u25B6");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					select();
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(178, 34, 34));
		}
		return btnNewButton;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyReleased(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						select();
					}
				}
			});
			textField.setColumns(10);
		}
		return textField;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
