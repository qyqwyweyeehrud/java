/*
 * ��� ó���� �����ڸ� ����Ͽ� �ذ� //��ȯ���� ����, Ŭ������� �ݵ�� ���ƾ���//�������� ���ٱ����� public�̳� �����ص��ȴ�(defalt)
 * ����,�ּ�,����ó�� ���ڿ��� �߻��Ѵ�. ������ �����͸� name,address,phone �� �����Ѵ�
 * ������ ���������� �߻��Ͽ� ���� kor,eng,mat�� ����
 * ����� ������ ����Ͽ� ����, ����� tot, avg�� ����
 * if~else if ���� ����Ͽ� ��հ��� ����Ͽ� ������ ���ؼ� ������ ���� grade�� ����.
 */
package c_contrl;

public class Exam1 {
	Exam1() { //�������� ������ �ʵ��� �ʱ�ȭ�ε� ���� �տ�void�� ������ �ʵ带 �ʱ�ȭ�Ҽ� ����.
		String name = "�赵��";
		String adress = "��⵵ ������";
		String phone = "010-2437-5566";
		
		int kor = 90;
		int eng = 50;
		int mat = 70;
		
		int tot = kor +eng + mat ;
		double avg = tot/(double)3;
		
		char grade = 0; //// �����Ʈ --  0;�� �ƴ϶� ' ';
		
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80){
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else if(avg>=50) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		/*System.out.println("-------------");
		System.out.println("���� ó�����");
		System.out.println("-------------");
		System.out.println("����:"+name);
		System.out.println("�ּ�:"+adress);
		System.out.println("����ó:"+phone);
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+mat);
		System.out.println("����:"+tot);
		System.out.println("���:"+avg);
		System.out.println("����:"+grade);
		*/
		String msg = "����:" + name;
		msg += "\n�ּ�:" + adress;
		msg += "\n����ó:" + phone;
		msg += "\n����:" + kor;
		msg += "\n����:" + eng;
		msg += "\n����:" + mat;
		msg += "\n����:" + tot;
		msg += "\n���:" + avg;
		msg += "\n����:" + grade;
		System.out.println(msg);
		
		
		//return msg;//�����ڿ��� �����Ҽ������� ���ٸ� /�� ���ڿ��� ��𿡺������� �Ǵ��ؼ� �����ؼ� msg�� ó���Ҽ��ִ�
		
	}
		
	

	
	
	
	public static void main(String[] args) {
		
	}
}
