package a_begin;

public class PromotionExample {
	
    
    
	//생성자로 불려지는 메소드
	PromotionExample(){
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		int Value = charValue;
		System.out.println("가의 유니코드=" +intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue =200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}
	
	
	public static void main(String[] args) {
		new PromotionExample();
	}

}
