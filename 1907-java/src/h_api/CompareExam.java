package h_api;

import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class CompareExam {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(100);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComp());//s1은 StudentComp의 s1매개변수에 /s2는 StudentComp의 s2매개변수에
		                           //비교기준,비교대상,비교방법
		System.out.println(result);

	}

}
