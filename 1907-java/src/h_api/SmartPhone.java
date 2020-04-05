package h_api;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String c,String os) {
		this.company = c;
		this.os = os;
	}
	@Override
	public String toString() {
		//return super.toString();//Object 의 toString()
		return company + "," +os;
	}
	
	public static void main(String[] args) {
		SmartPhone st = new SmartPhone("구글","안드로이드");
		
		System.out.println(st);
		System.out.println(st.toString());
	}

}
