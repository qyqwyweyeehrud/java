package J_collection;
//����ҰŸ�// ������̿��ڿ��ٰ� �������� �����Ұ�����//���������� �ܺθ����� ����
//�����̺��̱⶧���� ������̿��� �������� �����Ҽ� ���⿡ //���������� ������� ���� ��������
public class MemberVo {
	private String mid;//������̿��� �������ִ� Ư�� 4����
	private String pwd;//�����̺��̶�MembweVo v =new MembwerVo(); v.mid �� ������ ���ϱ⶧���� ���Ͱ��ͷ� �����ؾ���
	private String mName;
	private String phone;
	//�����ڸ�����
	//setter�� ����// �ؽ��ڵ�� ����� ������ �ؼ� �����������
	//�Ǵٸ� �żҵ带 ���� ���������� ���ϸ�ȴ�
	//����Ʈ�� �ϵ縻�� �������
	public MemberVo(String mid,String pwd,String mName,String phone){
		this.mid = mid;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;
	}
	//���ü�̴� ���ü���ƴ϶��� �Ǻ��ϱ����� �ؽ��ڵ�� ������ ������
	
	@Override
	public int hashCode() {//�ؽ��ڵ嵵 ���� ����� ���ٸ� ���ü�̴� ��� �����ϵ��� �۾��Ұ���
		return mid.hashCode() +phone.hashCode();//������
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof MemberVo) {
			MemberVo vo = (MemberVo)obj;
			if(vo.getMid().equals(mid)&&vo.getPhone().equals(phone)) {
				result = true;
			}
		}
		return result;		
	}
	
	@Override
	public String toString() {//�� ��ü�������� � �������� ������������������
		return mid +"\t" + pwd +"\t" + mName +"\t" + phone + "\n";
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
