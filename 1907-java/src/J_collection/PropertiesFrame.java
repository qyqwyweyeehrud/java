package J_collection;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;
import java.awt.event.ActionEvent;

public class PropertiesFrame extends JInternalFrame {
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropertiesFrame frame = new PropertiesFrame();
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
	public PropertiesFrame() {
		super("Properties",false,true,true,true);
		setBounds(100, 100, 392, 404);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getScrollPane());
		setVisible(true);

	}
	
	
	public void load() {
		try {
			Properties properties = new Properties();
			String path = PropertiesFrame.class.getResource("database.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");
			properties.load(new FileReader(path));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String pwd = properties.getProperty("password");
			
			textArea.setText("");
			textArea.append("driver:"+driver+"\n");
			textArea.append("url:"+url+"\n");
			textArea.append("name:"+userName+"\n");
			textArea.append("pwd:"+pwd+"\n");
			
		} catch (UnsupportedEncodingException e) {
			textArea.setText("오류발생");
			textArea.append("\n");
			textArea.append(e.toString());
		}
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Load");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					load();
				}
			});
			btnNewButton.setBounds(267, 10, 97, 29);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 59, 352, 306);
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
