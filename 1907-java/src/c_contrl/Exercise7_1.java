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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("예금액>");
				int v =scanner.nextInt();
				balance +=v;
				
				break;
			case 2:
				System.out.println("출금액>");
				int v2 = scanner.nextInt();
				
				if(balance<v2) {
					System.out.println("잔액이부족합니다");
				}else  {
					balance -=v2;
				}
				break;
			case 3:
				
				System.out.println("잔고>"+balance);
				break;
			case 4:
				run = false;
				break;
			}//switch
		}//while
		System.out.println("프로그램 종료");
	}

		

	public static void main(String[] args) {
		new Exercise7_1();
		
	}
}
