package f_inheri;

public class MyCar {
	
	KumhoTire[] front = new KumhoTire[2];
	KumhoTire[] back = new KumhoTire[2];
	
	Tire[] tire = new Tire[4];
	
	

	public static void main(String[] args) {
		MyCar m = new MyCar();
		
		//m.front[0] = new HankuTire();//=타입이다르다
		m.back[0] = new KumhoTire();
		m.tire[0] = new HankuTire();
		
		m.tire[0].run();
		
		
		//개체가 HankuTire로 만들어져 있는 경우 참
		Tire h1 = new HankuTire();
		if(h1 instanceof KumhoTire) {
			System.out.println("금호 타이어로 만들어짐");
		}else {
			System.out.println("금호 타이어로 만들어지지 않음");
		}
		
		

	}

}
