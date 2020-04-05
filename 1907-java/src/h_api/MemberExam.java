package h_api;

import java.util.Arrays;

public class MemberExam {

	public static void main(String[] args) {
		Member ori = new Member("blue","hong","1234",25,true);
		
		Member cloned =  ori.getMember();
		
		System.out.println("복제된 객체의 필드값");
		System.out.println("id:"+cloned.id);
		System.out.println("name:"+cloned.name);
		System.out.println("password:"+cloned.password);
		System.out.println("age:"+cloned.age);
		System.out.println("adult:"+cloned.adult);
		
		cloned.scores[0] = 100;
		System.out.println(Arrays.toString(ori.scores));//클론의 스코어만 100으로 했는데 원본도바꼇다
		System.out.println(Arrays.toString(cloned.scores));
		
		cloned.car.model = "소나타";//분명히나는 클론의 소나타로만바꿧는데 원본도바꼇다
		System.out.println(ori.car.model);
		System.out.println(cloned.car.model);

	}

}
