package kechengsheji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MPREDAOSImpl extends DAOBase implements MPREDAO{
	private static final String CREATE_MPRE_SQL = "insert into MPRE values(?,?,?,?)";
	private static final String DELETE_MPRE_SQL = "delete from MPRE where MNO=? AND MPNO=?";
	private static final String SEARCH_MPRE_SQL = 
			"search MN,MPRI,PTime,PText from MPRE left outer join Movie on MPRE.MNO=Movie.MNO left outer join MP on MPRE.MPNO=MP.MPNO ";
	
	@Override
	public void insertMPRE(MPRE mpre) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(CREATE_MPRE_SQL);
			pstmt.setString(1,mpre.getMNO());
			pstmt.setString(2,mpre.getMPNO());
			pstmt.setString(3,mpre.getPTime());
			pstmt.setString(4,mpre.getPText());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteMPRE(String mid, String pno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(DELETE_MPRE_SQL);
			pstmt.setString(1, mid);
			pstmt.setString(2, pno);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateMPRE(MPRE mpre) {
		// TODO Auto-generated method stub
		deleteMPRE(mpre.getMNO(),mpre.getMPNO());
		insertMPRE(mpre);
	}

	@Override
	public void getMPREs(String sql) {
		// TODO Auto-generated method stub
		//List<MPRE> MPREs = new ArrayList<MPRE>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String finalsql = null;
			if(sql.equals("")) {
				finalsql = sql;
			}else {
				finalsql = SEARCH_MPRE_SQL + "where " + sql;
			}
			rs = stmt.executeQuery(finalsql);
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
