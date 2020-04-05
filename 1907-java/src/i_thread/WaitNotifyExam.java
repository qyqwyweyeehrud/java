package i_thread;

public class WaitNotifyExam {
	public static void main(String[] args) {
		DataBox d1 = new DataBox();
		
		ProducerThread pt = new ProducerThread(d1);
		ConsumerThread ct = new ConsumerThread(d1);
		
		pt.start();
		ct.start();
		
	}

}
