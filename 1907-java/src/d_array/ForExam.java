package d_array;

public class ForExam {
	
	ForExam(){
		int[]s = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0 ;
		double avg = 0;
		
		for(int k : s) {
			sum+=k;
		}
		avg = (double)sum/s.length;
		
		System.out.println("ÇÕ°è:"+sum);
		System.out.println("Æò±Õ:"+avg);
		
	}

	public static void main(String[] args) {
		new ForExam();
		// TODO Auto-generated method stub

	}

}
