package m_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class EmpList {

	public EmpList() throws Exception{
		Connection conn = DBConn.getConn();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String dbUser = "hr";
//		String dbPwd = "hr";
		
//		Class.forName(driver).newInstance(); // 1 //해도그만 안해도그만 기존에만들어진놈이 새롭게 갱신되서 가비지콜렉션이 실행되면 기존놈은 사라지고 가콜 실행안되면 메모리에 남아있고
//		Connection conn = DriverManager.getConnection(url,dbUser,dbPwd);// 2 //코넥션은 인터페이스/ 반환타입은 코넥션객체/스태틱타입 객체생성하지않고 드라이버매니저가 가지고있는 정적메소드인
	
		String sql = "select * from employees where to_char(hire_date,'rrrr') = ?";// 3 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "2007");
		ResultSet rs = pstmt.executeQuery();//오라클기준으로 생각한다면 for rs in () query loop end lopp;로 쓴거랑 같은것이다
		while(rs.next()) {//반복할수있는 문장을 써줘야하기때문에 while
			String eName = rs.getString("first_name");//컬럼명
			int sal = rs.getInt("salary");
			Date nal = rs.getDate("hire_date");
			
			System.out.println("성명:"+ eName);
			System.out.println("급여:"+ sal);
			System.out.println("날짜:"+ nal.toLocaleString());
			System.out.println("---------------------------");
		}
		pstmt.close();
		conn.close();//안해주면 오라클에 누수현상이 일어남
	}
	
	public static void main(String[] args) throws Exception{
		new EmpList();
	}

}
