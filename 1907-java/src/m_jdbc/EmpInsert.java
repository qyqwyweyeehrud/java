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
		
		String sql = "insert into emp1(employee_id,last_name,hire_date,salary,job_id,email)"+" values(?,?,?,?,?,?)";//���ڿ����Ҷ� values�տ� �����̽� ����
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 500);
		pstmt.setString(2, "hong");
		pstmt.setString(3, "2020-01-15");
		pstmt.setInt(4, 10000);
		pstmt.setInt(5, 100);
		pstmt.setString(6, "www@naver.com");
		
		conn.setAutoCommit(false);//����Ŀ���� �������� �ٲ� //�ݵ�� �������� �ʼ�, �������߸��Է��ϸ� �����ϴ°� ����
		int cnt = pstmt.executeUpdate();
		if(cnt>0) {
			conn.commit();//���������� ����Ǹ� 1���� �� Ŀ��
			System.out.println("���������� ����");
		}else {
			conn.rollback();//0������ �ѹ�
			System.out.println("�Է��� ����");
		}
		pstmt.close();
		conn.close();//�����ָ� ����Ŭ�� ���������� �Ͼ
	}
	
	
	public static void main(String[] args) throws Exception{
		new EmpInsert();
	}

}
