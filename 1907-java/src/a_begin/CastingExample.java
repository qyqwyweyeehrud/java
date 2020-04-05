package a_begin;

public class CastingExample {
	
	public CastingExample(){
		//int -> char
		int a = 44033;
		char c = (char)a;
		System.out.println(c);
		
		//long - > int
		long l = 500;
		a = (int)l;
		System.out.println(a);
		
		//double -> int
		double d = 3.14;
		a = (int)d;
		System.out.println(a);
		
		double d2 = 10/(double)3;
		d2 = 10 / (3*1.0);
		
		System.out.println(d2);
	}
	
	
	public static void main(String[] args) {
		
       new CastingExample();

	}
}