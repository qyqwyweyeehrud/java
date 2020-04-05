package e_class;

public class Car2 {
	int gas;
	
	public void setGas(int gas/*g*/) {//set은 이클립스에서 재공해준다.
		this.gas = gas/*g*/;//필드에 매개변수로 들어온값을 저장할것이다
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다");
			return false;
		}else {
			System.out.println("가스가 있습니다");
			return true;
		}
		
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				System.out.println("가스량:"+gas);
				gas -=1;
			}else {
				System.out.println("가스없음");
				return;
			}
		}
		
	}

}
