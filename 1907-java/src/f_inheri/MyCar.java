package f_inheri;

public class MyCar {
	
	KumhoTire[] front = new KumhoTire[2];
	KumhoTire[] back = new KumhoTire[2];
	
	Tire[] tire = new Tire[4];
	
	

	public static void main(String[] args) {
		MyCar m = new MyCar();
		
		//m.front[0] = new HankuTire();//=Ÿ���̴ٸ���
		m.back[0] = new KumhoTire();
		m.tire[0] = new HankuTire();
		
		m.tire[0].run();
		
		
		//��ü�� HankuTire�� ������� �ִ� ��� ��
		Tire h1 = new HankuTire();
		if(h1 instanceof KumhoTire) {
			System.out.println("��ȣ Ÿ�̾�� �������");
		}else {
			System.out.println("��ȣ Ÿ�̾�� ��������� ����");
		}
		
		

	}

}
