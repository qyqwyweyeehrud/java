package i_thread;

public class ThreadMainExam {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("메인스레드명:"+mainThread.getName());
		
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		t1.start();
		t2.start();
		//스케쥴러에 의해서 스레드a가 실행됫다가 스레드b가 실행됫다가 다시 스레드a가 싱행됨
		//실행할때마다 개수와 순서가 달라짐
	}

}
