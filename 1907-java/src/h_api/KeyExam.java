package h_api;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		HashMap<Key,String> hashmap = new HashMap<Key,String>();
		//해쉬맵은 입력도 put 수정도 put 호출은get
		hashmap.put(new Key(1), "홍길동");
		hashmap.put(new Key(2), "김도경");
		hashmap.put(new Key(1), "홍금매");//홍길동은 사라지고 벨류값이 나중에 설정된 key(1)로인해 수정됨
		String a = hashmap.get(new Key(1));//new 를쓰면 새로운메모리에 저장되기에 해시코드값이 다르게 만들어낸다
		System.out.println(a);

	}

}
