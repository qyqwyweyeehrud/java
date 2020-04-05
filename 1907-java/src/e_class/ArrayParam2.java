package e_class;

public class ArrayParam2 {
	
	void input(int s){//매개변수형이 인트타입이다
		
	}
	
	void input(Student s) {//매개변수형이 Student타입니다.//25행의 std가 s라는 변수에 대입이된다.
		s.prn();
	}
	//매개변수형이 Car의 메서드
	void input(Car c) {//new Car();//new Car("abc")//new Car("abc","노")//new Car("abc","노","300")
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.maxSpeed);//내가원하는 객체가 전달되서 필요한 프로세스 를 찾았는지
	}
	

	public static void main(String[] args) {
		ArrayParam2 ap2 = new ArrayParam2();
		//어레이파람2라는 매개변수가없는 생성자를 대입
		
		Student std = new Student();//슈트던트타입의 변수를 선언후에 매개변수가없는생성자를 대입해놧음 //student의 17행
		ap2.input(std);//슈트던트타입의 매개변수를 받는 인풋이라는 메소드를 실행해달라
		//스튜던트는 하나의 부품,부서 이다--
		
		System.out.println("---------------");
		Car c1 = new Car();//카 라고하는 타입의 c1을 만들고 매개면수 없는놈을 대입
		ap2.input(c1);//ap2의 car타입을 싱핼해달라 //29,30행에 의하여 13행이 불려진것임
		Car c2 = new Car("볼보","빨강",400);//Car클래스의 19행을 불러옴
		ap2.input(c2);
	

	}

}
