package e_class;

public class StaticExam {

	public static void main(String[] args) {
		Account1 p = new Account1();
		p.prn();
		p.withdraw(500);
		
		Account1 m = new Account1();
		m.prn();
		m.withdraw(1000);
		
		p.prn();
		
		Account1 d = new Account1();
		d.prn();
		d.deposit(5000);
		
		p.prn();
	

	}

}
