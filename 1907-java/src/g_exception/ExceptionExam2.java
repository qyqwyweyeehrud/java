package g_exception;

public class ExceptionExam2 {
	
	public ExceptionExam2() throws Exception {
		this.method();
	}
	public void method() throws Exception {//throws�� �ϸ� ��𼱰� Ʈ����ĳġ�� �ؾ���
		int su = 100;
		int su2 =10;
		System.out.println(su/su2);
		throw new Exception("������ ���ܸ� �߻���Ŵ~~");
		
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
		System.out.println("��");
	}

}
