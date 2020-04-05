package d_operator;

public class Operator2 {
	Operator2(){
		int kor = 60;
		int eng = 40;
		
		//국어성적이 60이상이고 영어성적도 60이상일때 "합격"
		boolean b = (kor>=60) && (eng>=60);
		System.out.println(b);
		
		//국어성적이 60이상 이거나 영어성적이 60이상이면 "합격"
		b = (kor>=60) || (eng>=60);
		System.out.println(b);
		System.out.println(!b);
	}
	
	public static void main(String[] args) {
		new Operator2();
	}

}
