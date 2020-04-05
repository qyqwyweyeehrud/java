package J_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	
	
	public static void main(String[] args) {
		Set <String> set = new HashSet<String>();//다형화할때 주의할점= 자식개체에 추가된 멤버(필드 메소드)는 사용할수 없다
												//사용하고싶다면 캐스팅이 필요하다
		set.add("java");//1
		set.add("JDBC");//2
		set.add("servlet/JSP");//3
		set.add("java");//4
		set.add("JAVA");//5//대소문자를 구별한다."A".equals("a") == false이기때문에
		set.add("mtBatis");//6 set은 집어넣은 순서가없다
		
		System.out.println("set의 사이즈:" +set.size());
		
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
		
		System.out.println("set의 갯수:"+set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		set.clear();
		
		if(set.isEmpty()) {System.out.println("비어있음");
		}
		
	
		//------------------------------------------------------------------------------
		Set<MemberVo> memberset = new HashSet<MemberVo>();
		memberset.add(new MemberVo("a001","1111","hong","010-1234"));
		memberset.add(new MemberVo("a002","1111","hong","010-1234"));
		memberset.add(new MemberVo("a002","1111","hong","010-0000"));
		
		memberset.add(new MemberVo("a002","2222","kim","010-1234"));
		memberset.add(new MemberVo("a002","1111","hong","010-0000"));//해시코드이퀄즈가 없을때 이아이와 똑같은 데이터를 찾으려고하면 찾지못한다
		System.out.println("멤버set의 사이즈:"+memberset.size());//아이디와 폰번호가 똑같기때문에 저장되지 않았다.
		
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
