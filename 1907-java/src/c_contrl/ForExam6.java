package c_contrl;
//1~1000������ �߿� �Ҽ��� ���϶�
public class ForExam6 {
	ForExam6(){
		for(int i = 1;i<=1000;i++) {
			boolean b =true;//i�� �Ҽ���
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					b=false;
					break;//for case while ���� �������
				}
			}
			if(b) {
				
				System.out.print(i+" ");
			}
		}
	}

}
