package e_class;

public class ArrayParam {
	ArrayParam(int[] s){ 
		for(int i=0 ; i<s.length ; i++) {
			System.out.println(s[i]);
		}
	}
	
	int arraySum(int[] s) {//==int[]s=abc // int[]s ={1,2,3,4,5}
		int sum = 0;
		for(int i =0;i<s.length;i++) {
			sum += s[i];
		}
		return sum;
	}
	//전달받은 배열에서 최대값을 구하여 리턴하자
	int arrayMax(int[] s) {//가로안은 테이터형이 오는거라 숫자는 올수없다. 정수형 배열이라는 의미만쓰는것이다
		int max = s[0];
		for(int i = 1;i<s.length;i++) {
			if(max<s[i]) {
				max = s[i];
			}
		}
		return max;
	}
	//전달받은 배열에서 최소값을 구하여 리턴하자
	int arrayMin(int[] s) {
		int min = s[0];
		for(int i=1; i<s.length;i++) {
			if(min>s[i]) {
				min = s[i];
			}
		}
		return min;
	}

	int[] maxMin(int[] s) {//변수를 2개쓰고싶으면 배열로생성
		int[] m= new int[2];
		m[0] =s[0];
		m[1] =s[0];
		for(int i = 1; i<s.length;i++) {
			if(m[0]< s[i]) {
				m[0] = s[i];
			}
			else if(m[1]>s[i]) {
				m[1] = s[i];
			}
		}
		return m;
		/*
		int[] m= new int[2];
		int max =s[0];
		int min =s[0];
		for(int i = 1; i<s.length;i++) {
			if(max< s[i]) {
				max = s[i];
			}
			else if(m[1]>s[i]) {
				min = s[i];
			}
		}
		m = new int[] {max,min};
		return m;
		*/
		}
	
	public static void main(String[] args) {
		int [] abc = {-13,1242,73,44,5,36,77,-8,129,110};
		ArrayParam ap1 = new ArrayParam(abc);
		int hap = ap1.arraySum(abc);//abc의 return된값을 hap에 저장하겠다.
		System.out.println(hap);
		int max = ap1.arrayMax(abc);
		System.out.println(max);
		int min = ap1.arrayMin(abc);
		System.out.println(min);
		int[] r= ap1.maxMin(abc);
		System.out.println("최대값 r[0]:"+r[0]);
		System.out.println("최소값 r[0]:"+r[1]);

		


	}

}
