package J_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import java.util.*;//�ڹ���ƿ�ȿ� �����Ű���� ����Ʈ�ش޶�

public class ScoreDao {//�ǹ������� ���� Ŭ�������� �������̽��� ���� �������ָ�
						//�������̽��� ��ӹ޾Ƽ� �������Ŀ� ����ϸ�ȴ�.
	Map<String , List<ScoreVo>> map;
	
	public ScoreDao(Map<String , List<ScoreVo>> map) {
		this.map = map;
	}
	
	public boolean insert(ScoreVo vo) {
		boolean b =true;
		try {
		String key = vo.getSno();
		if(map.containsKey(key)){
			List<ScoreVo> list = map.get(key);//���������͸� ����
			list.add(vo);
		}else {//key�� ���°��,�л��� ���°��
			List<ScoreVo> list = new ArrayList<ScoreVo>();//���ο� �����͸� ����
			list.add(vo);
			
			map.put(key, list);
		}
		}catch(Exception e) {
			b = false;
		}
		return b;
	}
	public boolean update(String key,int index ,ScoreVo vo) {
		boolean b = true;
		
		try {
			List<ScoreVo> list = map.get(key);
			list.set(index, vo);
		}catch(Exception ex) {
			b = false;
		}
		return b;
	}
	public boolean delete(String sno,int index) {
		boolean b = true;
		
		try {
			List<ScoreVo> list = map.get(sno);
			list.remove(index);
		}catch(Exception ex) {
			b = false;
		}
		return b;
	}
	public Map<String,List<ScoreVo>> list(String findstr) {
		Map<String,List<ScoreVo>> newMap = new HashMap<String, List<ScoreVo>>();
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.indexOf(findstr)>=0) {
				newMap.put(key, map.get(key));
			}
		}
		
		return newMap;
	}

}
