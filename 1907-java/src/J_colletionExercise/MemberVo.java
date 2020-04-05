package J_colletionExercise;

public class MemberVo {
	private String mid;
	private String pwd;
	private String mName;
	private String phone;
	
	public MemberVo(String mid,String pwd,String mName,String phone) {
		this.mid=mid;
		this.pwd=pwd;
		this.mName=mName;
		this.phone=phone;
	}
	@Override
	public String toString() {
		return mid+"\t"+pwd+"\t"+mName+"\t"+phone+"\n";
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
