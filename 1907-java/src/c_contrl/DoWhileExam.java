package c_contrl;

import java.util.Scanner;//package ��  import �������� ���� Ŭ�����ȿ�

public class DoWhileExam {
	DoWhileExam(){
		System.out.println("q�� ������ �����");
		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner scanner = new Scanner(System.in);//Scanner�ʿ� �տø��� �����âŬ��
		String inputString = null;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("q"));//q�� �ƴϸ� ��ǲ��Ƽ���� ���� ť�� ���ض�
		
		System.out.println("���α׷� ����");
	}

}
