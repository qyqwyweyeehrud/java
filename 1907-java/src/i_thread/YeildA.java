package i_thread;

public class YeildA extends Thread{
	boolean stop = false;
	boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work = true) {
				System.out.println("Yield..A");
			}else {
				Thread.yield();
			
			}
		}
		System.out.println("Thread B Á¾·á");
	}

}
