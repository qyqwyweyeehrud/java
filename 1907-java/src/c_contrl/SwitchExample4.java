package c_contrl;

public class SwitchExample4 {
	SwitchExample4(){
		String position = "����";
		String a = "";
		switch(position) {
		
		case "����":
			a = "700����";
			break;
		case "����":
			a = "500����";
			break;
		case "����":
			a = "200����";
			break;
		case "�븮":
			a = "350����";
		    break;
	    default:
			a = "160����";
		
		}//switch
		System.out.println(a);
	}

}
