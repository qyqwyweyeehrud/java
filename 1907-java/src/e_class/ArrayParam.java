package e_class;

public class ArrayParam {
	ArrayParam(int[] s){ 
		for(int i=0 ; i<s.length ; i++) {
			System.out.println(s[i]);
		}
	}
	
	int arraySum(int[] s) {//==int[]s=abc // int[]s ={1,2,3,4,5}
		int sum = 0;
		for(int i =0;i<s.length;i++) {
			sum += s[i];
		}
		return sum;
	}
	//���޹��� �迭���� �ִ밪�� ���Ͽ� ��������
	int arrayMax(int[] s) {//���ξ��� ���������� ���°Ŷ� ���ڴ� �ü�����. ������ �迭�̶�� �ǹ̸����°��̴�
		int max = s[0];
		for(int i = 1;i<s.length;i++) {
			if(max<s[i]) {
				max = s[i];
			}
		}
		return max;
	}
	//���޹��� �迭���� �ּҰ��� ���Ͽ� ��������
	int arrayMin(int[] s) {
		int min = s[0];
		for(int i=1; i<s.length;i++) {
			if(min>s[i]) {
				min = s[i];
			}
		}
		return min;
	}

	int[] maxMin(int[] s) {//������ 2����������� �迭�λ���
		int[] m= new int[2];
		m[0] =s[0];
		m[1] =s[0];
		for(int i = 1; i<s.length;i++) {
			if(m[0]< s[i]) {
				m[0] = s[i];
			}
			else if(m[1]>s[i]) {
				m[1] = s[i];
			}
		}
		return m;
		/*
		int[] m= new int[2];
		int max =s[0];
		int min =s[0];
		for(int i = 1; i<s.length;i++) {
			if(max< s[i]) {
				max = s[i];
			}
			else if(m[1]>s[i]) {
				min = s[i];
			}
		}
		m = new int[] {max,min};
		return m;
		*/
		}
	
	public static void main(String[] args) {
		int [] abc = {-13,1242,73,44,5,36,77,-8,129,110};
		ArrayParam ap1 = new ArrayParam(abc);
		int hap = ap1.arraySum(abc);//abc�� return�Ȱ��� hap�� �����ϰڴ�.
		System.out.println(hap);
		int max = ap1.arrayMax(abc);
		System.out.println(max);
		int min = ap1.arrayMin(abc);
		System.out.println(min);
		int[] r= ap1.maxMin(abc);
		System.out.println("�ִ밪 r[0]:"+r[0]);
		System.out.println("�ּҰ� r[0]:"+r[1]);

		


	}

}
