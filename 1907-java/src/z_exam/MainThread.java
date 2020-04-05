package z_exam;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작..");
		SubThread st = new SubThread();//st는 런애이블을 상속받았기때문에 스타트가안된다
		Thread t = new Thread(st);
		try {
			t.start();
			t.join();//메인스레드가 일시중지상태로 기다렸다가 서브스레스가 종료되면서 메인스레드가 그제서야 종료된다
		}catch(Exception ex) {
		}
		System.out.println("메인스레드 종료");
	}
}
