package kechengsheji;

import java.util.List;

public interface MPREDAO {
	public void insertMPRE(MPRE mpre);
	public void deleteMPRE(String mid,String pno);
	public void updateMPRE(MPRE mpre);
	//public MPRE getMPRE(String mid);
	//public void getMPREs(String sql);
	public List<MPRE> getMPREs(String mno);
}
