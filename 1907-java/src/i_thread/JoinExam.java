package i_thread;

public class JoinExam {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100������ �հ�"+st.sum);

	}


}

