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
		car = new Car("벤츠");
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member)clone();//얇은복제/복사를 햇는데도 불구하고 원본이 훼손되었다
			
			cloned.scores =Arrays.copyOf(this.scores, this.scores.length);//깊은복제/원본이 훼손되지 않는다
			
			cloned.car = new Car(this.car.model);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return cloned;
	}

}
