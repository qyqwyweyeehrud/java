package f_inheri;

public class HankuTire implements Tire {
//추상메소드에있는 메서드는 반드시 재정의를 해야한다
	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다");

	}

}
