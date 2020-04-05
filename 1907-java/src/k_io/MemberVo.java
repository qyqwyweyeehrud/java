package k_io;

import java.io.Serializable;

//����ҰŸ�// ������̿��ڿ��ٰ� �������� �����Ұ�����//���������� �ܺθ����� ����
//�����̺��̱⶧���� ������̿��� �������� �����Ҽ� ���⿡ //���������� ������� ���� ��������
public class MemberVo implements Serializable/*����ȭ �����͸������ϰų� �����Ҷ� ����ȭ�������������ʹ� ����ǰų� ���۵����ʴ´�, �߻�޼ҵ�x*/{
	
	//���δٸ� ��ǻ�Ϳ��� ������ �ϴ��� �Ʒ��ǹ�ȣ���� ������ ������ ��ǻ�Ϳ��� �������� ���Ϸ� �ν��Ѵ�
	public static long serialVerssionUID = 1L;//����̴� ������������ǹ� ����������� �Ϸ��� L ���ڸ� �Ȱ����ؾ��Ѵ�
	
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
	}//���ü�̴�,��ü�� ���ٿʹ� �����̴ٸ���.

	
	@Override
	public boolean equals(Object obj) {
		String find = (String)obj;
		boolean result = false;
		if(mid.indexOf(find)>=0 || mName.indexOf(find)>=0 || phone.indexOf(find)>=0) {
				result = true;
			
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
