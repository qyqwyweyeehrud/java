package g_exception;

public class ExceptionExam2 {
	
	public ExceptionExam2() throws Exception {
		this.method();
	}
	public void method() throws Exception {//throws를 하면 어디선가 트라이캐치를 해야함
		int su = 100;
		int su2 =10;
		System.out.println(su/su2);
		throw new Exception("강제로 예외를 발생시킴~~");
		
	}
	
	public static void main(String[] args) {
		try {
			new ExceptionExam2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("끝");
	}

}
