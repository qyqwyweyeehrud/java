package k_io;

import java.io.Serializable;

//어센딩할거면// 멤버브이오뒤에다가 컴페어러블을 구현할것인지//멤버컴페어라는 외부를만들어서 쓸지
//프라이빗이기때문에 멤버브이오에 컴페어러블을 구현할수 없기에 //정렬을위한 멤버컴페어를 따로 만들어야함
public class MemberVo implements Serializable/*직렬화 데이터를저장하거나 전송할때 직렬화하지않은데이터는 저장되거나 전송되지않는다, 추상메소드x*/{
	
	//서로다른 컴퓨터에서 컴파일 하더라도 아래의번호값이 같으면 동일한 컴퓨터에서 컴파일한 파일로 인식한다
	public static long serialVerssionUID = 1L;//상수이다 정적변수라는의미 데이터통신을 하려면 L 숫자를 똑같이해야한다
	
	private String mid;//멤버브이오가 가지고있는 특성 4가지
	private String pwd;//프라이빗이라MembweVo v =new MembwerVo(); v.mid 로 접근을 못하기때문에 세터게터로 접근해야함
	private String mName;
	private String phone;
	//생성자를통해
	//setter를 통해// 해시코드와 이콜즈를 재정의 해서 전달해줘야함
	//또다른 매소드를 통해 받을것인지 정하면된다
	//투스트링 하든말든 마음대로
	public MemberVo(String mid,String pwd,String mName,String phone){
		this.mid = mid;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;
	}
	//동등객체이다 동등객체가아니라라고 판별하기위해 해시코드와 이퀄즈 재정의
	
	@Override
	public int hashCode() {//해시코드도 같고 이퀄즈도 같다면 동등객체이다 라고 생각하도록 작업할것임
		return mid.hashCode() +phone.hashCode();//정수형
	}//동등객체이다,객체가 같다와는 개념이다르다.

	
	@Override
	public boolean equals(Object obj) {
		String find = (String)obj;
		boolean result = false;
		if(mid.indexOf(find)>=0 || mName.indexOf(find)>=0 || phone.indexOf(find)>=0) {
				result = true;
			
		}
		return result;		
	}
	
	@Override
	public String toString() {//이 객체를찍을때 어떤 포맷으로 찍혀질것인지에대한
		return mid +"\t" + pwd +"\t" + mName +"\t" + phone + "\n";
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
