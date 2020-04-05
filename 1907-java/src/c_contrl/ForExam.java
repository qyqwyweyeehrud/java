package c_contrl;

public class ForExam {
	ForExam(){
		int sum =0;
		for(int i=1;i<=100;i++) {//(int i=1;i<=100;i=i+2) 홀수의합 //(int i=0;i<=100;i=i+2) 짝수의합
			sum = sum+i;//sum += i;
			System.out.println(i+ "까지의 합"+sum);//for문 안에있는 sum의 과정을 쭉 출력하겟다.
		}
		System.out.println(sum);//sum결과를 출력하겠다.
	}

}
