package c_contrl;

public class SwitchExample {
	SwitchExample(){
		String a ="";
		int num = 0;
		
		for(int i=0;i<500;i++/*i=i+1*/) {
		    num = (int)(Math.random()*7)+1;
		
		if(num<1 || num>6) {
			System.out.println("��ȣ�� �����߻�");
			System.exit(0);//�ý����� ������Ѷ�
		}
		
		switch(num) {
		case 1:
			a = ("1�� ���Խ��ϴ�");
			break;
		case 2:
			a = ("2�� ���Խ��ϴ�");
			break;
		case 3:
			a = ("3�� ���Խ��ϴ�");
		    break;
		case 4:
			a = ("4�� ���Խ��ϴ�");
			break;
		case 5:
			a = ("5�� ���Խ��ϴ�");
			break;
		default://�ش�Ǵ� case�� ���ٸ�
			a = ("6�� ���Խ��ϴ�");
		}//switch��
		System.out.println(a);
		}//for��
	}

}
