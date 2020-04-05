package i_thread;

public class Calculator {
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}
			//상호베타적 동기화로 수정되기위한 synchronized
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +":" +this.memory);//공유자원
	}
	
}
