package k_io;

import java.awt.EventQueue;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FileTextEditor extends JInternalFrame {
	
	boolean modifyFlag = false;
	String fileName;
	private JLabel status;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileTextEditor frame = new FileTextEditor();
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
	public FileTextEditor() {
		super("noname",true,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().add(getStatus(), BorderLayout.SOUTH);
		getContentPane().add(getScrollPane_1(), BorderLayout.CENTER);
		setVisible(true);

	}
	
	public FileTextEditor(String fileName) {
		this();
		this.fileName = fileName;
		setTitle(fileName);
		
		load();
	}
	public void load() {
		try {
			FileReader fr = new FileReader(fileName);
			char[] data = new char[100];
			int readData = 0;//읽은데이터의 크기
			textArea.setText("");
			while((readData = fr.read(data)) != -1) {
				String temp = new String(data,0,readData);
				textArea.append(temp);
			}
			fr.close();
		}catch(Exception e){
			
		}
	}
	public boolean save() {
		
		boolean b =true;
		if(modifyFlag) return b;
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(textArea.getText());
			fw.flush();
			fw.close();
			setTitle(fileName);
		}catch(Exception e) {
			b=false;
		}
		return b;
	}
	public JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setPreferredSize(new Dimension(0, 20));
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return status;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent ev) {
					if(ev.getKeyCode() != KeyEvent.VK_SHIFT &&
						ev.getKeyCode() != KeyEvent.VK_ALT&&
						ev.getKeyCode() != KeyEvent.VK_CONTROL&&
						ev.getKeyCode() != KeyEvent.VK_HOME&&
						ev.getKeyCode() != KeyEvent.VK_END&&
						ev.getKeyCode() != KeyEvent.VK_PAGE_UP&&
						ev.getKeyCode() != KeyEvent.VK_PAGE_DOWN&&
						ev.getKeyCode() != KeyEvent.VK_LEFT&&
						ev.getKeyCode() != KeyEvent.VK_RIGHT&&
						ev.getKeyCode() != KeyEvent.VK_UP&&
						ev.getKeyCode() != KeyEvent.VK_DOWN) {
						
						modifyFlag = true;
						if(fileName == null) {
							setTitle("noname(*)");
						}else {
							
							setTitle(fileName +"(*)");
						}
						
					}
				}
			});
		}
		return textArea;
	}
}
