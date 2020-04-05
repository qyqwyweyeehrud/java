package d_array;

import java.util.Scanner;

public class ArrayExam3 {//<<이거를 자동으로실행할수있는함수를 자동으로 완성해준다
	//이번시간은 생성자랑 비슷하게생겻지만 일반메소드에 만들것이다.
	//전문성을띈 생성자만 만들겠다<부서를 만들겠다.
	//접근자,반환형(return문장을쓰지않겟다),메소드명(매개변수){...} <<이런구조가 메소드다. 클래스명이 똑같아도 반환형이 붙어있으면 메소드이다.
	//모든 메소드는 불려져야지만 실행됨
	//일반메소드 호출방법=main에서 호출,또다른메소드에서,클래스안에서
	//this. 을붙힌다 멤버끼리는 무조건this.을 붙히면 아 이클래스가 가지고있는 멤버들!
	//this.대신에 객체명을 쓴다
	//메소드안에 메소드는 불가
	public int test2() {
		//문자열 1차원배열(names)에 임의의 성명 5개를 대입
		//정수형 2차원배열(s)에 5명의 성적 국어,영어 성적을 대입
		String[] names = new String[5];
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";
		names[3] = "d";
		names[4] = "e";
		int[][] s = new int[][] {
			{ 10,20 },
			{ 20,30 },
			{ 30,40 },
			{ 40,50 },
			{ 50,60 }
		};
		int tot =0;
		double avg =0;
		//배열의 첫번째 학생의 이름과 성적및  총점,평균을 출력
		System.out.println("----------------------------------------");
		System.out.println("이름:"+names[0]+"\n국어성적:"+s[0][0]+"\n영어성적:"+s[0][1]);
		
		tot = s[0][0] + s[0][1];
		avg = (double)tot/s[0].length;
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		
		//3번째학생의 국어점수를 100점으로 수정하시오
		s[2][0] = 100;
		//3번째 학생의 이름과 국어 성적을 출력하시오
		System.out.println("이름:"+names[2]);
		System.out.println("국어성적:"+s[2][0]);
		//학생명이 d인 사람의 국어,영어,총점,평균을 계산하여 출력
		//하되 없으면"자료없음"을 출력해달라
		//검색어를 입력하여 검색하고 검색을 중지하려면"quit"을 입력하도록 프로그램을 수정하라
		
		Scanner scanner = new Scanner(System.in);
		String findStr = "";
		while(!findStr.equals("quit")) {
			System.out.print("검색할 이름은?");
			findStr = scanner.nextLine();//한줄단위로/반환형이 String타입이라서 호출명이 String타입이였구나
			
			int p =-1;
			for(int i =0;i<names.length;i++) {
				if(names[i].equals(findStr)) {//문자열은 == 이 안됨
					System.out.println(names[i]);
					System.out.println("국어:"+s[i][0]);
					System.out.println("영어:"+s[i][1]);
					p = i;
					tot = s[i][0]+s[i][1];
					avg = (double)tot/s[i].length;
					System.out.println("총점:"+tot);
					System.out.println("평균:"+avg);
					break;//동명이인이 있을때는 브레이크를 삭제해야함
				
				}
			}
		
			if(p==-1) {//abcde 이외의 다른수가 입력됫을때 NaN이 뜨지않기위한 작업
				System.out.println("자료없음");
			}
		}
		
		
		
		
		
		
		
		/*this.test1();//고수는 this를 사용,this생략 가능
		test1();//비록 test1이 test2보다 먼저선언 됫엇어도 호출이 가능하다.
		return 0;//void타입이아닌 다른 정수형타입같은경우는 반환값이 필요함*/
		return 0;
	}
	//접근자 반환형 메서드명(매개변수){...}
	//정수형 2차원 배열을 선언하고 초기값을 4형3열의 데이터를 대입
	public void test1() {
		int[][] s = new int[][] {//기본형//초기 데이터가 있는경우에 일단4행을 실행한것
			{ 1,2,2 },
			{ 2,3,4 },
			{ 4,5,6 },
			{ 7,8,2 }//이런형대가 4행 3열
		};
		
		//배열의 행수
		System.out.println("행수:"+s.length);
		System.out.println("첫번째 행의 열수:"+s[1].length);
		//두번째행의 세번째열의 값은?
		System.out.println(s[1][2]);//0베이스라서 첨자로0=1번째 1=2번째 2=3번째
		//첫번째 행의 값들의 합계
		int hap = s[0][0] + s[0][1] + s[0][2];
		System.out.println(hap);
		//첫번째 열의 합계
		hap = s[0][0] + s[1][0] + s[2][0] + s[3][0];
		System.out.println(hap);
		//두번째 행의 값들중 짝수만 출력
		if(s[1][0]%2 == 0) {
			System.out.print(s[1][0]+" ");
		}
		if(s[1][1]%2 == 0) {
			System.out.print(s[1][1]+" ");
		}
		if(s[1][2]%2 == 0) {
			System.out.println(s[1][2]);
		}
		//세번째열의 짝수의 평균을 구하시오
		System.out.println("--------------------");
		hap = 0;
		int count =0;
		double avg =0;
		
		
		/*if(s[0][2]%2==0) {
			hap += s[0][2];
			count++;
		}*/
		for(int i =0;i<s.length;i++) {	
				if(s[i][2]%2==0) {
					hap = hap + s[i][2];
					count++;
					}
				if(count>0) { //count가 0으로 계산되서 출력되면 NaN이 뜬다 NaN은 오류이기때문에 0이뜨도록해주기위해 조건식을 추가해준다
					avg = (double)hap/count;
				}
		}
		System.out.println(avg);
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {//생성자지만 유독 메인만 메인함수라고부른다.
		ArrayExam3 a3 = new ArrayExam3();//가상머신이 생성자를 빌려줌 가상머신이빌려주는 생성자는 매개변수가없다.
	//a3이 가지고있는 test1 이라고하는 메소드를 호출한거다.
	 //좌변에 아무것도 없어도 되는이유는 void를 썻기에 반환값이 없어서 쓰지않아도된다.
	  a3.test1();//객체가 가지고있는 메소드누구누구 로 사용해야한다
	  a3.test2();
	  //클래스 밖에서 호출할때는 객체가 가지고있는 메소드로 호출해야한다.
	}
}
