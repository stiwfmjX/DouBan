package Class;

import java.sql.Date;

//import java.sql.Date;

public class CM {
	//private int CMNO;//����ID
	private int UNO;//�û�ID
	private String MNO;//��Ӱ���
	private String COMM;//��������
	private int CType;//�������� �뿴/����
	private Date CTime;//����ʱ��
	
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
	public int getCType() {
		return CType;
	}
	public void setCType(int cType) {
		CType = cType;
	}
	public Date getCTime() {
		return CTime;
	}
	public void setCTime(Date cTime) {
		CTime = cTime;
	}

}
