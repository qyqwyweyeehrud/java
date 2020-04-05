package c_contrl;

public class SwitchExample3 {
	SwitchExample3(){
		String x ="";
		char grade = 'A';
		switch(grade) {
		  case 'A':
		  case 'a':
			  x = "VVIP";
			  break;
		  case 'B':
		  case 'b':
			  x = "VIP";
		      break;
		  default:
			  x = "¼Õ´Ô";	
		}//switch¹®
		System.out.println(x);
	}

}
