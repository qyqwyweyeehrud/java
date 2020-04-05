package c_contrl;

import java.util.Scanner;//package 와  import 를제외한 모든건 클래스안에

public class DoWhileExam {
	DoWhileExam(){
		System.out.println("q를 누르면 종료됨");
		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);//Scanner쪽에 손올리면 노란색창클릭
		String inputString = null;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("q"));//q가 아니면 인풋스티링과 이퀄 큐와 비교해라
		
		System.out.println("프로그램 종료");
	}

}
