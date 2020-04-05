package h_api;

import java.util.Arrays;

public class Member implements Cloneable{
	public String  id;
	public String  name;
	public String  password;
	public int     age;
	public boolean adult;
	public int[] scores;
	public Car car;
	
	public Member(String id,String name,String password,int age,boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		scores = new int[] {10,20,30};
		car = new Car("����");
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member)clone();//��������/���縦 �޴µ��� �ұ��ϰ� ������ �ѼյǾ���
			
			cloned.scores =Arrays.copyOf(this.scores, this.scores.length);//��������/������ �Ѽյ��� �ʴ´�
			
			cloned.car = new Car(this.car.model);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return cloned;
	}

}
