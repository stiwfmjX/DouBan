package kechengsheji;
//import java.sql.Date;

public class CM {
	//private int CMNO;//����ID
	private String UNO;//�û�ID
	private String MNO;//��Ӱ���
	private String COMM;//��������
	private int CType;//�������� �뿴/����
	//private Date CTime;//����ʱ��

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
