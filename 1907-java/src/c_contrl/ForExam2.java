/*----------------------
 * ������ ���
 * �赵��
 * 2019.12.02
 -----------------------*/
package c_contrl;

public class ForExam2 {
	ForExam2() {
		for (int m = 2; m < 10; m++) {
			System.out.println("---" + m + "��" + "---");
			for (int i = 1; i < 10; i++) {
				System.out.println(m + "x" + i + "=" + (m * i));
			}
		}
	}

}
