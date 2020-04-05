package c_contrl;

public class SwitchExample2 {//브레이크가없는 스위치문
	SwitchExample2(){
		String a =" ";
		int time = (int)(Math.random()*4)+8;
		switch(time) {
		  case 1:
			a = "출근중입니다";
		  case 2:
			  a = "회의중입니다";
		  case 3:
			  a = "업무중입니다";
		  default://해당되는 case가 없다면
			  a = "출장중입니다";
		}//switch문
		System.out.println(a);
	}

}
