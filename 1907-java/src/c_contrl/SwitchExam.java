package c_contrl;
/*
 * ������ ������ score�� ����Ǿ� �ִ�. score�� ����Ͽ� ������ ���ϵ�, switch���� ����Ͽ� ó���Ͻÿ�
 */
public class SwitchExam {
	SwitchExam(){
		int score = 88;
		int a = score/10;
		char b =' ';
		
		switch(a) {
		case 10:
		case 9:
			b = 'A';
			break;
		case 8:
			b = 'B';
			break;
		case 7:
			b = 'C';
			break;
		case 6:
			b = 'D';
			break;
		default:
			b = 'F';
		
		}
		System.out.println("����:"+ score);
		System.out.println("����:"+b);
		
		//switch > if
		if     (score>=90) b = 'A';
		else if(score>=80) b = 'B';
		else if(score>=70) b = 'C';
		else if(score>=60) b = 'D';
		else               b = 'B';
	}

}
