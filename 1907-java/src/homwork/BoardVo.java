package homwork;

public class BoardVo {
	int no;			//�Խù���ȣ
	String suject;	//����
	String mId;		//�ۼ��� ���̵�
	String mDate;	//�߼���¥
	int cnt;		//��ȸ��
	
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
		return "�Խù���ȣ(" + no + "\t)����(" + suject + "\t)�ۼ��ھ��̵�("+ mId + "\t)�ۼ���¥(" + mDate +"\t)��ȸ��(" + cnt+")";
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
