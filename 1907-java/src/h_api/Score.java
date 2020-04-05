package h_api;

public class Score implements Comparable<Score>{
	int kor;
	Score(String kor){
		this.kor = Integer.parseInt(kor);
	}

	@Override
	public int compareTo(Score o) {//리턴값이 양수일경우에는 자리교환이 이루어진다.
		int r =0;
		if(this.kor>o.kor)      r =1;
		else if(this.kor<o.kor) r=-1;
		else                    r =0;
		return r;
		//return this.kor - o.kor;
	}
	
	@Override
	public String toString() {//있어도되고 없어도되는 작업
		return this.kor+"\n";
	}
}
