package h_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExam {
	
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		System.out.println(sdf.format(now));
		
		
		Calendar cal = Calendar.getInstance();//������ ���Ұ�
		//Date�� �ٸ�
		System.out.println(cal.get(Calendar.MONTH)+1);//MONTH�� +1
	}

}
