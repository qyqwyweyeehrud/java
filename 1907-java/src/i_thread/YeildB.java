package i_thread;

public class YeildB extends Thread{
	boolean stop = false;
	boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work = true) {
				System.out.println("Yeild.....B");
			}else {
				Thread.yield();
			}
		}
		System.out.println("Thread B Á¾·á");
	}
}
