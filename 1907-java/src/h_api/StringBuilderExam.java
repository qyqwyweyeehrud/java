package h_api;
//스트일의 송도와 스트링빌더의 속도비교
public class StringBuilderExam {
	public StringBuilderExam(){
		//String 속도
		long sTime = 0 , eTime =0;
		String str = "";
		
		sTime = System.nanoTime();
		for(int i =0;i<50000;i++) {
			str +="a";
		}
		eTime = System.nanoTime();
		
		System.out.println("String 처리시간:" + (eTime - sTime));
		
		//스트링 빌더
		StringBuilder sb = new StringBuilder(100);
		sTime = System.nanoTime();
		for(int i =0 ;i<50000 ; i++) {
			sb.append("a");
		}
		eTime = System.nanoTime();
		
		System.out.println("StringBuilder 경과시간:"+(eTime-sTime));
	}

	public static void main(String[] args) {
		new StringBuilderExam();

	}

}
