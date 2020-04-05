package e_class;

public class Score {
	private String irum;
	private int kor;
	private int eng;
	private boolean pass;
	private char grade;
	private int[] level;
	private Score score;//Vo(Value Object) 특별한 뭔가가없고 데이터만 가지고있다는 의미로 Vo를 붙힘//접미사
	
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public int[] getLevel() {
		return level;
	}
	public void setLevel(int[] level) {
		this.level = level;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {//char 가 아닌 다른 값으로 받으려고 int나 String로 수정하거나 추가시키면 자동화 기능 상실, 세터의 반환형은 무조건  void,매개변수는 무조건 하나,필드와 유형과 반드시 같아야한다
		this.grade = grade;
	}
	public String getIrum() {//값을끄집어내는것이기에 리턴이있어야함 get다음 필드의 이름 첫을 대문자
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getKor() {
		if(true) {
			return kor;
			
		}else {return -1000;
		}
	}
	public void setKor(int kor) {
		if(kor>=0&&kor<=100) {
			this.kor = kor;
		}
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public boolean isPass() {//get은 is로
		return pass;
	}
	public void setPass(boolean pass) {//볼린의 셋은 같음
		this.pass = pass;
	}
	
	

}
