package e_class;

public class CarExam {
	

	public static void main(String[] args) {
		Car2 mycar = new Car2();
		mycar.setGas(50);
		
		if(mycar.isLeftGas()) {
			System.out.println("���");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("���� ������ �ʿ����");
		}else {
			System.out.println("������ �����ϼ���");
		}
	

	}

}
