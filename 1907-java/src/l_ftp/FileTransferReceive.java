package l_ftp;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.Color;
import javax.swing.SwingConstants;

public class FileTransferReceive extends JPanel implements Runnable{
	long fileSize;
	FileOutputStream fos;
	Socket socket;
	InputStream is;
	int port;
	
	
	private JLabel fileName;
	private JProgressBar progressBar;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public FileTransferReceive() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(686, 53));
		setLayout(null);
		add(getFileName());
		add(getProgressBar());
		add(getStatus());
		add(getBtnNewButton());

	}
	@Override
	public void run() {
		//지정된 파일을 FileInputStream으로 읽어서
		//Socket의 DataOutputStream으로 전송
		byte[] readData = new byte[4096];//약 4kbt //전송되는 사이즈와 수신되는 사이즈는 동일하게 해주는것이 좋다
		int readSize = 0;
		long readTotSize = 0;
		getProgressBar().setValue(0);
		try {
			ServerSocket ss= new ServerSocket(port);
			socket = ss.accept();
			File dir = new File("c:/Temp");
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			
			is = socket.getInputStream();
			fos = new FileOutputStream("c:/Temp/"+getFileName().getText());//전송되는 사이즈와 수신되는 사이즈는 동일하게 해주는것이 좋다
			
			while((readSize = is.read(readData))!=-1) {
			readTotSize += readSize;
			getStatus().setText(readTotSize +"/"+fileSize);
			getProgressBar().setValue((int)((double)readTotSize/fileSize*100));
			
			fos.write(readData, 0, readSize);
			}
			
			fos.flush();
			fos.close();
			is.close();
			
		}catch(Exception ex){
			
		}
	}
	public FileTransferReceive(int port,String file,long fileSize) {
		this();
		this.port = port;
		this.fileSize = fileSize;
		
		getFileName().setText(file);
		getStatus().setText("0/"+fileSize);
		
		try {
			System.out.println(port+"서버 open");
			Thread t = new Thread(this);
			t.start();
		}catch(Exception ex) {
			System.out.println(port + ":::" +ex.toString());
		}
	}
	
	private JLabel getFileName() {
		if (fileName == null) {
			fileName = new JLabel("\uD30C\uC77C\uBA85 \uD45C\uC2DC");
			fileName.setForeground(new Color(32, 178, 170));
			fileName.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			fileName.setBounds(12, 5, 664, 15);
		}
		return fileName;
	}
	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setForeground(new Color(32, 178, 170));
			progressBar.setBackground(new Color(245, 245, 245));
			progressBar.setBounds(12, 21, 622, 14);
		}
		return progressBar;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC9C4\uD589\uC0C1\uD0DC");
			status.setHorizontalAlignment(SwingConstants.RIGHT);
			status.setForeground(new Color(32, 178, 170));
			status.setFont(new Font("나눔고딕", Font.PLAIN, 12));
			status.setBounds(12, 34, 622, 15);
		}
		return status;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("x");
			btnNewButton.setBackground(new Color(32, 178, 170));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setMargin(new Insets(0, 0, 0, 0));
			btnNewButton.setBounds(646, 20, 30, 26);
		}
		return btnNewButton;
	}
}

