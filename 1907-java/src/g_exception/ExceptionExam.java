package g_exception;
//오류, 예외처리
public class ExceptionExam {

	public static void main(String[] args) {
		//NullPointerException
		String data = null;//null은 주소값이 아직 없다는것. "" 이라면 주소값이 있기때문이 notnull이다
		try {
			System.out.println(data.toString());//데이타가 가지고있는 성향을 문자열로찍으려한다
			System.out.println("오류가없는경우 실행됨");
		}catch(NullPointerException ex) {//Exception ex만 써도됨//하지만 범위가 작은순으로 어센딩 해야한다.즉,Exception이 제일 마지막
			System.out.println("Null Pointer Error!!");
			
			System.out.println(ex.toString());//14,15행 둘중 하나 쓰면됨
			ex.printStackTrace();//오류메세지가 무조건 콘솔창에 출력
			
		}catch(Exception ex2){
			System.out.println("문자열 변수 data에 값이 없음");
		}finally {
			System.out.println("오류발생과 상관없이 무조건 실행");
		}
		
		
		
		
		//ArrayIndexOutOfBoundsException첨자오류
		int[] s = {1,2,3};
		try {
			for(int i = 0;i<=3;i++) {
				System.out.println(s[i]);
				System.out.println("오류가 없는경우 실행됨");
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("배열의 첨자 범위를 벗어남");
		}finally {
			System.out.println("상관없이 실행");
		}
		
		
		
		
		//NumberFormatException
		try {
			data = "123a";
			int su = Integer.parseInt(data);//(o or x)
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("다음 처리가 진행됨");
		}
		
		
		
		//ClassCastExceptiong형변환 오류)
		try {
			Car myCar = new Car();
			SportsCar c = (SportsCar)myCar;//부모를 만들어서 자식으로 형변환 할수는 없다.
		}catch(Exception ex) {
			System.out.println("형변환 오류");
		}finally {
			System.out.println("끝");
		}

	}

}
