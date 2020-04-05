package z_exam;

public class Child extends MyClass {
	
	public MyClass method1(MyClass mc) {
		MyClass m = new MyClass();
		return m;
	}
	
	public Child method2(Child c) {
		Child myC= new Child();
		return myC;
	}
	
	public static void main(String[] args) {
		MyClass mc = new Child();//다형성의 가장 기본적인 골격
		Child c = (Child)mc;//부모가 자식이 추가한메소드를 사용하려면 반드시 mc를 자식클래스로 캐스팅이 필요하다
		
		Child c2 = new Child();//이렇게 만들면되는데 왜 굳이 캐스팅을해서 사용하냐?
		c2.method1(mc);//== MyClass mc = mc;  ==  MyClass mc = new Child();/mc와 c를 모두 전달받을수있다
		c2.method2(c); //== MyClass mc = c;   ==  MyClass mc = new Child();/java는 무조건 종속적이다(정수형에 정수만 넣을수있다) 
		//하지만 마이클래스타입에 차일드타입을 대입해도 에러가안난다
		//그이유는 메소드1의 매개변수 타입이 마이클래스타입 이기때문이다
		//is a 관계:mc도 마이클래스를 상속받았고 c도 마이클래스를 상속받았다
		
		//c2.method2(mc); //Child c = mc; - mc는 마이클래스타입(부모형) c는 차일드타입(자식형) 이기때문에 불가능 자식에 부모를 대입할순 없다.
		c2.method2(c);
		
		//다형성이란? 같은 자료형에 여러 가지 객체를 대입하여 다양한 결과를 얻어내는 성질
		//다형성의 효과? 하나의 타입으로 다양한 실행 결과를 얻을 수 있으며 객체를 부품화하여 유지 보수를 용이하게 한다.
		//다형성 구현방법? 클래스의 상속이나 인터페이스를 구현하는 자식 클래스에서 메서드를 재정의(오버라이딩) 하고 
		//				   자식 클래스를 부모 타입으로 업캐스팅한다. 그리고 부모 타입의 객체에서 자식 멤버를 참조하여 다형성을 구현한다.
	}
}
