package c_contrl;
//1~1000까지수 중에 소수만 구하라
public class ForExam6 {
	ForExam6(){
		for(int i = 1;i<=1000;i++) {
			boolean b =true;//i가 소수다
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					b=false;
					break;//for case while 에만 영향받음
				}
			}
			if(b) {
				
				System.out.print(i+" ");
			}
		}
	}

}
