package e_class;

public class ArrayParam2 {
	
	void input(int s){//�Ű��������� ��ƮŸ���̴�
		
	}
	
	void input(Student s) {//�Ű��������� StudentŸ�Դϴ�.//25���� std�� s��� ������ �����̵ȴ�.
		s.prn();
	}
	//�Ű��������� Car�� �޼���
	void input(Car c) {//new Car();//new Car("abc")//new Car("abc","��")//new Car("abc","��","300")
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.maxSpeed);//�������ϴ� ��ü�� ���޵Ǽ� �ʿ��� ���μ��� �� ã�Ҵ���
	}
	

	public static void main(String[] args) {
		ArrayParam2 ap2 = new ArrayParam2();
		//����Ķ�2��� �Ű����������� �����ڸ� ����
		
		Student std = new Student();//��Ʈ��ƮŸ���� ������ �����Ŀ� �Ű����������»����ڸ� �����؇J�� //student�� 17��
		ap2.input(std);//��Ʈ��ƮŸ���� �Ű������� �޴� ��ǲ�̶�� �޼ҵ带 �����ش޶�
		//��Ʃ��Ʈ�� �ϳ��� ��ǰ,�μ� �̴�--
		
		System.out.println("---------------");
		Car c1 = new Car();//ī ����ϴ� Ÿ���� c1�� ����� �Ű���� ���³��� ����
		ap2.input(c1);//ap2�� carŸ���� �����ش޶� //29,30�࿡ ���Ͽ� 13���� �ҷ�������
		Car c2 = new Car("����","����",400);//CarŬ������ 19���� �ҷ���
		ap2.input(c2);
	

	}

}
