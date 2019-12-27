package DAO;

import java.util.List;

import Class.BCM;

public interface BCMDAO {
	public void insertBCM(BCM bcm);
	public void deleteBCM(int bcmid);
	public List<BCM> getBCMs(String mno);
}
