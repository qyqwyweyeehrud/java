package c_contrl;

public class ForExam {
	ForExam(){
		int sum =0;
		for(int i=1;i<=100;i++) {//(int i=1;i<=100;i=i+2) Ȧ������ //(int i=0;i<=100;i=i+2) ¦������
			sum = sum+i;//sum += i;
			System.out.println(i+ "������ ��"+sum);//for�� �ȿ��ִ� sum�� ������ �� ����ϰٴ�.
		}
		System.out.println(sum);//sum����� ����ϰڴ�.
	}

}
