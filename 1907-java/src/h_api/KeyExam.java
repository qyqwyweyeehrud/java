package h_api;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		HashMap<Key,String> hashmap = new HashMap<Key,String>();
		//�ؽ����� �Էµ� put ������ put ȣ����get
		hashmap.put(new Key(1), "ȫ�浿");
		hashmap.put(new Key(2), "�赵��");
		hashmap.put(new Key(1), "ȫ�ݸ�");//ȫ�浿�� ������� �������� ���߿� ������ key(1)������ ������
		String a = hashmap.get(new Key(1));//new ������ ���ο�޸𸮿� ����Ǳ⿡ �ؽ��ڵ尪�� �ٸ��� ������
		System.out.println(a);

	}

}
