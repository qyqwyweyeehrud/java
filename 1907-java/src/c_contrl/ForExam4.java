package c_contrl;
//1~1000������ �հ谡 5000�� �Ѵ� ������ ���� ����Ͻÿ�
public class ForExam4 {
	ForExam4(){
		int sum = 0;//����� for���ȿ��� ��������� ������ �ۿ��� �ؾߵǱ���
		for(int i = 1;i<1001;i++) {
			sum = sum+i;//sum += i;//�̾ȿ��� �����ϸ� ���������� �����ʴ´� ���������� �ʿ��ϴٸ� �ۿ���
			if(sum>=5000) {
				System.out.println(sum);
				break;//������ ���̻� �����������ϵ��� //break�������� ������Ƣ���
		/*int sum 0;
		int i=0;
		for(i=1;sum<5000;i++) {
			sum+=i;
		}
		System.out.println((i-1) + "," +sum);*/
			}
		}
	}

}
