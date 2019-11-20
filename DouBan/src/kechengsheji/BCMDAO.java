package kechengsheji;

import java.util.List;

public interface BCMDAO {
	public void insertBCM(BCM bcm);
	public void deleteBCM(int bcmid);
	public List<BCM> getBCMs(String mno);
}
