package i_thread;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class StopWatchThread extends JPanel implements Runnable{
	boolean stop = false;
	
	private JLabel timeLabel3;

	/**
	 * Create the panel.
	 */
	public StopWatchThread() {
		setLayout(new BorderLayout(0, 0));

		add(getTimeLabel3(), BorderLayout.CENTER);
		

	}

	@Override
	public void run() {
		DecimalFormat df = new DecimalFormat("###,###.000");
		long begin = new Date().getTime();
		while(!stop) {
			long end = new Date().getTime()-begin;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			timeLabel3.setText(df.format(end/1000.0));
		}
		// TODO Auto-generated method stub
		
	}
	
	
	private JLabel getTimeLabel3() {
		if (timeLabel3 == null) {
			timeLabel3 = new JLabel("New label");
			timeLabel3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 41));
			timeLabel3.setForeground(new Color(255, 255, 255));
			timeLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			timeLabel3.setOpaque(true);
			timeLabel3.setBackground(new Color(165, 42, 42));
		}
		return timeLabel3;
	}
}
