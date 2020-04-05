package k_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JProgressBar;

public class FileCopyThread extends Thread{
	JProgressBar bar;
	String original;
	String target;
	
	public void setOrignal(String original) {
		this.original = original;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public FileCopyThread(JProgressBar bar) {
		this.bar = bar;
	}
	
	@Override
	public void run() {
		try {
			if(original != null && target != null) {
				FileInputStream fis = new FileInputStream(original);
				FileOutputStream fos = new FileOutputStream(target);
				int readByteNo = 0;
				long totreadByte = 0;
				byte[] readBytes = new byte[100];
				long filesize = new File(original).length();
				bar.setValue(0);
				
				while((readByteNo = fis.read(readBytes)) !=-1) {
					fos.write(readBytes, 0, readByteNo);
					totreadByte += readByteNo;
					bar.setValue((int)((double)totreadByte / filesize*100));
				}
				
				fos.flush();
				fos.close();
				fis.close();
				
				
			}
		} catch (Exception e) {
		}
	}
}
