/*
 * 1)Student클래스 생성
 * 2)매개변수가 없는 생성자로 객체를 생성하면 이름,주소,연락처를
 * "홍길동","종로구","010-1111-1111"으로 필드를 초기화하시오(irum,address,phone)
 * 3)이름을 파라메터로 전달하면 전달된이름만 필드에 적용되는 생성자를 중복선언하시오.
 * 4)이름,주소,연락처를 파라메타를 전달하면 모든 값을 필드에 적용하는 생성자를 중복 선언 하시오.
 * 5)main()를 작성하여 위의 요구조건이 처리 되는지를 테스트하시오.
 */
package e_class;

public class Student {
	private/*나만쓸거야*/ String irum ; //필드선언
	String address = null;//해도 필드는 자동으로 초기화되기때문에 상관없다
	String phone;
	
	
	Student(){
		this.irum = "홍길동";
		this.address = "종로구";
		this.phone = "010-1111-1111";
	}	//생성자는 클래스는 초기화한다. 필드에 값을 넣음으로서 필드의 초기화가되는것이다.
	Student(String n){
		this.irum =n ;
	}//3)중복선언의 방법 = 매개변수가 다르거나 순서가 다르거나
	Student(String n,String a,String p){
		this.irum = n;
		this.address = a;
		this.phone = p;
	}//4)
	
	void prn() {//캡슐화를 위한 캡슐
		System.out.println(this.irum);
		System.out.println(this.address);
		System.out.println(this.phone);
		System.out.println("-----------------");
	}
	
	public static void main(String[] arg) {
		Student s1 = new Student();
		s1.prn();//캡슐화
		
		Student s2 = new Student("일지메");
		s2.prn();
		
		Student s3 = new Student("춘향이","남원","010-2323-3232");
		s3.prn();
	}

}
