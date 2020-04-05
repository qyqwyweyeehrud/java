package homwork;

public class BoardVo {
	int no;			//게시물번호
	String suject;	//제목
	String mId;		//작성자 아이디
	String mDate;	//잘성날짜
	int cnt;		//조회수
	
	BoardVo(int no,String suject,String mId, String mDate,int cnt){
		this.no = no;
		this.suject = suject;
		this.mId = mId;
		this.mDate = mDate;
		this.cnt = cnt;
	}
	
	BoardVo(int cnt){
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "게시물번호(" + no + "\t)제목(" + suject + "\t)작성자아이디("+ mId + "\t)작성날짜(" + mDate +"\t)조회수(" + cnt+")";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSuject() {
		return suject;
	}

	public void setSuject(String suject) {
		this.suject = suject;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmDate() {
		return mDate;
	}

	public void setmDate(String mDate) {
		this.mDate = mDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	


}
