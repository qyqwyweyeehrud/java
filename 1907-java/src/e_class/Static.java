package e_class;

public class Static {
	//정적형(공용자원) : 모든 객체가 하나의 값만 사용
	//초기화는 1회만
	//클래스명.멤버 또는 객체명.멤버 으로 모두 접근가능
	static int v1 = 5000;
	int v2 = 5000;//인스턴스형
	

	public static void main(String[] args) {
		Static s1 = new Static();
		s1.v1 = 1000;
		s1.v2 = 1000;
		System.out.println(s1.v2);
		
		Static s2 = new Static();
		System.out.println(s2.v1);//v1은 초기화가 한번일어나고 객체를 새로 생성해서 찍었음에도 static변수는 초기화되지않는다
		System.out.println(Static.v1);
		System.out.println(s2.v2);//v2는 다시초기화가됫음


	}

}
