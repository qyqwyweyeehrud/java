package d_array;
//�迭 []
public class ArrayExam1 {
	ArrayExam1(){
		//�迭�� �����ϸ鼭 �ʱⰪ�� ����
		int[] score = {1,2,3,4,5};//�迭�� ũ��� 5���θ�������� �׾ȿ���12345������ִ�.
		System.out.println(score[4]);
		System.out.println(score[0]);//[]�迭�� 0���̽��̱⶧���� 0���ͽ���ex)0>1,1>2,2>3,3>4,4>5
		
		//���ڿ��� �迭�� �����ϰ� ������ ������ 3�� ����
		String[] a = {"��","��","��","��","��"};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		a[2] = "��";//�迭���� ���ڿ� �������
		System.out.println(a[2]);
		
		//�迭�� ������ �Ŀ� �ʱⰪ�� ������ ��
		double[] height = null;
		//height[] = {80,70,60,50}; �̷����ϸ�ȵǰ�
		height = new double[] {80,90,60,50.5};//�̷��� �ؾ��Ѵ�
		//double[] height = new double[] {80,90,60,50.5}; �̹���� �����ϴ� ���� �̷����ϸ� new�� �����ص��ȴ�
		
		
		//10���� �����Ը� ������ �� �ִ� �Ǽ��� �迭�� ����
		double[] w = new double[10];//10�������ؾ��ϸ���ȣ10�� �ٵ��װ� ����Ÿ���̷� �ٵ� ���۷����� ���������λ����ؾ��� �׷��� new
		//�����Լ��� ����Ͽ� �����Ը� �߻����� �迭w�� �����غ���
		for(int i=0;i<=9;i++) {
			double d = Math.random()*100;
			w[i] = d;
		}
		for(int i=0;i<10;i++) {
			System.out.printf("%5.1f \n",w[i]);//5�� �����߿� �Ҽ��� ���� 1�ڸ������� 000.0<.�� 1�ڸ���
		}
		
		//�������� �հ�� ��� ���
		double hap = 0;
		for(int i=0 ; i<w.length; i++) {
			hap += w[i];
		}
		double avg = hap/w.length;
		
		System.out.printf("�հ�= %10.2f \n",hap);
		System.out.printf("���= %7.2f \n",avg);
		
			}

	
	
	public static void main(String[] args) {
		for(int i=0;i<args.length ; i++) {
			System.out.println(args[i]);
		}
		//new ArrayExam1();
	}
}
