package d_array;

import java.util.Scanner;

public class ArrayExam3 {//<<�̰Ÿ� �ڵ����ν����Ҽ��ִ��Լ��� �ڵ����� �ϼ����ش�
	//�̹��ð��� �����ڶ� ����ϰԻ������� �Ϲݸ޼ҵ忡 ������̴�.
	//���������� �����ڸ� ����ڴ�<�μ��� ����ڴ�.
	//������,��ȯ��(return�����������ʰٴ�),�޼ҵ��(�Ű�����){...} <<�̷������� �޼ҵ��. Ŭ�������� �Ȱ��Ƶ� ��ȯ���� �پ������� �޼ҵ��̴�.
	//��� �޼ҵ�� �ҷ��������� �����
	//�Ϲݸ޼ҵ� ȣ����=main���� ȣ��,�Ǵٸ��޼ҵ忡��,Ŭ�����ȿ���
	//this. �������� ��������� ������this.�� ������ �� ��Ŭ������ �������ִ� �����!
	//this.��ſ� ��ü���� ����
	//�޼ҵ�ȿ� �޼ҵ�� �Ұ�
	public int test2() {
		//���ڿ� 1�����迭(names)�� ������ ���� 5���� ����
		//������ 2�����迭(s)�� 5���� ���� ����,���� ������ ����
		String[] names = new String[5];
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";
		names[3] = "d";
		names[4] = "e";
		int[][] s = new int[][] {
			{ 10,20 },
			{ 20,30 },
			{ 30,40 },
			{ 40,50 },
			{ 50,60 }
		};
		int tot =0;
		double avg =0;
		//�迭�� ù��° �л��� �̸��� ������  ����,����� ���
		System.out.println("----------------------------------------");
		System.out.println("�̸�:"+names[0]+"\n�����:"+s[0][0]+"\n�����:"+s[0][1]);
		
		tot = s[0][0] + s[0][1];
		avg = (double)tot/s[0].length;
		System.out.println("����:"+tot);
		System.out.println("���:"+avg);
		
		//3��°�л��� ���������� 100������ �����Ͻÿ�
		s[2][0] = 100;
		//3��° �л��� �̸��� ���� ������ ����Ͻÿ�
		System.out.println("�̸�:"+names[2]);
		System.out.println("�����:"+s[2][0]);
		//�л����� d�� ����� ����,����,����,����� ����Ͽ� ���
		//�ϵ� ������"�ڷ����"�� ����ش޶�
		//�˻�� �Է��Ͽ� �˻��ϰ� �˻��� �����Ϸ���"quit"�� �Է��ϵ��� ���α׷��� �����϶�
		
		Scanner scanner = new Scanner(System.in);
		String findStr = "";
		while(!findStr.equals("quit")) {
			System.out.print("�˻��� �̸���?");
			findStr = scanner.nextLine();//���ٴ�����/��ȯ���� StringŸ���̶� ȣ����� StringŸ���̿�����
			
			int p =-1;
			for(int i =0;i<names.length;i++) {
				if(names[i].equals(findStr)) {//���ڿ��� == �� �ȵ�
					System.out.println(names[i]);
					System.out.println("����:"+s[i][0]);
					System.out.println("����:"+s[i][1]);
					p = i;
					tot = s[i][0]+s[i][1];
					avg = (double)tot/s[i].length;
					System.out.println("����:"+tot);
					System.out.println("���:"+avg);
					break;//���������� �������� �극��ũ�� �����ؾ���
				
				}
			}
		
			if(p==-1) {//abcde �̿��� �ٸ����� �Էµ����� NaN�� �����ʱ����� �۾�
				System.out.println("�ڷ����");
			}
		}
		
		
		
		
		
		
		
		/*this.test1();//����� this�� ���,this���� ����
		test1();//��� test1�� test2���� �������� �̾�� ȣ���� �����ϴ�.
		return 0;//voidŸ���̾ƴ� �ٸ� ������Ÿ�԰������� ��ȯ���� �ʿ���*/
		return 0;
	}
	//������ ��ȯ�� �޼����(�Ű�����){...}
	//������ 2���� �迭�� �����ϰ� �ʱⰪ�� 4��3���� �����͸� ����
	public void test1() {
		int[][] s = new int[][] {//�⺻��//�ʱ� �����Ͱ� �ִ°�쿡 �ϴ�4���� �����Ѱ�
			{ 1,2,2 },
			{ 2,3,4 },
			{ 4,5,6 },
			{ 7,8,2 }//�̷����밡 4�� 3��
		};
		
		//�迭�� ���
		System.out.println("���:"+s.length);
		System.out.println("ù��° ���� ����:"+s[1].length);
		//�ι�°���� ����°���� ����?
		System.out.println(s[1][2]);//0���̽��� ÷�ڷ�0=1��° 1=2��° 2=3��°
		//ù��° ���� ������ �հ�
		int hap = s[0][0] + s[0][1] + s[0][2];
		System.out.println(hap);
		//ù��° ���� �հ�
		hap = s[0][0] + s[1][0] + s[2][0] + s[3][0];
		System.out.println(hap);
		//�ι�° ���� ������ ¦���� ���
		if(s[1][0]%2 == 0) {
			System.out.print(s[1][0]+" ");
		}
		if(s[1][1]%2 == 0) {
			System.out.print(s[1][1]+" ");
		}
		if(s[1][2]%2 == 0) {
			System.out.println(s[1][2]);
		}
		//����°���� ¦���� ����� ���Ͻÿ�
		System.out.println("--------------------");
		hap = 0;
		int count =0;
		double avg =0;
		
		
		/*if(s[0][2]%2==0) {
			hap += s[0][2];
			count++;
		}*/
		for(int i =0;i<s.length;i++) {	
				if(s[i][2]%2==0) {
					hap = hap + s[i][2];
					count++;
					}
				if(count>0) { //count�� 0���� ���Ǽ� ��µǸ� NaN�� ��� NaN�� �����̱⶧���� 0�̶ߵ������ֱ����� ���ǽ��� �߰����ش�
					avg = (double)hap/count;
				}
		}
		System.out.println(avg);
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {//���������� ���� ���θ� �����Լ����θ���.
		ArrayExam3 a3 = new ArrayExam3();//����ӽ��� �����ڸ� ������ ����ӽ��̺����ִ� �����ڴ� �Ű�����������.
	//a3�� �������ִ� test1 �̶���ϴ� �޼ҵ带 ȣ���ѰŴ�.
	 //�º��� �ƹ��͵� ��� �Ǵ������� void�� ���⿡ ��ȯ���� ��� �����ʾƵ��ȴ�.
	  a3.test1();//��ü�� �������ִ� �޼ҵ崩������ �� ����ؾ��Ѵ�
	  a3.test2();
	  //Ŭ���� �ۿ��� ȣ���Ҷ��� ��ü�� �������ִ� �޼ҵ�� ȣ���ؾ��Ѵ�.
	}
}
