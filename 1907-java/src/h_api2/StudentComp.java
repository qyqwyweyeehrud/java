package h_api2;

import java.util.Comparator;

public class StudentComp implements Comparator<Student>{//
	char flag ='n';//�÷��׿� ž��� ������ n�̸� �ѹ���, s�� ���������� ����
	public StudentComp(char flag) {
		this.flag=flag;
	}
	
	@Override
	public int compare(Student s1,Student s2) {
		int result =0;
		if(flag=='n') {
			result = s1.sno - s2.sno;
		}else {
			result = s1.score - s2.score;
		}
		return result;
	}

}
