package b_operator;

public class Ex5 {
	Ex5() {
		double a = 12349.99;
		//���� ���. 10���� ������ �ݾ��� ������ �����Ͽ� �����Ͻÿ�.
		//12340 -> 12300
		
		int b =(int)(a/100)*100;
		
		System.out.println("a���� ���� �ڸ� ���ϸ� ���� ��: "+b);
		
		//���� ��� 10���� ������ �ݾ��� ������ �����Ͽ� �����Ͻÿ�
		//12340.5 -> 12400
		
		int c = (int)(a/100+1)*100;
		
		System.out.println("a�� ���� �ڸ����� �ø� �� �� : "+c);
		
		
	}
	public static void main(String[] args) {
		new Ex5();
	}

}
