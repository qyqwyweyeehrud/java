package f_inheri;

public class SuperAirplane extends Airplane {
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode = NORMAL;
	
	public SuperAirplane() {
		super(3);//생성자실행은 할상 첫번째줄//부모의();모양 즉 매개변수가 없는 생성자를 호출

		//super();라고 쓰지도않았는데 일반비행기가 뜨는이유는 extends Airplane때문
		System.out.println("초음속비행기");
	}
	
	@Override//밑메소드가 정확히 재정의 되었는지 체크해준다
	public void fly() {//부모가 퍼블릭이면 자식도 퍼블릭
		if(flyMode == NORMAL) {
			super.fly();
		}else {
			System.out.println("초음속비행");
		}
	}

}
