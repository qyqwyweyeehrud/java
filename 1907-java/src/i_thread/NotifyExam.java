package i_thread;

public class NotifyExam {

	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		
		NotifyA t1 = new NotifyA(wo);
		NotifyB t2 = new NotifyB(wo);
		
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
