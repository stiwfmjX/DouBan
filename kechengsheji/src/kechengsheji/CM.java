package kechengsheji;
//import java.sql.Date;

public class CM {
	private String CMNO;//����ID
	private String UNO;//�û�ID
	private String MNO;//��Ӱ���
	private String COMM;//��������
	//private Date CTime;//����ʱ��
	private int CType;//�������� �뿴/����
	
	
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
