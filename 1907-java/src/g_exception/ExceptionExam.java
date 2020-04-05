package g_exception;
//����, ����ó��
public class ExceptionExam {

	public static void main(String[] args) {
		//NullPointerException
		String data = null;//null�� �ּҰ��� ���� ���ٴ°�. "" �̶�� �ּҰ��� �ֱ⶧���� notnull�̴�
		try {
			System.out.println(data.toString());//����Ÿ�� �������ִ� ������ ���ڿ����������Ѵ�
			System.out.println("���������°�� �����");
		}catch(NullPointerException ex) {//Exception ex�� �ᵵ��//������ ������ ���������� ��� �ؾ��Ѵ�.��,Exception�� ���� ������
			System.out.println("Null Pointer Error!!");
			
			System.out.println(ex.toString());//14,15�� ���� �ϳ� �����
			ex.printStackTrace();//�����޼����� ������ �ܼ�â�� ���
			
		}catch(Exception ex2){
			System.out.println("���ڿ� ���� data�� ���� ����");
		}finally {
			System.out.println("�����߻��� ������� ������ ����");
		}
		
		
		
		
		//ArrayIndexOutOfBoundsException÷�ڿ���
		int[] s = {1,2,3};
		try {
			for(int i = 0;i<=3;i++) {
				System.out.println(s[i]);
				System.out.println("������ ���°�� �����");
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("�迭�� ÷�� ������ ���");
		}finally {
			System.out.println("������� ����");
		}
		
		
		
		
		//NumberFormatException
		try {
			data = "123a";
			int su = Integer.parseInt(data);//(o or x)
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("���� ó���� �����");
		}
		
		
		
		//ClassCastExceptiong����ȯ ����)
		try {
			Car myCar = new Car();
			SportsCar c = (SportsCar)myCar;//�θ� ���� �ڽ����� ����ȯ �Ҽ��� ����.
		}catch(Exception ex) {
			System.out.println("����ȯ ����");
		}finally {
			System.out.println("��");
		}

	}

}
