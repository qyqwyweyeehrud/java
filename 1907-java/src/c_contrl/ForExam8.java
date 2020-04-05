package c_contrl;

public class ForExam8 {
	ForExam8(){
		int s1 = 0;
		int s10 = 0;
		int s20 = 0;
		int s30 = 0;
		int s40 = 0;
		int s50 = 0;
		int s60 = 0;
		int s70 = 0;
		int s80 = 0;
		int s90 = 0;
		
		for(int i = 1;i<=1000;i++) {
			int nan =(int)(Math.random()*100)+1;
				if(nan<10) {s1 = s1+1;}
				else if(nan<20&&nan>=10) {s10 = s10+1;}
				else if(nan<30&&nan>=20) {s20 = s20+1;}
				else if(nan<40&&nan>=30) {s30 = s30+1;}
				else if(nan<50&&nan>=40) {s40 = s40+1;}
				else if(nan<60&&nan>=50) {s50 = s50+1;}
				else if(nan<70&&nan>=60) {s60 = s60+1;}
				else if(nan<80&&nan>=70) {s70 = s70+1;}
				else if(nan<90&&nan>=80) {s80 = s80+1;}
				else if(nan<100&&nan>=90) {s90 = s90+1;}
				
				
		}
		System.out.println("窜磊府:"+s1);
		System.out.println("10磊府:"+s10);
		System.out.println("20磊府:"+s20);
		System.out.println("30磊府:"+s30);
		System.out.println("40磊府:"+s40);
		System.out.println("50磊府:"+s50);
		System.out.println("60磊府:"+s60);
		System.out.println("70磊府:"+s70);
		System.out.println("80磊府:"+s80);
		System.out.println("90磊府:"+s90);
		
		
	}

}
