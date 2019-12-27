package DAOImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Class.BCM;
import DAO.BCMDAO;
import DAOBase.DAOBase;

public class BCMDAOSImpl extends DAOBase implements BCMDAO{

	private static final String CREATE_BCM_SQL = "insert into BCM(UNO,MNO,COMM,CTime) values(?,?,?,?)";
	private static final String DELETE_BCM_SQL = "delete from BCM where BCMNO = ?";
	private static final String SEARCH_BCM_SQL = "select * from BCM where MNO=";
	
	@Override
	public void insertBCM(BCM bcm) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(CREATE_BCM_SQL);
			pstmt.setInt(1, bcm.getUNO());
			pstmt.setString(2, bcm.getMNO());
			pstmt.setString(3, bcm.getCOMM()); 
			Date date=new Date(System.currentTimeMillis());
			pstmt.setDate(4,date);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBCM(int bcmid) {
		// TODO Auto-generated method stub
		try {
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(DELETE_BCM_SQL);
			pstmt.setInt(1, bcmid);
			pstmt.executeUpdate();
			System.out.println("É¾³ý³É¹¦£¡");
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<BCM> getBCMs(String mno) {
		// TODO Auto-generated method stub
		List<BCM> BCMs = new ArrayList<BCM>();
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String finalsql = SEARCH_BCM_SQL+"'"+mno+"'";
			rs = stmt.executeQuery(finalsql);
			while(rs.next()) 
			{
				BCM bcm = new BCM();
				bcm.setUNO(rs.getInt("UNO"));
				bcm.setMNO(rs.getString("MNO"));
				bcm.setCOMM(rs.getString("COMM"));
				bcm.setCTime(rs.getDate("CTime"));
				BCMs.add(bcm);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return BCMs;
	}
}
