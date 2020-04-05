package e_class;

public class AnnoExam {
/*@Override//재정의 되었는지를 체크해준다//Menta data이고 정보라기보다는 사전에 체크해주는 프로세스이다
	public String toString() {//재정의
		return "abc";
	}
*/
	@Override
	public String toString() {
		return "김도경";
	}
	
	
	public static void main(String[] args) {
		
		AnnoExam a = new AnnoExam();
		System.out.println(a);
	}
}
