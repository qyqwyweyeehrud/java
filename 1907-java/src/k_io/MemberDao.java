package k_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	String fileName = "member.dat";
	
	public List<MemberVo> search(MemberSearch ms){
		List<MemberVo> list = new ArrayList<MemberVo>();
		//member.dat���ִ� �ڷ���� �о� list�� �߰��� �� ��ȯ
		
		try {
			InputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);
			String find = ms.getFindstr().getText();
			
			List<MemberVo>temp = (List)ois.readObject();
			for(MemberVo vo : temp) {
				if(vo.equals(find)) {
				list.add(vo);
				}
			}
		}catch(Exception e) {
			list = null;
		}
		
		return list;
	}
	
	public boolean insert(MemberVo vo) {
		boolean b =true;
		
		//������ ������ �о �޸𸮿� ����
		//�Ű������� �Էµ� vo�� �޸𸮿� �߰�
		//�ش系���� �ٽ� ���Ͽ�����
		try {
			InputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);
			List<MemberVo> list = (List)ois.readObject();
			list.add(vo);//�Ű������� �Էµ� vo�� �޸𸮿� �߰�
			ois.close();
			is.close();
			
			OutputStream os = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(list);
			oos.flush();
			oos.close();
			os.close();
			
		}catch(Exception e){
			b = false;
		}finally {//���̳θ��� ������ �����
			return b;
		}
	}
	
	public MemberVo search(String findMid) {
		MemberVo vo = null;
		List<MemberVo> list;
		
		try {
			InputStream is = new FileInputStream(fileName);//����ȭ�� ����
			ObjectInputStream ois = new ObjectInputStream(is);
			list = (List)ois.readObject();
			for(MemberVo v : list) {
				if(v.getMid().equals(findMid)) {
					vo = v;
					break;
				}
			}
			ois.close();
			is.close();
			
		}catch(Exception e) {
			vo = null;
			e.printStackTrace();
		}finally {
			return vo;
		}
	}
	
	public boolean modify(MemberVo vo) {
		boolean b = true;
		try {
			int index = -1;
			InputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);
			List<MemberVo> list = (List)ois.readObject();
			for(int i = 0; i<list.size() ; i++) {
				MemberVo v = list.get(i);
				if(v.getMid().equals(vo.getMid())) {
					list.set(i, vo);
					index = i;
					break;
				}
			}
			ois.close();
			is.close();
			if(index == -1) {
				b =false;
			}else {
				OutputStream os = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(list);
				oos.flush();
				oos.close();
				os.close();
			}
			
		}catch(Exception ex) {
			b = false;
			ex.printStackTrace();
			
		}finally {
			return b;
		}
	}
	
	public boolean delete(String mId) {
		boolean b =true;
		try {
			int index = -1;
			InputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);
			List<MemberVo> list = (List)ois.readObject();
			for(int i = 0;i <list.size();i++) {
				MemberVo v = list.get(i);
				if(v.getMid().equals(mId)) {
					index = i;
					list.remove(index);
				}
			}
			ois.close();
			is.close();
			
			if(index >=0) {
				OutputStream os = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(list);
				oos.flush();
				oos.close();
				os.close();
			}else {
				b =false;
			}
		}catch(Exception ex) {
			b= false;
			ex.printStackTrace();
		}finally {
			return b;
		}
	}

}
