package h_api;

import java.util.Arrays;
import java.util.Objects;

import h_api2.Student;
import h_api2.StudentComp;

public class ShortExam {
	
	//������ �迭���� ������������ ����
	public void numberSort() {
		int[] n = {21412,4,214,1251,51,61,6,1,376,1,7,7,538,458,76569,69,67,9};
		System.out.println("������:");
		System.out.println(Arrays.toString(n));
		int temp = 0;//���Ǽ�
		for(int i = 0;i<n.length-1;i++) {//����
			for(int j = i+1;j<n.length;j++) {
				if(n[i]>n[j]) {//swap  //"<"�� �������� ">"���������
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}//if
			}//for j
		}//for i
		
		System.out.println("������:");
		System.out.println(Arrays.toString(n));
		
	}
	
	//���ڿ��� �迭���� ������������ ����
	public void strSort() {
		String[] a = new String[]{"g","��","fqqe","q","2623cfq","������","y","1255","c","�ϵ��","t","61","u","j"};
		String temp ="";
		for(int i = 0;i<a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i].compareTo(a[j])>0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("������:");
		System.out.println(Arrays.toString(a));
		
	}
	
	public void objSort() {
		Student[] n = new Student[] {
				new Student(10,"hong",60),
				new Student(1,"kim",90),
				new Student(3,"park",40),
				new Student(8,"lee",99),
				new Student(2,"hong",66)
		};
		
		Student temp = null;//���Ǽ�
		for(int i = 0; i<n.length-1; i++) {//����
			for(int j = i+1;j<n.length;j++) {//�񱳴��
				int result = Objects.compare(n[i],n[j],new StudentComp());
				if(result>0) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		
		for(int i =0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		//System.out.println(Arrays.toString(n));
	}

	public static void main(String[] args) {
		ShortExam se = new ShortExam();
		se.numberSort();
		se.strSort();
		se.objSort();

	}

}
