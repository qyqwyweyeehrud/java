package i_thread;

public class NotifyA extends Thread{
	WorkObject wo = new WorkObject();
	
	NotifyA(WorkObject wo){
		this.wo = wo;
	}
	public void run() {
		for(int i = 0;i<=10;i++) {
			wo.mathodA();
		}
	}

}
