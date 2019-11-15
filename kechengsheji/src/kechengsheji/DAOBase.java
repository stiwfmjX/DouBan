package kechengsheji;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOBase implements DAO{
	public Connection getConnection()
	{
		Connection conn = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://172.24.32.242:1433;databaseName=COMMENT;user=stu;password=stu";
			conn = DriverManager.getConnection(url);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
