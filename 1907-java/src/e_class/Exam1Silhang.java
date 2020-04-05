package e_class;

public class Exam1Silhang {
	
	public static void main(String[] args) {
		Exam1 e1 = new Exam1();
		
		int r1 = e1.sum(20,30);
		System.out.println("두 수의 합:"+r1);
		
		int r2 = e1.sum2(1, 100);
		System.out.println("합계:"+r2);
		
		double r3 = e1.sum3(20, 4.5);
		System.out.println("넓이:"+r3);
		
		
		int a = 2;
		String r4 = e1.gugudan(a);
		System.out.println("구구단"+ a +"단");
		System.out.println(r4);
	}

}
