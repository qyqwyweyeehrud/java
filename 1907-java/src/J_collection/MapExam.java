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
		//������ �߰�
		map.put("hong", 90);
		map.put("lee", 80);
		map.put("park", 50);
		map.put("kim", 70);
		map.put("choi", 40);
		//map�� ������ ���
		System.out.println("size:"+ map.size());
		
		//Ű������ vallue���
		System.out.println(map.get("lee"));
		
		
		//set����
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();//�ܼ��� Ű���������ٰ� Ű���� ���ͷ����͸����� 
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key); //map���� key �� �ش��ϴ� ������� ������Ͷ�
			
			System.out.println(key +":"+value);//set������ ����������
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
		System.out.println("�־��� ������ �����Ȱ�:"+map.get("choi"));
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
		//map,entry ���for��
		for(Map.Entry<String, Integer>dd : set4) {
			System.out.println(dd.getKey()+":"+dd.getValue());
		}
		
	}
	//key���� ������ StudentŸ���� ���
	public void test2() {
		Map<Student,String> map = new HashMap<Student , String>();
		//�߰�
		map.put(new Student(100,"hong"), "010-1111-1111");
		map.put(new Student(200,"kim"), "010-2222-2222");
		map.put(new Student(300,"gang"), "010-3333-3333");
		prn(map);
		//����
		System.out.println("������----------------------");
		map.put(new Student(300,"gang"), "010-3434-3434");
		prn(map);
		//����
		System.out.println("������-----------------------");
		map.remove(new Student(300,"gang"));
		prn(map);
	}
	public void prn(Map<Student , String> map) {//��ȸ
		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student key = iter.next();
			String value = map.get(key);
			System.out.println(key + ">>>" + value);
			
		}
	}
	//value���� SaleŸ���ΰ��
	public void test3() {
		Map<Integer , Student> map = new HashMap<Integer,Student>();
		map.put(201901001, new Student(201901001,"ȫ��"));
		map.put(201901002, new Student(201901002,"�ھ�"));
		map.put(201901003, new Student(201901003,"�达"));
		map.put(201901004, new Student(201901004,"�־�"));
		prn2(map);
		
		//�ھ��� �̸��� �达�� ����
		System.out.println("������----------------------");
		map.put(201901002, new Student(201901002,"�达"));
		prn2(map);
		//ȫ���� ����
		System.out.println("������----------------------");
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
