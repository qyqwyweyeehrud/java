package c_contrl;
//1~1000������ ���� 5�� ��� �̰ų� 7�� ������� ����Ͻÿ�
public class ForExam5 {
	ForExam5(){
		for(int i =0;i<1000;i++) {
			if(i%5==0||i%7==0) {
				System.out.println(i);
			}
		}
		
		for(int i = 5;i<=1000;i=i+5) {
			System.out.print(i);
		}
		for(int i =7;i<=1000;i=i+7) {
			System.out.print(i);
		}
		
	}

}
