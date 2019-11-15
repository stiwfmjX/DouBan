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
		//查看这部电影有多少人想看 CType=0
		String sql = "select count(*) from CM where CType=0";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs.getInt(1);
	}
	
	public int getCT2(String mno) throws SQLException {
		//查看这部电影有多少人看过  CType=1
		String sql = "select count(*) from CM where CType=1";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs.getInt(1);
	}
	
//	public static void main(String[] args) throws SQLException{
//		//System.out.println("请输入评论：");
//		System.out.println("请输入要查看评分的电影编号：");
//		Scanner in = new Scanner(System.in);
//		String mno = in.next();
//		System.out.printf("%.2f",getMSCORE(mno));
//	}
}
