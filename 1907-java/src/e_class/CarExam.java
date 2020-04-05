package e_class;

public class CarExam {
	

	public static void main(String[] args) {
		Car2 mycar = new Car2();
		mycar.setGas(50);
		
		if(mycar.isLeftGas()) {
			System.out.println("출발");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("가스 주입할 필요없음");
		}else {
			System.out.println("가스를 주입하세요");
		}
	

	}

}
