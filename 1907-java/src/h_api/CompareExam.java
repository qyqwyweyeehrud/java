package h_api;

import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class CompareExam {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(100);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComp());//s1�� StudentComp�� s1�Ű������� /s2�� StudentComp�� s2�Ű�������
		                           //�񱳱���,�񱳴��,�񱳹��
		System.out.println(result);

	}

}
