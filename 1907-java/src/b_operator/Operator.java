package b_operator;

public class Operator {
	Operator(){
		//국어,영어,수학 점수를 정수형으로 변수에 저장한후, 총점과 평균을 계산하여 적당한 변수에 저장하시오.
		//세개의 점수중 하나라도 40미만이 있으면 '불합격'처리
		//평균이 60미만이여도 '불합격' 처리를 하여 점수와 총점,평균,합격여부를 표준 출력 장치에 출력하시오.
		int kor = 50;
		int eng = 50;
		int mat = 50;
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		int a = kor+eng+mat;
		System.out.println("총점:"+a);
		double b = a/(double)3;
		System.out.println("평균:"+b);
		
		
		boolean c =(kor>=40)&&(eng>=40)&&(mat>=40);
		c = (b>=60);
		if(c) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		/*
		 * int a=90;
		 * int b=50;
		 * int c=40;
		 * int t=0;
		 * double d =0.0;
		 * boolean r;
		 * String str;
		 * 
		 * Operator(){
		 * t=a+b+c;
		 * d=(double)t/3;
		 * r=(a>=40)&&(b>=40)&&(c>=40)&&(d>=60);
		 * 
		 * str=(r)?"합격":"불합격";
		 * }
		 */
		
		
		
	}
	public static void main(String[] args) {
		new Operator();
		
	}

}
