package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Class.BCM;
import Class.CM;
import Class.MSCORE;
import DAOBase.DAOBase;
import DAOFactory.DAOFactory;

public class bussiness extends DAOBase{

	
	public double getMSCORE(String mno) throws SQLException {
		//获取电影评分
		String sql = "select avg(SCORE) from MSCORE where MNO='"+mno+"'";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			return rs.getDouble(1);
		}
		return -1;
	}
	
	public int getUSOR(int cmid) throws SQLException {
		//获取评论点赞人数
		String sql = "select count(*) from USOR where CMNO="+cmid+" and USO=1";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			return rs.getInt(1);
		}
		return -1;
	}
	
	public int getCT1(String mno) throws SQLException {
		//获取这部电影有多少人想看 CType=0
		String sql = "select count(*) from CM where MNO='"+mno+"' and CType=0";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			return rs.getInt(1);
		}
		return -1;
	}
	
	public int getCT2(String mno) throws SQLException {
		//获取这部电影有多少人看过  CType=1
		String sql = "select count(*) from CM where MNO='"+mno+"' and CType=1";
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			return rs.getInt(1);
		}
		return -1;
	}

	public void insertBCMs(int uno,String mno) {
		//写短评
		System.out.println("请输入您的评论：");
		Scanner in = new Scanner(System.in);
		String comm = in.next();
		BCM bcm = new BCM();
		bcm.setUNO(uno);
		bcm.setMNO(mno);
		bcm.setCOMM(comm);
		DAOFactory.getBCMDAO().insertBCM(bcm);
		in.close();
	}
	
	public void insertCMs(int uno,String mno,int type) {
		//写长评，想看/看过
		System.out.println("请输入您的评论：");
		Scanner in = new Scanner(System.in);
		String comm = in.next();
		CM cm = new CM();
		cm.setUNO(uno);
		cm.setMNO(mno);
		cm.setCOMM(comm);
		cm.setCType(type);
		DAOFactory.getCMDAO().insertCM(cm);
		in.close();
	}
	public void insertSCORE(int uno,String mno) {
		//用户给电影打分
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		MSCORE mscore = new MSCORE();
		mscore.setUNO(uno);
		mscore.setMNO(mno);
		mscore.setSCORE(score);
		DAOFactory.getMSCOREDAO().insertMSCORE(mscore);
		in.close();
	}

}
