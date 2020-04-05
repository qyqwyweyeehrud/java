package i_thread;

public class NotifyB extends Thread{
	WorkObject wo = new WorkObject();
	
	NotifyB(WorkObject wo){
		this.wo = wo;
	}
	public void run() {
		for(int i =0 ; i<=10 ; i++) {
			wo.mathodB();
		}
	}
}
