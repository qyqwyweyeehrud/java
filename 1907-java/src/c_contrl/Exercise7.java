package c_contrl;

import java.util.Scanner;

public class Exercise7 {
	Exercise7(){
		boolean run =true;
		int balance = 0;//��
		int out = 0;//��ݾ�
		int stay = 0;//�ܰ�
		
		
		Scanner scanner = new Scanner(System.in);
		int inputString;
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����>");
			
			inputString = scanner.nextInt();//console�� �Է��� ���� �������ٴ�.
			
			
			if(inputString==1) {
				balance = scanner.nextInt();
				stay = stay + balance;
				System.out.println("���ݾ�>"+balance);
			}if(inputString==2) {
				out = scanner.nextInt();
				stay = stay - out;
				System.out.println("��ݾ�>"+out);
			}if(inputString==3) {
				
				System.out.println("�ܰ�>"+stay);
			}else if(inputString==4) {
				run = false;
			}//if
			
			
			
		}//while
		System.out.println("���α׷� ����");
	}//������


	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Exercise7();
	}
}