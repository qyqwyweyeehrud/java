package J_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	//String,Integer
	public void test() {
		Map<String, Integer>map = new HashMap<String,Integer>();
		//데이터 추가
		map.put("hong", 90);
		map.put("lee", 80);
		map.put("park", 50);
		map.put("kim", 70);
		map.put("choi", 40);
		//map의 사이즈 출력
		System.out.println("size:"+ map.size());
		
		//키값으로 vallue출력
		System.out.println(map.get("lee"));
		
		
		//set구조
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();//단순히 키값을가져다가 키값의 이터레이터를만듬 
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key); //map에서 key 에 해당하는 밸류값을 가지고와라
			
			System.out.println(key +":"+value);//set구조라 순서가없음
		}
		System.out.println("------------------------");
		//map.Entry
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter2 = set2.iterator();
		while(iter2.hasNext()) {
			Map.Entry<String, Integer>entry = iter2.next();
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		map.put("choi", 99);
		System.out.println("최씨의 성적이 수정된값:"+map.get("choi"));
		map.remove("choi");
		
		//keyset
		Set<String> set3 = map.keySet();
		Iterator<String> iter3 = set3.iterator();
		while(iter3.hasNext()) {
			String a = iter3.next();
			int b = map.get(a);
			System.out.println(a+":"+b);
		}
		//map.entry
		Set<Map.Entry<String, Integer>> set4 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter4 = set4.iterator();
		while(iter4.hasNext()) {
			Map.Entry<String, Integer> aa = iter4.next();
			System.out.println(aa.getKey()+":"+aa.getValue());
		}
		//map,entry 향상for문
		for(Map.Entry<String, Integer>dd : set4) {
			System.out.println(dd.getKey()+":"+dd.getValue());
		}
		
	}
	//key값의 유형이 Student타입인 경우
	public void test2() {
		Map<Student,String> map = new HashMap<Student , String>();
		//추가
		map.put(new Student(100,"hong"), "010-1111-1111");
		map.put(new Student(200,"kim"), "010-2222-2222");
		map.put(new Student(300,"gang"), "010-3333-3333");
		prn(map);
		//수정
		System.out.println("수정후----------------------");
		map.put(new Student(300,"gang"), "010-3434-3434");
		prn(map);
		//삭제
		System.out.println("삭제후-----------------------");
		map.remove(new Student(300,"gang"));
		prn(map);
	}
	public void prn(Map<Student , String> map) {//조회
		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student key = iter.next();
			String value = map.get(key);
			System.out.println(key + ">>>" + value);
			
		}
	}
	//value값이 Sale타입인경우
	public void test3() {
		Map<Integer , Student> map = new HashMap<Integer,Student>();
		map.put(201901001, new Student(201901001,"홍씨"));
		map.put(201901002, new Student(201901002,"박씨"));
		map.put(201901003, new Student(201901003,"김씨"));
		map.put(201901004, new Student(201901004,"최씨"));
		prn2(map);
		
		//박씨의 이름을 김씨로 수정
		System.out.println("수정후----------------------");
		map.put(201901002, new Student(201901002,"김씨"));
		prn2(map);
		//홍씨를 삭제
		System.out.println("삭제후----------------------");
		map.remove(201901001);
		prn2(map);

	}
	
	public void prn2(Map<Integer,Student> map) {
		Set<Entry<Integer, Student>> set = map.entrySet();
		Iterator<Entry<Integer,Student>> iter = set.iterator();
		while(iter.hasNext()) {
			Entry<Integer, Student> a = iter.next();
			System.out.println(a.getKey()+">>>"+a.getValue());
			
		}
	}
	
	public static void main(String[] args) {
		MapExam exam = new MapExam();
		exam.test();
		exam.test2();
		exam.test3();
	}

}
