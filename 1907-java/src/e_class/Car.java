package e_class;

public class Car {
	//�ʵ�� Ŭ���� �ؿ�����
	String model = "�׷���";//���
	String color = "�׷���";//���
	int maxSpeed = 0;//���
	//�پ缺�� ������
	Car(){ }//�Ű����,�ƱԸ�Ʈ�� �ƹ��͵� ���������ʴ� ������
	Car(String model){ //19���� ����
		this.model = model;//this���پ������� ��� �º���this.model�� 5�������Ѵ�/�캯�� model�� 10���� �Ű������� ���Ѵ�.
		//this.model= model�̶�� ������ ������ �������ƴ϶� �ʵ忡�ִº������ �������ش�
	}//�Ʊ͸�Ʈ�� ��� ������ �����̴� ��,����� ������ �ٸ���
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	//����� �����ҰŸ� �޼ҵ带 �������Ѵ�.
	//void speedUp() {}//������Ű�� �ȿ����� ����
	public void speedUp() {
		this.maxSpeed +=10;
		
	}
	public void speedDown() {
		this.maxSpeed -=10;
	}
	
	
	
	public static void main(String[] args) {
		Car c1 = new Car();//�ϳ��� �۾��� �ΰ��ǻ��� �����ڸ� �����Ҽ�����==>Car()��� ������ ����
		Car c2 = new Car("�׷���");//���ڿ��� �ϳ��ִ� �����ڷ� �ڵ����� ã�Ƽ� ��
		Car c3 = new Car("�׷���","�׷���");
		//Car c4 = new Car(100);//�̷��Դ� �ȵ� �ֳ��ϸ� �����ϳ����������ִ� �����ڰ� ���⶧����
		//Car c4 = new Car(100,"�׷���","�׷���");//�̻�Ȳ�� �������� ��, �Ű������� ���µ��� ������ �߿��ϴ�.
		Car c4 = new Car("�׷���","�׷���",100);
		
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
	//c2,c3,c4�� ����������� �ٸ����¸� ����������
	//����������
	

}
