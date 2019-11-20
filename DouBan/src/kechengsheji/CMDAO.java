package kechengsheji;

import java.util.List;

public interface CMDAO {
	public void insertCM(CM cm);
	//public void updateCM(CM cm);
	public void deleteCM(int cmid);
	public List<CM> getCMs(String mno);
}
