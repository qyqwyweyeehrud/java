package m_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class EmpInsert {
	
	public EmpInsert() throws Exception{
		Connection conn = DBConn.getConn();
//		String driver ="oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String dbUser ="hr";
//		String dbPwd ="hr";
		
//		Class.forName(driver).newInstance();
//		Connection conn = DriverManager.getConnection(url,dbUser,dbPwd);
		
		String sql = "insert into emp1(employee_id,last_name,hire_date,salary,job_id,email)"+" values(?,?,?,?,?,?)";//문자열더할때 values앞에 스페이스 유의
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 500);
		pstmt.setString(2, "hong");
		pstmt.setString(3, "2020-01-15");
		pstmt.setInt(4, 10000);
		pstmt.setInt(5, 100);
		pstmt.setString(6, "www@naver.com");
		
		conn.setAutoCommit(false);//오토커밋이 수동으로 바뀜 //반드시 사전설정 필수, 데이터잘못입력하면 복구하는게 힘듬
		int cnt = pstmt.executeUpdate();
		if(cnt>0) {
			conn.commit();//정상적으로 저장되면 1리턴 후 커밋
			System.out.println("정상적으로 저장");
		}else {
			conn.rollback();//0리턴후 롤백
			System.out.println("입력중 오류");
		}
		pstmt.close();
		conn.close();//안해주면 오라클에 누수현상이 일어남
	}
	
	
	public static void main(String[] args) throws Exception{
		new EmpInsert();
	}

}
