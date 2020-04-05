package c_contrl;

public class SwitchExample4 {
	SwitchExample4(){
		String position = "부장";
		String a = "";
		switch(position) {
		
		case "부장":
			a = "700만원";
			break;
		case "과장":
			a = "500만원";
			break;
		case "신입":
			a = "200만원";
			break;
		case "대리":
			a = "350만원";
		    break;
	    default:
			a = "160만원";
		
		}//switch
		System.out.println(a);
	}

}
