package c_contrl;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Exercise7_1 {
	Exercise7_1(){
		boolean run = true;
		int balance = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����>");
			
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("���ݾ�>");
				int v =scanner.nextInt();
				balance +=v;
				
				break;
			case 2:
				System.out.println("��ݾ�>");
				int v2 = scanner.nextInt();
				
				if(balance<v2) {
					System.out.println("�ܾ��̺����մϴ�");
				}else  {
					balance -=v2;
				}
				break;
			case 3:
				
				System.out.println("�ܰ�>"+balance);
				break;
			case 4:
				run = false;
				break;
			}//switch
		}//while
		System.out.println("���α׷� ����");
	}

		

	public static void main(String[] args) {
		new Exercise7_1();
		
	}
}
