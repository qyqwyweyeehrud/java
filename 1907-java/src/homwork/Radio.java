package homwork;

public class Radio extends Product {
	@Override
	public String getProductName() {//만약 매개변수안에 변수를 넣으면 중복선언을 한 것임 재정의x
		super.getProductName();
		System.out.println("Radio");
		
		return "Radio";
		
	}
	

}
