package h_api2;

public class Student {
	public int sno;
	public String name;
	public int score;
	
	Student(int sno){
		this.sno = sno;
	}


	Student(int sno,String name,int score){
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return sno + "-" + name +"-" + score;
	}

}
