package c_contrl;

public class SwitchExample2 {//�극��ũ������ ����ġ��
	SwitchExample2(){
		String a =" ";
		int time = (int)(Math.random()*4)+8;
		switch(time) {
		  case 1:
			a = "������Դϴ�";
		  case 2:
			  a = "ȸ�����Դϴ�";
		  case 3:
			  a = "�������Դϴ�";
		  default://�ش�Ǵ� case�� ���ٸ�
			  a = "�������Դϴ�";
		}//switch��
		System.out.println(a);
	}

}
