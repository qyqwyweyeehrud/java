package b_operator;

public class Operator {
	Operator(){
		//����,����,���� ������ ���������� ������ ��������, ������ ����� ����Ͽ� ������ ������ �����Ͻÿ�.
		//������ ������ �ϳ��� 40�̸��� ������ '���հ�'ó��
		//����� 60�̸��̿��� '���հ�' ó���� �Ͽ� ������ ����,���,�հݿ��θ� ǥ�� ��� ��ġ�� ����Ͻÿ�.
		int kor = 50;
		int eng = 50;
		int mat = 50;
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+mat);
		int a = kor+eng+mat;
		System.out.println("����:"+a);
		double b = a/(double)3;
		System.out.println("���:"+b);
		
		
		boolean c =(kor>=40)&&(eng>=40)&&(mat>=40);
		c = (b>=60);
		if(c) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		/*
		 * int a=90;
		 * int b=50;
		 * int c=40;
		 * int t=0;
		 * double d =0.0;
		 * boolean r;
		 * String str;
		 * 
		 * Operator(){
		 * t=a+b+c;
		 * d=(double)t/3;
		 * r=(a>=40)&&(b>=40)&&(c>=40)&&(d>=60);
		 * 
		 * str=(r)?"�հ�":"���հ�";
		 * }
		 */
		
		
		
	}
	public static void main(String[] args) {
		new Operator();
		
	}

}
