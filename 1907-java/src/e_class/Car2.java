package e_class;

public class Car2 {
	int gas;
	
	public void setGas(int gas/*g*/) {//set�� ��Ŭ�������� ������ش�.
		this.gas = gas/*g*/;//�ʵ忡 �Ű������� ���°��� �����Ұ��̴�
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("������ �����ϴ�");
			return false;
		}else {
			System.out.println("������ �ֽ��ϴ�");
			return true;
		}
		
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				System.out.println("������:"+gas);
				gas -=1;
			}else {
				System.out.println("��������");
				return;
			}
		}
		
	}

}
