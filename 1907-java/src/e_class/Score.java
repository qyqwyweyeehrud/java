package e_class;

public class Score {
	private String irum;
	private int kor;
	private int eng;
	private boolean pass;
	private char grade;
	private int[] level;
	private Score score;//Vo(Value Object) Ư���� ���������� �����͸� �������ִٴ� �ǹ̷� Vo�� ����//���̻�
	
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
	public void setGrade(char grade) {//char �� �ƴ� �ٸ� ������ �������� int�� String�� �����ϰų� �߰���Ű�� �ڵ�ȭ ��� ���, ������ ��ȯ���� ������  void,�Ű������� ������ �ϳ�,�ʵ�� ������ �ݵ�� ���ƾ��Ѵ�
		this.grade = grade;
	}
	public String getIrum() {//����������°��̱⿡ �������־���� get���� �ʵ��� �̸� ù�� �빮��
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
	public boolean isPass() {//get�� is��
		return pass;
	}
	public void setPass(boolean pass) {//������ ���� ����
		this.pass = pass;
	}
	
	

}
