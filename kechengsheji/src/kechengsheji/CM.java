package kechengsheji;
//import java.sql.Date;

public class CM {
	private String CMNO;//评论ID
	private String UNO;//用户ID
	private String MNO;//电影编号
	private String COMM;//评论内容
	//private Date CTime;//评论时间
	private int CType;//评论类型 想看/看过
	
	
	public String getCMNO() {
		return CMNO;
	}
	public void setCMNO(String cMNO) {
		CMNO = cMNO;
	}
	public String getUNO() {
		return UNO;
	}
	public void setUNO(String uNO) {
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
//	public Date getCTime() {
//		return CTime;
//	}
//	public void setCTime(Date cTime) {
//		CTime = cTime;
//	}
	public int getCType() {
		return CType;
	}
	public void setCType(int cType) {
		CType = cType;
	}
}
