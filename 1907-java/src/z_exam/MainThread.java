package z_exam;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("���� ������ ����..");
		SubThread st = new SubThread();//st�� �����̺��� ��ӹ޾ұ⶧���� ��ŸƮ���ȵȴ�
		Thread t = new Thread(st);
		try {
			t.start();
			t.join();//���ν����尡 �Ͻ��������·� ��ٷȴٰ� ���꽺������ ����Ǹ鼭 ���ν����尡 �������� ����ȴ�
		}catch(Exception ex) {
		}
		System.out.println("���ν����� ����");
	}
}
