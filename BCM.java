package Class;

import java.sql.Date;

public class BCM {
	private int UNO;//用户ID
	private String MNO;//电影编号
	private String COMM;//评论内容
	private Date CTime;//评论时间
	
	public int getUNO() {
		return UNO;
	}
	public void setUNO(int uNO) {
		UNO = uNO;
	}
	public String getMNO() {
		return MNO;
	}
	public void setMNO(String mNO) {
		MNO = mNO;
	}
	public String getCOMM() {
		return COMM;
	}
	public void setCOMM(String cOMM) {
		COMM = cOMM;
	}
	public Date getCTime() {
		return CTime;
	}
	public void setCTime(Date cTime) {
		CTime = cTime;
	}
	
}
