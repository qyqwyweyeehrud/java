package f_inheri;

public class SuperAirplaneExam {

	public static void main(String[] args) {
		SuperAirplane s = new SuperAirplane();
		s.takeOff();
		s.fly();
		s.flyMode = SuperAirplane.SUPERSONIC;
		s.fly();
		s.flyMode = SuperAirplane.NORMAL;
		s.fly();
		s.land();//s�� �ڽİ�ü��

	}

}
