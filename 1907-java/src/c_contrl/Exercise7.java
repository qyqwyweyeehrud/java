package c_contrl;

import java.util.Scanner;

public class Exercise7 {
	Exercise7(){
		boolean run =true;
		int balance = 0;//총
		int out = 0;//출금액
		int stay = 0;//잔고
		
		
		Scanner scanner = new Scanner(System.in);
		int inputString;
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			
			inputString = scanner.nextInt();//console에 입력한 값을 가져오겟다.
			
			
			if(inputString==1) {
				balance = scanner.nextInt();
				stay = stay + balance;
				System.out.println("예금액>"+balance);
			}if(inputString==2) {
				out = scanner.nextInt();
				stay = stay - out;
				System.out.println("출금액>"+out);
			}if(inputString==3) {
				
				System.out.println("잔고>"+stay);
			}else if(inputString==4) {
				run = false;
			}//if
			
			
			
		}//while
		System.out.println("프로그램 종료");
	}//생성자


	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Exercise7();
	}
}