//�ʱⰪ���� ������ ������ 10�� �߻��Ͽ���.�̸� �迭���������� ������ �ִ밪�� �ּҰ��� �˻��Ͽ� ����Ͻÿ�
//1)������ �迭 �����ϰ� �ʱⰪ 10�� ����(scores)
//2)�ִ밪,�ּҰ��� ������ ���� ����(max,min)
//3)max�� �迭�� ù��°���� ����(�迭�� ù��° ���� �ִ밪���� �����ϰ� ����
//4)min�� �迭�� ù��°���� ����(�迭�� ù��° ���� �ּҰ����� �����ϰ� ����
//5)�ִ밪�� ã������ ����
//6)�ּҰ��� ã������ ����
//7)�ִ밪,�ּҰ� ���

package d_array;

public class ArrayExam2 {
	ArrayExam2(){
		//1)
		int[] scores =/* new int[]*/ {23,125,623,12,654,76,844,35,46,57};
		int max = scores[1];
		int min = scores[1]; //2)3)4)�ذ�
		//5)
		for(int i=1;i<scores.length;i++) {
			if(max<scores[i]) {
				max = scores[i];
			}
		}
		//6)
		for(int i=1;i<scores.length;i++) {
			if(min>scores[i]) {
				min = scores[i];
			}
		}
		//7)
		System.out.println("�ִ밪="+max);
		System.out.println("�ּҰ�="+min);
	}

	public static void main(String[] args) {
		new ArrayExam2();
	}
}
