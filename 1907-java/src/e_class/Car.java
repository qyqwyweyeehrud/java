package e_class;

public class Car {
	//필드는 클래스 밑에선언
	String model = "그랜져";//멤버
	String color = "그레이";//멤버
	int maxSpeed = 0;//멤버
	//다양성을 가진다
	Car(){ }//매개면수,아규먼트가 아무것도 존재하지않는 생성자
	Car(String model){ //19행이 들어옴
		this.model = model;//this가붙어있으면 멤버 좌변의this.model은 5행을뜻한다/우변의 model은 10행의 매개변수를 뜻한다.
		//this.model= model이라는 변수는 지역형 변수가아니라 필드에있는변수라고 지정해준다
	}//아귀먼트도 모두 지역형 변수이다 즉,선언된 영역이 다르다
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	//기능을 구현할거면 메소드를 만들어야한다.
	//void speedUp() {}//같은패키지 안에서만 가능
	public void speedUp() {
		this.maxSpeed +=10;
		
	}
	public void speedDown() {
		this.maxSpeed -=10;
	}
	
	
	
	public static void main(String[] args) {
		Car c1 = new Car();//하나의 작업의 두개의상의 생성자를 실행할수없다==>Car()라는 생성자 실행
		Car c2 = new Car("그랜져");//문자열이 하나있는 생성자로 자동으로 찾아서 들어감
		Car c3 = new Car("그랜져","그레이");
		//Car c4 = new Car(100);//이렇게는 안됨 왜냐하면 정수하나만가지고있는 생성자가 없기때문에
		//Car c4 = new Car(100,"그랜져","그레이");//이상황도 되지않음 즉, 매개변수를 쓰는데는 순서가 중요하다.
		Car c4 = new Car("그랜져","그레이",100);
		
		c1.maxSpeed = 2000;
		System.out.println(c1.maxSpeed);
		System.out.println("model:"+c1.model);
		System.out.println("color:"+c1.color);
		System.out.println("maxSpeed:"+c1.maxSpeed);
		
		System.out.println("c4 spec------");
		System.out.println("model:"+ c4.model);
		System.out.println("color:"+ c4.color);
		System.out.println("maxSpeed:"+c4.maxSpeed);
		System.out.println("---------------------------");
		
		c1.speedUp();
		System.out.println("c1 maxSpeed:"+c1.maxSpeed);
	}
	//c2,c3,c4는 모양은같지만 다른형태를 가지고있음
	//차를구매했
	

}
