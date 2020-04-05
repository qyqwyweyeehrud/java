package i_thread;

public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for(int i = 0 ; i<2100000000;i++) {
		}
		System.out.println(this.getName());
	}
}
