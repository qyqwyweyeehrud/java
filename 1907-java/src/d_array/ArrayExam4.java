package d_array;

import java.util.Scanner;

public class ArrayExam4 {//�ʵ�
	String[] n = new String[10];
	int[][] s = new int[10][2];
	int count = 0;//�迭�� �Էµ� �ڷ��� ����
	String name = "";
	int kor = 0;
	int eng = 0;
	int tot = 0;
	double evg = 0;
	
	
	//���ѷ����� ���鼭 �޴��� ���
	ArrayExam4(){
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		//���ÿ� �����͸� �迭�� ����
		n[0] = "hong";
		n[1] = "kim";
		n[2] = "park";
		n[3] = "lee";
		s[0][0] = 90; s[0][1] = 90;
		s[1][0] = 90; s[1][1] = 90;
		s[2][0] = 90; s[2][1] = 90;
		s[3][0] = 90; s[3][1] = 90;
		count = 4;
		
		
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.�Է�|2.����|3.��ȸ�� ���|4.����");
			System.out.println("----------------------------------");
			System.out.print("�޴�����:");
			int menu = scanner.nextInt();
			switch(menu) {  //if(menu==1) input() else if(menu==2) modify() else if(menu==3) serch()
			case 1:
				this.input();//this�� ��������ǲ�̶�� �޼ҵ尡 �ٸ�Ŭ�������ִ°� �ƴ϶� �ڱ��ڽ��� �޼ҵ��̱���
				break;
			case 2:
				this.modify();
				break;
			case 3:
				this.serch();
				break;
			case 4:
				run = false;
				break;
				
			}//--------------------------------------------------------------------switch
		}//------------------------------------------------------------------------while
		System.out.println("���α׷��� ���� �Ǿ����ϴ�");
	}
	
	
	//�л��� ���� ������ �迭�� �Է�
	public void input() {//����� ��� ����Ҽ��ְ� �迭�� ���� �Ϸ��� �ʵ忡 �����ؾ��Ѵ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("����:");
		name = scanner.nextLine();
		System.out.print("��������:");
		kor = scanner.nextInt();
		System.out.print("��������:");
		eng = scanner.nextInt();
		
		tot = kor + eng;
		evg = (double)tot/2;
		
		System.out.println("����:"+tot);
		System.out.println("���:"+evg);
		
		n[count] = name;
		s[count][0] = kor;
		s[count][1] = eng;
		count++;
		
		
	}
	
	//�л��� ���� ������ ����
	//1)������ �л����� �Է¹޾� �˻�
	//2)�˻��� ������ ǥ��
	//3)����
	//4)�迭 ������ ����
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		String findName="";
		System.out.print("�˻��� �л�����?");
		findName = scanner.nextLine();
		for(int i =0 ;i<count;i++) {
			if(n[i].equals(findName)) {
				System.out.println("����:"+n[i]);
				System.out.println("����:"+s[i][0]);
				System.out.println("����:"+s[i][1]);
				System.out.println("-----------------");
				System.out.println("������ �����ϼ���");
				System.out.print("����:");
				s[i][0] = scanner.nextInt();
				System.out.print("����:");
				s[i][1] = scanner.nextInt();
				System.out.println();
			}
		}			
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
	//�л��� ���� ������ ��ȸ �� ���
	public void serch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�˻��� �� ������?");
		String findName = scanner.nextLine();
		
		int tot = 0;
		double evg = 0;
		
		for(int i =0 ; i<count ; i++) {
			if(n[i].equals(findName)||findName.equals("")) {
				//TODO(����,����� ����Ͽ� ���)
				tot = s[i][0] + s[i][1];
				evg = (double)tot/2;
				System.out.print("�̸�:"+n[i]+" ");
				System.out.print("�����:"+s[i][0]+" ");
				System.out.println("�����:"+s[i][1]);
				System.out.print("�հ�:"+tot+" ");
				System.out.printf("���:"+"%5.1f",evg);
				System.out.println();
			}
		}
	}
	
	

	public static void main(String[] args) {
		new ArrayExam4();

	}

}
