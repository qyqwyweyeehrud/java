package d_array;

public class Exam8 {

	int[][] s = new int[5][5];
	Exam8(){
		int sum = 0;
		int min = 0;
		int max = 0;

		for(int i =0;i<s.length;i++) {
			for(int k =0;k<s[i].length;k++) {
				s[i][k] = (int)(Math.random()*101)+100;
				
				System.out.print(s[i][k]+" ");
				}
			System.out.println();//--------------------------------------------for k
		}//----------------------------------------------------for i
		
		min = s[0][0];
		max = s[0][0];
		for(int i =0;i<s.length;i++) {
			for(int k =0;k<s[i].length;k++) {
			sum = sum + s[i][k];
				if(min>s[i][k]) {
					min = s[i][k];
				}//---------------------------------------------if min
				if(max<s[i][k]) {
					max = s[i][k];
				}//---------------------------------------------if max
				
			}//-------------------------------------------------for k
		}//-----------------------------------------------------for i
		for(int i =0;i<s.length;i++) {
			max = 0;
			for(int k =0;k<s[i].length;k++) {
				if(max<s[i][k]) {
					max = s[i][k];
				}//------------------------------------------------if max
			}//----------------------------------------------------for k
			
			System.out.println((i+1)+"행의 최대값:"+max);
		}//--------------------------------------------------------for i	
		System.out.println("배열의 최소값:"+min);
		System.out.println("배열의 최대값:"+max);
		System.out.println("배열의 합:"+sum);
		//System.out.print(s[0][0]+" "); System.out.print(s[0][1]+" "); System.out.print(s[0][2]+" ");System.out.print(s[0][3]+" ");System.out.println(s[0][4]);
		//System.out.print(s[1][0]+" "); System.out.print(s[1][1]+" "); System.out.print(s[1][2]+" ");System.out.print(s[1][3]+" ");System.out.println(s[1][4]);
		//System.out.print(s[2][0]+" "); System.out.print(s[2][1]+" "); System.out.print(s[2][2]+" ");System.out.print(s[2][3]+" ");System.out.println(s[2][4]);
		//System.out.print(s[3][0]+" "); System.out.print(s[3][1]+" "); System.out.print(s[3][2]+" ");System.out.print(s[3][3]+" ");System.out.println(s[3][4]);
		//System.out.print(s[4][0]+" "); System.out.print(s[4][1]+" "); System.out.print(s[4][2]+" ");System.out.print(s[4][3]+" ");System.out.println(s[4][4]);
		
		/*
		s[0][0] =(int)(Math.random()*100)+100; s[0][1]=(int)(Math.random()*100)+100;
		s[1][0] =(int)(Math.random()*100)+100; s[1][1]=(int)(Math.random()*100)+100;
		s[2][0] =(int)(Math.random()*100)+100; s[2][1]=(int)(Math.random()*100)+100;
		s[3][0] =(int)(Math.random()*100)+100; s[3][1]=(int)(Math.random()*100)+100;
		s[4][0] =(int)(Math.random()*100)+100; s[3][1]=(int)(Math.random()*100)+100;
		
		
		System.out.print(s[0][0]+" "); System.out.println(s[0][1]);
		System.out.print(s[1][0]+" "); System.out.println(s[1][1]);
		*/

	
	
	
	
	
	
	
	
	}
	
	
	
	public static void main(String[] arg) {
		new Exam8();
		
	}
}
