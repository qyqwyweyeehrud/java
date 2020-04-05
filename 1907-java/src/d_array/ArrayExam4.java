package d_array;

import java.util.Scanner;

public class ArrayExam4 {//필드
	String[] n = new String[10];
	int[][] s = new int[10][2];
	int count = 0;//배열에 입력된 자료의 갯수
	String name = "";
	int kor = 0;
	int eng = 0;
	int tot = 0;
	double evg = 0;
	
	
	//무한루프를 돌면서 메뉴를 출력
	ArrayExam4(){
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		//샘플용 데이터를 배열에 저장
		n[0] = "hong";
		n[1] = "kim";
		n[2] = "park";
		n[3] = "lee";
		s[0][0] = 90; s[0][1] = 90;
		s[1][0] = 90; s[1][1] = 90;
		s[2][0] = 90; s[2][1] = 90;
		s[3][0] = 90; s[3][1] = 90;
		count = 4;
		
		
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.입력|2.수정|3.조회및 출력|4.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴선택:");
			int menu = scanner.nextInt();
			switch(menu) {  //if(menu==1) input() else if(menu==2) modify() else if(menu==3) serch()
			case 1:
				this.input();//this가 붙으면인풋이라는 메소드가 다른클래스에있는게 아니라 자기자신의 메소드이구나
				break;
			case 2:
				this.modify();
				break;
			case 3:
				this.serch();
				break;
			case 4:
				run = false;
				break;
				
			}//--------------------------------------------------------------------switch
		}//------------------------------------------------------------------------while
		System.out.println("프로그램이 종료 되었습니다");
	}
	
	
	//학생의 성적 정보를 배열에 입력
	public void input() {//멤버들 모두 사용할수있게 배열을 선언 하려면 필드에 선언해야한다
		Scanner scanner = new Scanner(System.in);
		System.out.print("성명:");
		name = scanner.nextLine();
		System.out.print("국어점수:");
		kor = scanner.nextInt();
		System.out.print("영어점수:");
		eng = scanner.nextInt();
		
		tot = kor + eng;
		evg = (double)tot/2;
		
		System.out.println("총점:"+tot);
		System.out.println("평균:"+evg);
		
		n[count] = name;
		s[count][0] = kor;
		s[count][1] = eng;
		count++;
		
		
	}
	
	//학생의 성적 정보를 수정
	//1)수정할 학생명을 입력받아 검색
	//2)검색된 정보를 표시
	//3)수정
	//4)배열 정보도 수정
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		String findName="";
		System.out.print("검색할 학생명은?");
		findName = scanner.nextLine();
		for(int i =0 ;i<count;i++) {
			if(n[i].equals(findName)) {
				System.out.println("성명:"+n[i]);
				System.out.println("국어:"+s[i][0]);
				System.out.println("영어:"+s[i][1]);
				System.out.println("-----------------");
				System.out.println("성적을 수정하세요");
				System.out.print("국어:");
				s[i][0] = scanner.nextInt();
				System.out.print("영어:");
				s[i][1] = scanner.nextInt();
				System.out.println();
			}
		}			
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
	//학생의 성적 정보를 조회 및 출력
	public void serch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색을 할 성명은?");
		String findName = scanner.nextLine();
		
		int tot = 0;
		double evg = 0;
		
		for(int i =0 ; i<count ; i++) {
			if(n[i].equals(findName)||findName.equals("")) {
				//TODO(총점,평균을 계산하여 출력)
				tot = s[i][0] + s[i][1];
				evg = (double)tot/2;
				System.out.print("이름:"+n[i]+" ");
				System.out.print("국어성적:"+s[i][0]+" ");
				System.out.println("영어성적:"+s[i][1]);
				System.out.print("합계:"+tot+" ");
				System.out.printf("평균:"+"%5.1f",evg);
				System.out.println();
			}
		}
	}
	
	

	public static void main(String[] args) {
		new ArrayExam4();

	}

}
