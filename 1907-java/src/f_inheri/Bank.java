package f_inheri;

public class Bank {
	static Account[] ac;
	static int count;//고객수
	
	static{
		ac = new Account[100];
		Account a = new Account("hong","111-111",5000);
		ac[0] = a;
		
		a = new Account("kim","222-222",10000);
		ac[1] = a;
		
		a = new Account("park","333-333",500000);
		ac[2] = a;
		count = 3;//생성자에서 0으로 셋팅해도 두번째는 초기화가 되지않는다.
	}
	

}
