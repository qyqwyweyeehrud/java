/*
 * 2019-11-27
 * �ۼ���:�赵��
 * ���� �����ڿ� ���� ����
 */
package d_operator;

public class Operator {
	
	Operator(){
		//������������
		System.out.println("12%5 => " + (12%5));
		
		//�����������ڿ� 3�׿�����
		int n =122;
		String r = (n%2==0)? "¦��" : "Ȧ��";
		System.out.println(n + "==>" + r);
		
		//���� ������
		//��ġ/��ġ
		int a = 10;
		int b = 10;
		a++;
		++b;
		System.out.println(a + "," +b);
		
		int c = a++;//�����ΰ��� ++������ �Ŀ��Ѵ� (��ġ)
		int d = ++b;//�����ϱ����� ������ �̵̹ǹ��� (��ġ)
		System.out.println(c + "," +d);
		System.out.println(a + "," +b);
		
		//���ڿ� ��
		String name = "��";
		String irum = "��";
		
		
		String irum2 = new String("��");
		
		System.out.println(name==irum);//==�� ��� �������� ���� ���Ѵ�.
		System.out.println(name==irum2);
		
		System.out.println(name.equals(irum)); //equals�� ��Ը������� �����ʰ� ���ڿ��� ���Ѵ�.
		System.out.println(name.equals(irum2));
	}
	
	public static void main(String[] args) {
		new Operator();
	}

}
