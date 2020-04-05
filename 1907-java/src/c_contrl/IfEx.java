package c_contrl;

public class IfEx {
	public static void main(String[] args) {
		//JVM이 매개변수가 없는 생성자를 임대
		IfEx obj = new IfEx();
		//obj는 참조형변수 
		//IfEx o =0; 이나 int k= 3.14나 같은데, 실수를 정수에대입 안되듯이 정수를 IfEx에 대입할수없다
		//int k = obj.type1();
		//System.out.println(k);
		//System.out.println(obj.type1());
		String m = obj.type2();
		System.out.println(m);
		
		//System.out.println(obj.type3());
		
		char f = obj.type3();
		System.out.println(f);
		
		obj.type4();
		
		
	}
int type1() {
	int r = 0;
	int s = 93;
	if( s>=90) {
		System.out.println("점수가 90보다 큽니다");
		System.out.println("등급은 A입니다");
		}
	if ( s<90 ) {
		System.out.println("점수가 90보다 작습니다");
		System.out.println("등급은 B입니다");
	}
	return r;//이밑으론 더이상 실행하지않고 자기를 호출한곳으로 되돌아간다. 9행으로 되돌아감
}
String type2() {
	String r = null;
	int s =50;
	if ( s>=90 ) {
		r = "90 이상임";
		r += "\nA";
	}else {
		r = "90 미만임";
		r += "\nB"; //+= --> r=r+B  // \n --> enter,줄바꿔줘
	}
	return r;//12행으로 되돌아감
}


char type3() {
	char r = ' ';
	int a =95;
	if ( a>=90) {
		r = 'A';
		//return r; 써도됨
	}else if (a>=80) {
		r = 'B';
		//return r;
	}else if (a>=70) {
		r = 'C';
		//return r;
	}else if (a>=60) {
		r = 'D';
		//return r;
	}else if (a>=50) {
		r = 'E';
		//return r;
	}else if (a>=40) {
		r = 'F';
	}
	return r;
}
/*
 * 성적이 0~100일때만 60이상이면 '합격' 60미만이면 '불합격'
 * 을 출력하고, 성적이 범위 밖이면 '성적오류'를 출력하시오.
 * >>>>>>>>>>>>필요한 변수가 무엇인가,문자열 변수가 필요하겠구나, 0~100,60을 변수처리할건지 리터럴처리할건지
 */
void type4() {
	int score = -70;
	String result ="";
	
	if(score>=0 && score<=100) {
		if(score>=60) {
			result = "합격";
		}else { result = "불합격";
		
		}
	}else {
		result = "성적오류";
	}
		
	System.out.println(result);
}
}
