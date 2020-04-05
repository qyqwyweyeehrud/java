package i_thread;

public class SumThread extends Thread{
	long sum;
	
	public long getSum() {
		return sum;
	}
	
	

	public void setSum(long sum) {
		this.sum = sum;
	}



	@Override
	public void run() {
		for(int i =0; i<=100 ; i++) {
			sum += i;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
