//초기값으로 정수형 성적이 10개 발생하였다.이를 배열에저장한후 성적중 최대값과 최소값을 검사하여 출력하시오
//1)정수형 배열 선언하고 초기값 10개 대입(scores)
//2)최대값,최소값을 저장할 변수 선언(max,min)
//3)max에 배열의 첫번째값을 저장(배열의 첫번째 값이 최대값으로 판정하고 시작
//4)min에 배열의 첫번째값을 저장(배열의 첫번째 값이 최소값으로 판정하고 시작
//5)최대값을 찾기위한 루핑
//6)최소값을 찾기위한 루핑
//7)최대값,최소값 출력

package d_array;

public class ArrayExam2 {
	ArrayExam2(){
		//1)
		int[] scores =/* new int[]*/ {23,125,623,12,654,76,844,35,46,57};
		int max = scores[1];
		int min = scores[1]; //2)3)4)해결
		//5)
		for(int i=1;i<scores.length;i++) {
			if(max<scores[i]) {
				max = scores[i];
			}
		}
		//6)
		for(int i=1;i<scores.length;i++) {
			if(min>scores[i]) {
				min = scores[i];
			}
		}
		//7)
		System.out.println("최대값="+max);
		System.out.println("최소값="+min);
	}

	public static void main(String[] args) {
		new ArrayExam2();
	}
}
