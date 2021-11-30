package TelInfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Connect_DB.TelInfoDBConn;
import TelInfoVO.TelInfoVO;

public class TelInfoDAO {
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public TelInfoDAO() throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}
	
	public ArrayList<TelInfoVO> getAllInfo() throws SQLException{
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
		String sql = "SELECT * FROM teltable5 ORDER BY id";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			Date d = rs.getDate("d");
			
			TelInfoVO tv = new TelInfoVO(id, name, tel, d);
			
			tiarray.add(tv);
			
		}
		return tiarray;
	}
	
	public boolean insert_nametel(int id, String name, String tel, String sDate) throws SQLException{
		String sql = "insert into teltable5 values(? ? ? ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			Date d = Date.valueOf(sDate);
			
//			int year = Integer.parseInt(sDate.substring(0, 4))-1900;
//			int month = Integer.parseInt(sDate.substring(4, 6)) -1;
//			int day = Integer.parseInt(sDate.substring(6, 8));
//			Date d = new Date(year, month, day);
			pstmt.setDate(4, d);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("insert Exception");
			return false;
		}
		
		
		return true;
	}
	
	public boolean update_nametel(int id, String name, String tel, String sDate) {
		String sql = "update teltable5 name = ?, tel = ?, d = ? where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			Date d = Date.valueOf(sDate);
			pstmt.setDate(3, d);
			pstmt.setInt(4, id);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("insert Exception");
			return false;
		}
		
		return true;
	}
	
	public boolean delete_nametel(int id) {
		String sql = "delete from teltable5 where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("delete Exception");
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
}
