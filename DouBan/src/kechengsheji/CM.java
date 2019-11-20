package kechengsheji;
//import java.sql.Date;

public class CM {
	//private int CMNO;//评论ID
	private String UNO;//用户ID
	private String MNO;//电影编号
	private String COMM;//评论内容
	private int CType;//评论类型 想看/看过
	//private Date CTime;//评论时间

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
	public int getCType() {
		return CType;
	}
	public void setCType(int cType) {
		CType = cType;
	}
}
