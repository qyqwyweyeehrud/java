package d_array;
//배열 []
public class ArrayExam1 {
	ArrayExam1(){
		//배열을 선언하면서 초기값을 대입
		int[] score = {1,2,3,4,5};//배열의 크기는 5개로만들어지고 그안에는12345가들어있다.
		System.out.println(score[4]);
		System.out.println(score[0]);//[]배열은 0베이스이기때문에 0부터시작ex)0>1,1>2,2>3,3>4,4>5
		
		//문자열형 배열을 선언하고 임의의 성명을 3개 저장
		String[] a = {"가","나","다","라","마"};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		a[2] = "두";//배열안의 문자열 수정방법
		System.out.println(a[2]);
		
		//배열을 선언한 후에 초기값을 설정할 때
		double[] height = null;
		//height[] = {80,70,60,50}; 이렇게하면안되고
		height = new double[] {80,90,60,50.5};//이렇게 해야한다
		//double[] height = new double[] {80,90,60,50.5}; 이방법도 가능하다 단지 이렇게하면 new를 생략해도된다
		
		
		//10명의 몸무게를 저장할 수 있는 실수형 배열을 선언
		double[] w = new double[10];//10를선언해야하면대괄호10개 근데그게 더블타입이래 근데 레퍼런스는 참조형으로생성해야해 그래서 new
		//랜덤함수를 사용하여 몸무게를 발생시켜 배열w에 저장해보자
		for(int i=0;i<=9;i++) {
			double d = Math.random()*100;
			w[i] = d;
		}
		for(int i=0;i<10;i++) {
			System.out.printf("%5.1f \n",w[i]);//5개 숫자중에 소수점 이하 1자리만찍어라 000.0<.도 1자리임
		}
		
		//몸무게의 합계와 평균 계산
		double hap = 0;
		for(int i=0 ; i<w.length; i++) {
			hap += w[i];
		}
		double avg = hap/w.length;
		
		System.out.printf("합계= %10.2f \n",hap);
		System.out.printf("평균= %7.2f \n",avg);
		
			}

	
	
	public static void main(String[] args) {
		for(int i=0;i<args.length ; i++) {
			System.out.println(args[i]);
		}
		//new ArrayExam1();
	}
}
