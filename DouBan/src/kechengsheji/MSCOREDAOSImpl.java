package kechengsheji;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MSCOREDAOSImpl extends DAOBase implements MSCOREDAO{

	private static final String CREATE_MSCORE_SQL = "insert into MSCORE values(?,?,?)";
	@Override
	public void insertMSCORE(MSCORE mscore) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(CREATE_MSCORE_SQL);
			pstmt.setString(1,mscore.getUNO());
			pstmt.setString(2,mscore.getMNO());
			pstmt.setDouble(3,mscore.getSCORE());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
