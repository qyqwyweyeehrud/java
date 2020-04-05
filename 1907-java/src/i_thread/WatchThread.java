package i_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;



public class WatchThread extends Thread{
	
	JLabel watch;
	
	WatchThread(JLabel watch){
		this.watch = watch;
	}
	
	
	
	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) - hh:mm:ss");
		while(true) {
			watch.setText(sdf.format(new Date()));
			
		
		}
		
	}
}
