package J_colletionExercise;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductVo {
	private String serial;
	private String pCode;
	private String pName;
	private int ea;
	private Date nal;
	
	ProductVo(){
		
	}
	ProductVo(String serial,String pCode,String pName,int ea, Date nal){
		this.serial = serial;
		this.pCode = pCode;
		this.pName = pName;
		this.ea = ea;
		this.nal = nal;
	}
	@Override
	public boolean equals(Object obj) {
		boolean b =false;
		if(obj instanceof ProductVo) {
			ProductVo pv = (ProductVo)obj;
			b = serial.indexOf(pv.getSerial())>-1||
				pCode.indexOf(pv.getpCode())>-1||
				pName.indexOf(pv.getpName())>-1;
		}
		return b;
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
	@Override
	public int hashCode() {
		return serial.hashCode();
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		DecimalFormat df = new DecimalFormat("#,###,###");
		String temp = df.format(this.ea);
		String dt = sdf.format(this.nal);
		String temp2 = String.format("%s\t%s\t%s\t%s\t%s\n", this.serial,this.pCode,this.pName,temp,dt);
		return temp2;
	}

}
