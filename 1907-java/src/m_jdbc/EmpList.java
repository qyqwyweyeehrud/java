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
		
//		Class.forName(driver).newInstance(); // 1 //�ص��׸� ���ص��׸� ����������������� ���Ӱ� ���ŵǼ� �������ݷ����� ����Ǹ� �������� ������� ���� ����ȵǸ� �޸𸮿� �����ְ�
//		Connection conn = DriverManager.getConnection(url,dbUser,dbPwd);// 2 //�ڳؼ��� �������̽�/ ��ȯŸ���� �ڳؼǰ�ü/����ƽŸ�� ��ü���������ʰ� ����̹��Ŵ����� �������ִ� �����޼ҵ���
	
		String sql = "select * from employees where to_char(hire_date,'rrrr') = ?";// 3 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "2007");
		ResultSet rs = pstmt.executeQuery();//����Ŭ�������� �����Ѵٸ� for rs in () query loop end lopp;�� ���Ŷ� �������̴�
		while(rs.next()) {//�ݺ��Ҽ��ִ� ������ ������ϱ⶧���� while
			String eName = rs.getString("first_name");//�÷���
			int sal = rs.getInt("salary");
			Date nal = rs.getDate("hire_date");
			
			System.out.println("����:"+ eName);
			System.out.println("�޿�:"+ sal);
			System.out.println("��¥:"+ nal.toLocaleString());
			System.out.println("---------------------------");
		}
		pstmt.close();
		conn.close();//�����ָ� ����Ŭ�� ���������� �Ͼ
	}
	
	public static void main(String[] args) throws Exception{
		new EmpList();
	}

}
