package i_thread;

public class WorkObject {//공유자원
	public synchronized void mathodA() {
		System.out.println("ThreadA의 mathodA가 실행됨......");
		notify();//싱행중지되어있는 스레드를 깨움
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void mathodB() {
		System.out.println("ThreadB의 mathodB가 실행됨");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
