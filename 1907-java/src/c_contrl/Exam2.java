package c_contrl;
/*
 * 주행거리에 따른 택시요금을 계산하여 출력
 * 기본 2000m 까지는 기본요금이 3000원
 * 200m당 추가요금이 500원씩 과금된다
 * 현재 손님의 주행거리가 4530mm인 경우 택시요금을 계산하시오
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
		
		
		String mmg = "기본거리:" +  base;
		mmg += "\n기본요금:" + basePrice;
		mmg += "\n주행거리:" + totm;
		mmg += "\n추가거리:" + m;
		mmg += "\n추가요금:" + mPrice;
		mmg += "\n총금액:" + totPrice;
		System.out.println(mmg);
	}

}
