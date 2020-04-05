package c_contrl;

public class SwitchExample {
	SwitchExample(){
		String a ="";
		int num = 0;
		
		for(int i=0;i<500;i++/*i=i+1*/) {
		    num = (int)(Math.random()*7)+1;
		
		if(num<1 || num>6) {
			System.out.println("번호에 오류발생");
			System.exit(0);//시스템을 종료시켜라
		}
		
		switch(num) {
		case 1:
			a = ("1이 나왔습니다");
			break;
		case 2:
			a = ("2가 나왔습니다");
			break;
		case 3:
			a = ("3이 나왔습니다");
		    break;
		case 4:
			a = ("4가 나왔습니다");
			break;
		case 5:
			a = ("5가 나왔습니다");
			break;
		default://해당되는 case가 없다면
			a = ("6이 나왔습니다");
		}//switch끝
		System.out.println(a);
		}//for끝
	}

}
