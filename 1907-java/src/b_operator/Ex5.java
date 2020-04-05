package b_operator;

public class Ex5 {
	Ex5() {
		double a = 12349.99;
		//세금 계산. 10단위 이하의 금액은 무조건 절삭하여 과금하시오.
		//12340 -> 12300
		
		int b =(int)(a/100)*100;
		
		System.out.println("a에서 십의 자리 이하를 버린 수: "+b);
		
		//이자 계산 10단위 이하의 금액은 무조건 절삭하여 지급하시오
		//12340.5 -> 12400
		
		int c = (int)(a/100+1)*100;
		
		System.out.println("a의 십의 자리에서 올림 한 수 : "+c);
		
		
	}
	public static void main(String[] args) {
		new Ex5();
	}

}
