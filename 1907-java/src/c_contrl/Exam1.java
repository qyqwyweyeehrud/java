/*
 * 모든 처리는 생성자를 사용하여 해결 //반환형이 없다, 클래스명과 반드시 같아야함//생성자의 접근권한은 public이나 생략해도된다(defalt)
 * 성명,주소,연락처가 문자열로 발생한다. 각각의 데이터를 name,address,phone 에 저장한다
 * 성적이 정수형으로 발생하여 각각 kor,eng,mat에 저장
 * 저장된 성적을 사용하여 총점, 평균을 tot, avg에 저장
 * if~else if 문을 사용하여 평균값을 사용하여 학점을 구해서 문자형 변수 grade에 저장.
 */
package c_contrl;

public class Exam1 {
	Exam1() { //생성자의 목적은 필드의 초기화인데 만약 앞에void를 붙히면 필드를 초기화할수 없다.
		String name = "김도경";
		String adress = "경기도 군포시";
		String phone = "010-2437-5566";
		
		int kor = 90;
		int eng = 50;
		int mat = 70;
		
		int tot = kor +eng + mat ;
		double avg = tot/(double)3;
		
		char grade = 0; //// 오답노트 --  0;이 아니라 ' ';
		
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80){
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else if(avg>=50) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		/*System.out.println("-------------");
		System.out.println("성적 처리결과");
		System.out.println("-------------");
		System.out.println("성명:"+name);
		System.out.println("주소:"+adress);
		System.out.println("연락처:"+phone);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		System.out.println("학점:"+grade);
		*/
		String msg = "성명:" + name;
		msg += "\n주소:" + adress;
		msg += "\n연락처:" + phone;
		msg += "\n국어:" + kor;
		msg += "\n영어:" + eng;
		msg += "\n수학:" + mat;
		msg += "\n총점:" + tot;
		msg += "\n평균:" + avg;
		msg += "\n학점:" + grade;
		System.out.println(msg);
		
		
		//return msg;//생성자에선 리턴할수없지만 쓴다면 /이 문자열을 어디에보낼건지 판단해서 리턴해서 msg를 처리할수있다
		
	}
		
	

	
	
	
	public static void main(String[] args) {
		
	}
}
