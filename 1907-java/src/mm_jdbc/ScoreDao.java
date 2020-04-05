package mm_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ScoreDao {
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public ScoreDao() {
		conn = DBConn.getConn();
	}
	public int insert(ScoreVo vo) {
		int r =0;
		try {
			String sql = "insert into score values(seq_score.nextval,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getmId());
			ps.setString(2, sdf.format(vo.getrDate()));
			ps.setString(3, vo.getSubject());
			ps.setInt(4, vo.getScore());
			
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
			
		}finally {
			return r;			
		}
	}
	public int delete(int serial) {
		int r = 0;
		try {
			String sql = "delete from score where serial=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, serial);
			
			conn.setAutoCommit(false);
			r = ps.executeUpdate();//dml (insert,update , delete)
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			//클로즈하면 안됨, 한 화면에서 조회도 해야하고 삭제도 해야하기때문에
		}catch(Exception ex) {
			
		}finally {
			return r;			
		}
	}
	public ScoreVo search(int serial) {
		ScoreVo vo = new ScoreVo();
		try {
		String sql = "select S.serial, S.mId, S.rDate, S.subject, S.score ,M.pwd from score S join member M on S.mId = M.mId where S.serial = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, serial);
		
		ResultSet rs = ps.executeQuery();
		System.out.println("wdw");
		if(rs.next()) {
			vo.setmId(rs.getString("mId"));
			vo.setrDate(rs.getDate("rDate"));
			vo.setSubject(rs.getString("subject"));
			vo.setScore(rs.getInt("score"));
			vo.setmName(rs.getString("pwd"));
		}
		
		
		}catch(Exception ex) {
		ex.printStackTrace();
		}finally {
			return vo;
		}
	}
	public int update(ScoreVo vo) {
		int r = 0;
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		String sql = "update score set  rdate = ?, subject = ?, score =? where serial = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, sdf.format(vo.getrDate()));
		ps.setString(2, vo.getSubject());
		ps.setInt(3, vo.getScore());
		ps.setInt(4, vo.getSerial());
		
		
		conn.setAutoCommit(false);
		
		r = ps.executeUpdate();
		if(r>0) {
			conn.commit();
		}else {
			conn.rollback();
		}
		//여기서 클로즈 하면안된다
		}catch(Exception ex){
			
		}finally {
			return r;			
		}
	}
	public List<ScoreVo> select(String find){
		List<ScoreVo> list = new ArrayList<ScoreVo>();
		try {
		String sql = "select S.serial , M.mid , M.pwd , S.rDate , S.subject , S.score  from member M left outer join score S on M.mid = S.mid where M.mid like ? or M.pwd like ? or S.subject like ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "%"+find+"%");
		ps.setString(2, "%"+find+"%");
		ps.setString(3, "%"+find+"%");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int a = rs.getInt("serial");
			String b =rs.getString("mid");
			String c =rs.getString("pwd");
			Date d =rs.getDate("rDate");
			String e = rs.getString("subject");
			int f = rs.getInt("score");
			ScoreVo vo = new ScoreVo(a,b,c,d,e,f);
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
