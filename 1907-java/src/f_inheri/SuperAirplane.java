package f_inheri;

public class SuperAirplane extends Airplane {
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode = NORMAL;
	
	public SuperAirplane() {
		super(3);//�����ڽ����� �һ� ù��°��//�θ���();��� �� �Ű������� ���� �����ڸ� ȣ��

		//super();��� �������ʾҴµ� �Ϲݺ���Ⱑ �ߴ������� extends Airplane����
		System.out.println("�����Ӻ����");
	}
	
	@Override//�ظ޼ҵ尡 ��Ȯ�� ������ �Ǿ����� üũ���ش�
	public void fly() {//�θ� �ۺ��̸� �ڽĵ� �ۺ�
		if(flyMode == NORMAL) {
			super.fly();
		}else {
			System.out.println("�����Ӻ���");
		}
	}

}
