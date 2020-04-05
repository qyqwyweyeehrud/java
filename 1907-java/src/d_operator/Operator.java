/*
 * 2019-11-27
 * 작성자:김도경
 * 각종 연산자에 대한 생플
 */
package d_operator;

public class Operator {
	
	Operator(){
		//나머지연산자
		System.out.println("12%5 => " + (12%5));
		
		//나머지연산자와 3항연산자
		int n =122;
		String r = (n%2==0)? "짝수" : "홀수";
		System.out.println(n + "==>" + r);
		
		//증강 연산자
		//전치/후치
		int a = 10;
		int b = 10;
		a++;
		++b;
		System.out.println(a + "," +b);
		
		int c = a++;//다항인경우는 ++연산을 후에한다 (후치)
		int d = ++b;//대입하기전에 연산이 이미되버림 (전치)
		System.out.println(c + "," +d);
		System.out.println(a + "," +b);
		
		//문자열 비교
		String name = "박";
		String irum = "박";
		
		
		String irum2 = new String("박");
		
		System.out.println(name==irum);//==는 어떻게 만들어졋는지 보고 비교한다.
		System.out.println(name==irum2);
		
		System.out.println(name.equals(irum)); //equals는 어떻게만들어졋는지 보지않고 문자열만 비교한다.
		System.out.println(name.equals(irum2));
	}
	
	public static void main(String[] args) {
		new Operator();
	}

}
