package c_contrl;
//1~1000까지의 합계가 5000이 넘는 순간의 수를 출력하시오
public class ForExam4 {
	ForExam4(){
		int sum = 0;//사용은 for문안에서 사용하지만 선언은 밖에서 해야되구나
		for(int i = 1;i<1001;i++) {
			sum = sum+i;//sum += i;//이안에서 선언하면 누적연산이 되지않는다 누적연산이 필요하다면 밖에서
			if(sum>=5000) {
				System.out.println(sum);
				break;//포문을 더이상 실핼하지못하도록 //break를만나면 밖으로튀어나감
		/*int sum 0;
		int i=0;
		for(i=1;sum<5000;i++) {
			sum+=i;
		}
		System.out.println((i-1) + "," +sum);*/
			}
		}
	}

}
