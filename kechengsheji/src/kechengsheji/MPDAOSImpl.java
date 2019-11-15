package kechengsheji;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MPDAOSImpl extends DAOBase implements MPDAO{

	private static final String CREATE_MP_SQL = "insert into MP values(?,?)";
	private static final String DELETE_MP_SQL = "delete from MP where MPNO=?";
	
	@Override
	public void insertMP(MP mp) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(CREATE_MP_SQL);
			pstmt.setString(1,mp.getMPNO());
			pstmt.setString(2,mp.getMPRI());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMP(String mpno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(DELETE_MP_SQL);
			pstmt.setString(1, mpno);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateMP(MP mp) {
		// TODO Auto-generated method stub
		deleteMP(mp.getMPNO());
		insertMP(mp);
	}

}
