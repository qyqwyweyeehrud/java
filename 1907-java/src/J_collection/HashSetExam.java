package J_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	
	
	public static void main(String[] args) {
		Set <String> set = new HashSet<String>();//����ȭ�Ҷ� ��������= �ڽİ�ü�� �߰��� ���(�ʵ� �޼ҵ�)�� ����Ҽ� ����
												//����ϰ�ʹٸ� ĳ������ �ʿ��ϴ�
		set.add("java");//1
		set.add("JDBC");//2
		set.add("servlet/JSP");//3
		set.add("java");//4
		set.add("JAVA");//5//��ҹ��ڸ� �����Ѵ�."A".equals("a") == false�̱⶧����
		set.add("mtBatis");//6 set�� ������� ����������
		
		System.out.println("set�� ������:" +set.size());
		
		Iterator <String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		for(String temp : set) {
			System.out.println(temp);
		}
		
		set.remove("java");
		set.remove("mtBatis");
		
		System.out.println("set�� ����:"+set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		set.clear();
		
		if(set.isEmpty()) {System.out.println("�������");
		}
		
	
		//------------------------------------------------------------------------------
		Set<MemberVo> memberset = new HashSet<MemberVo>();
		memberset.add(new MemberVo("a001","1111","hong","010-1234"));
		memberset.add(new MemberVo("a002","1111","hong","010-1234"));
		memberset.add(new MemberVo("a002","1111","hong","010-0000"));
		
		memberset.add(new MemberVo("a002","2222","kim","010-1234"));
		memberset.add(new MemberVo("a002","1111","hong","010-0000"));//�ؽ��ڵ������ ������ �̾��̿� �Ȱ��� �����͸� ã�������ϸ� ã�����Ѵ�
		System.out.println("���set�� ������:"+memberset.size());//���̵�� ����ȣ�� �Ȱ��⶧���� ������� �ʾҴ�.
		
		Iterator<MemberVo> iter2 = memberset.iterator();
		while(iter2.hasNext()) {
			MemberVo vo = iter2.next();
			System.out.print(vo);
		}
		System.out.println("--------------------------------");
		
		MemberVo delvo = new MemberVo("a002","1111","hong","010-1234");
		memberset.remove(delvo);
		
		for(MemberVo vo : memberset) {
			System.out.print(vo);
		}
		
		
		
		
		
		
	}
}
