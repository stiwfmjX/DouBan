package kechengsheji;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class USORDAOSImpl extends DAOBase implements USORDAO{
	private static final String CREATE_USOR_SQL = "insert into USOR values(?,?,?)";
	private static final String DELETE_USOR_SQL = "delete from CM where CMNO = ? AND UNO = ?";
	
	@Override
	public void insertUSOR(USOR usor) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(CREATE_USOR_SQL);
			pstmt.setString(1,usor.getCMNO());
			pstmt.setString(2, usor.getUNO());
			pstmt.setInt(3, usor.getUSO());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUSOR(String cmid, String uid) {
		// TODO Auto-generated method stub
		try {
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(DELETE_USOR_SQL);
			pstmt.setString(1, cmid);
			pstmt.setString(2, uid);
			pstmt.executeUpdate();
			System.out.println("ɾ���ɹ���");
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
