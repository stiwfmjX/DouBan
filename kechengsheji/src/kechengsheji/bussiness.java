package kechengsheji;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bussiness extends DAOBase{
	
//	public void insertCMs() {
//		DAOFactory.getCMDAO().insertCM(cm);
//		DAOFactory.getCMDAO().getCMs(sql);
//	}
	
	public double getMSCORE(String mno) throws SQLException {
		String sql = "select avg(SCORE) from MSCORE where MNO=mno";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs.getDouble(1);
	}
	
	public int getUSOR(String cmid) throws SQLException {
		String sql = "select count(*) from MSCORE where USO=1";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs.getInt(1);
	}
	
	public int getCT1(String mno) throws SQLException {
		//�鿴�ⲿ��Ӱ�ж������뿴 CType=0
		String sql = "select count(*) from CM where CType=0";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs.getInt(1);
	}
	
	public int getCT2(String mno) throws SQLException {
		//�鿴�ⲿ��Ӱ�ж����˿���  CType=1
		String sql = "select count(*) from CM where CType=1";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs.getInt(1);
	}
	
//	public static void main(String[] args) throws SQLException{
//		//System.out.println("���������ۣ�");
//		System.out.println("������Ҫ�鿴���ֵĵ�Ӱ��ţ�");
//		Scanner in = new Scanner(System.in);
//		String mno = in.next();
//		System.out.printf("%.2f",getMSCORE(mno));
//	}
}
