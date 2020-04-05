package e_class;

public class Account1 {
	void deposit(int amt) {
		Bank.amount +=amt;
		prn();
	}
	void withdraw(int amt) {
		Bank.amount -=amt;
	}
	void prn() {
		System.out.println("ภÜพื:"+Bank.amount);
	}

}
