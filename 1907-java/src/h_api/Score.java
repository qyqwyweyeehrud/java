package h_api;

public class Score implements Comparable<Score>{
	int kor;
	Score(String kor){
		this.kor = Integer.parseInt(kor);
	}

	@Override
	public int compareTo(Score o) {//���ϰ��� ����ϰ�쿡�� �ڸ���ȯ�� �̷������.
		int r =0;
		if(this.kor>o.kor)      r =1;
		else if(this.kor<o.kor) r=-1;
		else                    r =0;
		return r;
		//return this.kor - o.kor;
	}
	
	@Override
	public String toString() {//�־�ǰ� ����Ǵ� �۾�
		return this.kor+"\n";
	}
}
