package homwork;

public class Radio extends Product {
	@Override
	public String getProductName() {//���� �Ű������ȿ� ������ ������ �ߺ������� �� ���� ������x
		super.getProductName();
		System.out.println("Radio");
		
		return "Radio";
		
	}
	

}
