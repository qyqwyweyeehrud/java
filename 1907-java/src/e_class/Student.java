/*
 * 1)StudentŬ���� ����
 * 2)�Ű������� ���� �����ڷ� ��ü�� �����ϸ� �̸�,�ּ�,����ó��
 * "ȫ�浿","���α�","010-1111-1111"���� �ʵ带 �ʱ�ȭ�Ͻÿ�(irum,address,phone)
 * 3)�̸��� �Ķ���ͷ� �����ϸ� ���޵��̸��� �ʵ忡 ����Ǵ� �����ڸ� �ߺ������Ͻÿ�.
 * 4)�̸�,�ּ�,����ó�� �Ķ��Ÿ�� �����ϸ� ��� ���� �ʵ忡 �����ϴ� �����ڸ� �ߺ� ���� �Ͻÿ�.
 * 5)main()�� �ۼ��Ͽ� ���� �䱸������ ó�� �Ǵ����� �׽�Ʈ�Ͻÿ�.
 */
package e_class;

public class Student {
	private/*�������ž�*/ String irum ; //�ʵ弱��
	String address = null;//�ص� �ʵ�� �ڵ����� �ʱ�ȭ�Ǳ⶧���� �������
	String phone;
	
	
	Student(){
		this.irum = "ȫ�浿";
		this.address = "���α�";
		this.phone = "010-1111-1111";
	}	//�����ڴ� Ŭ������ �ʱ�ȭ�Ѵ�. �ʵ忡 ���� �������μ� �ʵ��� �ʱ�ȭ���Ǵ°��̴�.
	Student(String n){
		this.irum =n ;
	}//3)�ߺ������� ��� = �Ű������� �ٸ��ų� ������ �ٸ��ų�
	Student(String n,String a,String p){
		this.irum = n;
		this.address = a;
		this.phone = p;
	}//4)
	
	void prn() {//ĸ��ȭ�� ���� ĸ��
		System.out.println(this.irum);
		System.out.println(this.address);
		System.out.println(this.phone);
		System.out.println("-----------------");
	}
	
	public static void main(String[] arg) {
		Student s1 = new Student();
		s1.prn();//ĸ��ȭ
		
		Student s2 = new Student("������");
		s2.prn();
		
		Student s3 = new Student("������","����","010-2323-3232");
		s3.prn();
	}

}
