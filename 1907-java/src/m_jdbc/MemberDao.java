package m_jdbc;
//sql이나 입력수정삭제조회는 여기다 하겟어

import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDao {
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public MemberDao() {
		conn = DBConn.getConn();
	}
	public int delete(String mId) {
		int r = 0;
		try {
			String sql = "delete from member where mId=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mId);
			conn.setAutoCommit(false);
			r = ps.executeUpdate();
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			ps.close();
			conn.close();
		}catch(Exception ex) {
			
		}
		return r;
	}
	
	public int insert(MemberVo vo ) {
		int r = 0;
		try {
			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getmId());
			ps.setString(2, vo.getmName());
			ps.setString(3, sdf.format(vo.getrDate()));
			ps.setInt(4, vo.getGrade());
			
			conn.setAutoCommit(false);
			r = ps.executeUpdate();
			
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
			ps.close();
			conn.close();
		}catch(Exception ex) {
			
		}
		
		return r;
	}
	
	public int update(MemberVo vo) {//검색후 정보를 뿌려줄 메소드
		int r= 0;
		try {
			String sql = "update member set pWd =? , rDate = ? , grade = ? where mId=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getmName());
			ps.setString(2, sdf.format(vo.getrDate()));
			ps.setInt(3, vo.getGrade());
			ps.setString(4, vo.getmId());
			
			r= ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		}catch(Exception e) {
			
		}finally {
			return r;
		}
	}
	
	public MemberVo search(String mId) {//검색후 아이디와 일치하는지, 일치하면 vo에 담기위한 메서드
		MemberVo vo = new MemberVo();
		String sql = "select * from member where mId=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setmId(rs.getString("mId"));
				vo.setmName(rs.getString("pWd"));
				vo.setrDate(rs.getDate("rDate"));
				vo.setGrade(rs.getInt("grade"));
			}
			
		}catch(Exception ex) {
			
		}finally {
			return vo;
		}
		
	}
	
	
	public List<MemberVo> select(String find){
		List<MemberVo> list = new ArrayList<MemberVo>();
		
		String sql = "select * from member where mId like ? or pWd like ?";
		try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "%"+find+"%");
		ps.setString(2, "%"+find+"%");
		ResultSet rs = ps.executeQuery();//결과치 가져옴
		while(rs.next()) {
			String mid = rs.getString("mId");
			String mName = rs.getString("pWd");
			Date rDate = rs.getDate("rDate");
			int grade = rs.getInt("grade");
			
			MemberVo vo = new MemberVo(mid,mName,rDate,grade);
			list.add(vo);
		}
		
		rs.close();
		ps.close();
		conn.close();
		}catch(Exception ex) {
			
		}finally {
			
			return list;
		}
		
	}

}
