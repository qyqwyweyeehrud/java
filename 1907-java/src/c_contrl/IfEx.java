package c_contrl;

public class IfEx {
	public static void main(String[] args) {
		//JVM�� �Ű������� ���� �����ڸ� �Ӵ�
		IfEx obj = new IfEx();
		//obj�� ���������� 
		//IfEx o =0; �̳� int k= 3.14�� ������, �Ǽ��� ���������� �ȵǵ��� ������ IfEx�� �����Ҽ�����
		//int k = obj.type1();
		//System.out.println(k);
		//System.out.println(obj.type1());
		String m = obj.type2();
		System.out.println(m);
		
		//System.out.println(obj.type3());
		
		char f = obj.type3();
		System.out.println(f);
		
		obj.type4();
		
		
	}
int type1() {
	int r = 0;
	int s = 93;
	if( s>=90) {
		System.out.println("������ 90���� Ů�ϴ�");
		System.out.println("����� A�Դϴ�");
		}
	if ( s<90 ) {
		System.out.println("������ 90���� �۽��ϴ�");
		System.out.println("����� B�Դϴ�");
	}
	return r;//�̹����� ���̻� ���������ʰ� �ڱ⸦ ȣ���Ѱ����� �ǵ��ư���. 9������ �ǵ��ư�
}
String type2() {
	String r = null;
	int s =50;
	if ( s>=90 ) {
		r = "90 �̻���";
		r += "\nA";
	}else {
		r = "90 �̸���";
		r += "\nB"; //+= --> r=r+B  // \n --> enter,�ٹٲ���
	}
	return r;//12������ �ǵ��ư�
}


char type3() {
	char r = ' ';
	int a =95;
	if ( a>=90) {
		r = 'A';
		//return r; �ᵵ��
	}else if (a>=80) {
		r = 'B';
		//return r;
	}else if (a>=70) {
		r = 'C';
		//return r;
	}else if (a>=60) {
		r = 'D';
		//return r;
	}else if (a>=50) {
		r = 'E';
		//return r;
	}else if (a>=40) {
		r = 'F';
	}
	return r;
}
/*
 * ������ 0~100�϶��� 60�̻��̸� '�հ�' 60�̸��̸� '���հ�'
 * �� ����ϰ�, ������ ���� ���̸� '��������'�� ����Ͻÿ�.
 * >>>>>>>>>>>>�ʿ��� ������ �����ΰ�,���ڿ� ������ �ʿ��ϰڱ���, 0~100,60�� ����ó���Ұ��� ���ͷ�ó���Ұ���
 */
void type4() {
	int score = -70;
	String result ="";
	
	if(score>=0 && score<=100) {
		if(score>=60) {
			result = "�հ�";
		}else { result = "���հ�";
		
		}
	}else {
		result = "��������";
	}
		
	System.out.println(result);
}
}
