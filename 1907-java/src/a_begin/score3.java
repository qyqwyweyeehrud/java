package a_begin;

public class score3 {
	String date = "2019.11.27(수)";
	String name = "김도경";
	int a = 80;
	int b = 95;
	int c = a+b;
	double d = c/(double)2;
	score3(){
		System.out.println("---------------");
		System.out.println("성정처리결과");
		System.out.println("---------------");
		System.out.println("작성일자:"+date);
		System.out.println("작성자:"+name);
		System.out.println("국어:"+a);
		System.out.println("영어:"+b);
		System.out.println("합계:"+c);
		System.out.println("평균:"+d);
		System.out.println("---------------");
		
	}
	
	
	
	
	public static void main(String[] args) {
		new score3();
		
	}

}
