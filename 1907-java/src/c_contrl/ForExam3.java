/*------------------------------------------------------------------------
 * 아래와같은 방정식이 있다. x값이 1~100사이인 해를 구하여 출력하시오
 * y = 3x + 1
 * 1, 4
 * 2, 7
 * 3, 10
 * 100, 301 
 -------------------------------------------------------------------------*/
package c_contrl;

public class ForExam3 {
	ForExam3(){
		for(int x = 1;x<101;x++) {
			int y = (x*3)+1;
			System.out.printf("(%4d,%4d) \n",x,y);//%를만나면 4는 전체자릿수를 의미함/ d는정수를 의미함
			                                      //프린트 포맷 , \n는 뉴라인에 줄을바꾸라는의미
		}
	}

}
