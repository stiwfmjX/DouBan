package Class;

import java.sql.Date;

public class BCM {
	private int UNO;//�û�ID
	private String MNO;//��Ӱ���
	private String COMM;//��������
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
	public Date getCTime() {
		return CTime;
	}
	public void setCTime(Date cTime) {
		CTime = cTime;
	}
	
}
