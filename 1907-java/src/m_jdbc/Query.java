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
	
	Connection conn = DBConn.getConn();//Ŀ�ؼ��� �ѹ� ����Ȱ� â�̴����� Ŭ�ν��ǰ� �������
	
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
		super("����",false,true,true,true);
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent arg0) {//���ͳ� �������� ������ closing�Ҷ�
				
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
	
	public void select() {//�÷������ѷ��ְ� �����ڽ�ó���ѷ��ٰ��̴�
		String sql = textField.getText();
		//����۾�
		try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSetMetaData meta = ps.getMetaData();
		
		DefaultTableModel model = new DefaultTableModel();
		
		
		int cnt = meta.getColumnCount();
		for(int i =1 ; i<=cnt ; i++) {//�ε����� 1���Ͷ�
			model.addColumn(meta.getColumnName(i));
		}
		//�ٵ��۾�
		 ResultSet rs = ps.executeQuery();
		 while(rs.next()) {//���Ϳ� ������ ����� addrow�ع�����
			 Vector row = new Vector();//������ƮŸ�� ���ʸ������ϸ� //���ٿ� �����ҰŴ�
			 for(int i = 1; i<=cnt ; i++) {
				 row.add(rs.getString(i));
				 //switch//������ Ÿ���� ��� ����,�ѹ�,����Ʈ �� �ϱ⶧���� ���� ��Ʈ���� ������ ���⶧���� switch �� ����ؼ� add�Ұ���
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
