package e_class;

public class Exam1Silhang {
	
	public static void main(String[] args) {
		Exam1 e1 = new Exam1();
		
		int r1 = e1.sum(20,30);
		System.out.println("�� ���� ��:"+r1);
		
		int r2 = e1.sum2(1, 100);
		System.out.println("�հ�:"+r2);
		
		double r3 = e1.sum3(20, 4.5);
		System.out.println("����:"+r3);
		
		
		int a = 2;
		String r4 = e1.gugudan(a);
		System.out.println("������"+ a +"��");
		System.out.println(r4);
	}

}
