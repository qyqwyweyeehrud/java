package c_contrl;
/*
 * ����Ÿ��� ���� �ýÿ���� ����Ͽ� ���
 * �⺻ 2000m ������ �⺻����� 3000��
 * 200m�� �߰������ 500���� ���ݵȴ�
 * ���� �մ��� ����Ÿ��� 4530mm�� ��� �ýÿ���� ����Ͻÿ�
 */
public class Exam2 {
	Exam2(){
		/*
		int totm = 2001;
		int base = 2000;
		int basePrice =3000;
		int b =500;
		int m = totm - base;
		
		int totPrice = 0;
		int a = (totm-base)/200;
		
		if((totm-base)-2000<0) {
			totPrice = basePrice;
		if((totm-base)%200==0) {
			totPrice =basePrice+(b*a);
			}
		}else if((totm-base)%200>0) {
			totPrice =basePrice+(b*a)+b;
		}
		int mPrice = totPrice-basePrice;
		*/
		int totm = 2001;
		int base = 2000;
		int basePrice =3000;
		int mPrice = 500;
		int m = 0;
		int totPrice = 0;
		m = totm-base;
		if(m>0) {
			int v = m/200;
			if(m%200>0) {
				v++;
			}
			totPrice = basePrice + (500*v);
		}else {
			totPrice = 3000;
		}
		
		
		String mmg = "�⺻�Ÿ�:" +  base;
		mmg += "\n�⺻���:" + basePrice;
		mmg += "\n����Ÿ�:" + totm;
		mmg += "\n�߰��Ÿ�:" + m;
		mmg += "\n�߰����:" + mPrice;
		mmg += "\n�ѱݾ�:" + totPrice;
		System.out.println(mmg);
	}

}
