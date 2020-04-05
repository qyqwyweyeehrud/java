package c_contrl;
/*
 * 정수형 성적이 score에 저장되어 있다. score를 사용하여 학점을 구하되, switch문을 사용하여 처리하시오
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
		System.out.println("성적:"+ score);
		System.out.println("학점:"+b);
		
		//switch > if
		if     (score>=90) b = 'A';
		else if(score>=80) b = 'B';
		else if(score>=70) b = 'C';
		else if(score>=60) b = 'D';
		else               b = 'B';
	}

}
