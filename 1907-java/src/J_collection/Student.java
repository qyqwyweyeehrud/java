package J_collection;

import java.text.MessageFormat;

public class Student {
	int sno;
	String name;
	
	public Student(int sno,String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean r = false;
		if(obj instanceof Student) {//---------------------------------------------------3
			Student std = (Student)obj;//-----------------------------------------------2
			if(sno == std.sno && name.equals(std.name)) {//----------------------------1
				r= true;
			}else {
				r= false;
			}
		}
		return r;
		
	}

	@Override
	public int hashCode() {
		int code = sno + name.hashCode();
		return code;
	}

	@Override
	public String toString() {
		String mf = MessageFormat.format("{0}--{1}",sno,name);
		mf = String.format("%d%s",sno,name);
		return mf;
	}

}
