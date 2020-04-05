package J_collection;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductVo{
	private String serial;//yyyy-Mm-dd-serial형태로 저장할것임
	private String pCode;//제품코드
	private String pName;//제품명
	private int ea;//수량
	private Date nal;//입고,출고일자
	
	public ProductVo() {//나중에 불러올때 매개변수5개 다불러오기 귀찮기때문에 생성
		
	}
	
	public ProductVo(String serial,String pCode,String pName,int ea,Date nal) {
		this.serial = serial;
		this.pCode = pCode;
		this.pName = pName;
		this.ea = ea;
		this.nal = nal;
	}
	
	@Override
	public int hashCode() {
		return this.serial.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
			if(obj instanceof ProductVo) {//obj가 ProductVo라는 클래스 로부터 만들어져있다면
				ProductVo pv= (ProductVo)obj;
				//result = pv.getSerial().equals(this.serial) ||
				//		pv.getpCode().equals(this.pCode) ||
				//		pv.getpName().equals(this.pName);
				result = serial.indexOf(pv.getSerial()) >-1 ||//abcd (this) ab(obj) 에비씨디중에 에비가 같은게있냐 있으면 1 
						 pCode.indexOf(pv.getpCode()) >-1 ||
						 pName.indexOf(pv.getpName()) >-1;
				}
		return result;
	}
		
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,###");
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd(E)");
		
		String tempEa = df.format(this.ea);
		String tempDate = sd.format(this.nal);
		
		
		String temp = String.format("%s\t%s\t%s\t%s\t%s\n",this.serial,this.pCode,this.pName,tempEa,tempDate);
		
		return temp;
	}
	
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public Date getNal() {
		return nal;
	}
	public void setNal(Date nal) {
		this.nal = nal;
	}
}
