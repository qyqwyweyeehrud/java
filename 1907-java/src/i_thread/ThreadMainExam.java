package i_thread;

public class ThreadMainExam {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���ν������:"+mainThread.getName());
		
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		t1.start();
		t2.start();
		//�����췯�� ���ؼ� ������a�� ����̴ٰ� ������b�� ����̴ٰ� �ٽ� ������a�� �����
		//�����Ҷ����� ������ ������ �޶���
	}

}
