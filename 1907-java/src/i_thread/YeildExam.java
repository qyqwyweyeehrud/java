package i_thread;

public class YeildExam {
	public static void main(String[] args) {
		
		YeildA y1 = new YeildA();
		YeildB y2 = new YeildB();
	
		y1.start();
		y2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		y1.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		y1.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		y1.stop = true;
		y2.stop = true;
	}
	
	

}
