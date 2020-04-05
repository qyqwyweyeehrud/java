package f_inheri;

public class Airplane {
	public Airplane() {
		System.out.println("일반비행기");
	}
	public Airplane(int tire) {
		System.out.println("타이어가"+tire+"개인 일반 비행기");
	}
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반 비행");
	}
	public void takeOff() {
		System.out.println("이륙");
	}

}
