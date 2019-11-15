package kechengsheji;

import java.util.List;

public interface CMDAO {
	public void insertCM(CM cm);
	//public void updateCM(CM cm);
	public void deleteCM(String cmid);
	//public CM getCM(String cmid);
	public void getCMs(String sql);
}
