package kechengsheji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class CMDAOMSImpl extends DAOBase implements CMDAO{
	private static final String CREATE_CM_SQL = "insert into CM(UNO,MNO,COMM,CType,CTime) values(?,?,?,?,?)";
	private static final String DELETE_CM_SQL = "delete from CM where CMNO = ?";
//	private static final String SEARCH_CM_SQL = 
//			"select username,CType,MN,CTime,CText from CM left outer join t_user on CM.UNO=t_user.UNO left outer join Movie on CM.MNO=Movie.MNO ";             
	private static final String SEARCH_CM_SQL = "select * from CM where MNO=";
	
	public void insertCM(CM cm) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(CREATE_CM_SQL);
			pstmt.setString(1, cm.getUNO());
			pstmt.setString(2, cm.getMNO());
			pstmt.setString(3, cm.getCOMM()); 
			pstmt.setInt(4,cm.getCType());
			Date date=new Date(System.currentTimeMillis());
			pstmt.setDate(5,date);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void updateCM(CM cm) {
//		//用户不可以修改评论
//		System.out.println("用户不可以修改数据！");
//	}
	
	public void deleteCM(int cmid) {
		try {
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(DELETE_CM_SQL);
			pstmt.setInt(1, cmid);
			pstmt.executeUpdate();
			System.out.println("删除成功！");
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public CM getCM(String cmid) {
//		CM cm = null;
//		try {
//			Connection conn = getConnection();
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(SEARCH_CM_SQL);
//			while(rs.next())
//			{
//				//System.out.println(rs.getString("CMNO"));
//			}
//			conn.close();
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return cm;
//	}
	
//	public void getCMs(String sql){
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			conn = getConnection();
//			stmt = conn.createStatement();
//			String finalsql = null;
//			if(sql.equals("")) {
//				finalsql = sql;
//			}else {
//				finalsql = SEARCH_CM_SQL + "where " + sql;
//			}
//			rs = stmt.executeQuery(finalsql);
//			while(rs.next()) {
//				System.out.print(rs.getString("username") + " ");
//				if(rs.getInt("CType") == 0) {
//					System.out.print("想看");
//				}else {
//					System.out.print("看过");
//				}
//				System.out.print(rs.getString("MN"));
//				System.out.println(rs.getDate("CTime"));
//				System.out.println("CText");
//			}
//			rs.close();
//			stmt.close();
//			conn.close();
//		}catch(Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public List<CM> getCMs(String mno){
		List<CM> CMs = new ArrayList<CM>();
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String finalsql = SEARCH_CM_SQL+"'"+mno+"'";
			rs = stmt.executeQuery(finalsql);
			while(rs.next()) 
			{
				CM cm = new CM();
				cm.setUNO(rs.getString("UNO"));
				cm.setMNO(rs.getString("MNO"));
				cm.setCOMM(rs.getString("COMM"));
				cm.setCType(rs.getInt("CType"));
				CMs.add(cm);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CMs;
	}
}
