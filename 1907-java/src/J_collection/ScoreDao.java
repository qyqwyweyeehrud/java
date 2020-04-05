package J_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import java.util.*;//자바유틸안에 모든패키지를 임포트해달라

public class ScoreDao {//실무에서는 보통 클래스말고 인터페이스로 만들어서 제공해주면
						//인터페이스를 상속받아서 재정의후에 사용하면된다.
	Map<String , List<ScoreVo>> map;
	
	public ScoreDao(Map<String , List<ScoreVo>> map) {
		this.map = map;
	}
	
	public boolean insert(ScoreVo vo) {
		boolean b =true;
		try {
		String key = vo.getSno();
		if(map.containsKey(key)){
			List<ScoreVo> list = map.get(key);//기존데이터를 담음
			list.add(vo);
		}else {//key가 없는경우,학생이 없는경우
			List<ScoreVo> list = new ArrayList<ScoreVo>();//새로운 데이터를 담음
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
