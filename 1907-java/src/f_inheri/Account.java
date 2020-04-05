package f_inheri;

public class Account {//이 세개만 기억하는 Value object //Vo 값만저장되있는 클래스
	private String mName;
	private String sNo;
	private long amount;
	
	public Account(String n,String no,long amt) {
		this.mName = n;
		this.sNo = no;
		this.amount = amt;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	

}
