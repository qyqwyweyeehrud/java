package i_thread;

public class WorkObject {//�����ڿ�
	public synchronized void mathodA() {
		System.out.println("ThreadA�� mathodA�� �����......");
		notify();//���������Ǿ��ִ� �����带 ����
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void mathodB() {
		System.out.println("ThreadB�� mathodB�� �����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
