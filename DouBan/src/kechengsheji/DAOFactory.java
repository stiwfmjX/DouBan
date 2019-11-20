package kechengsheji;

public class DAOFactory {
	private static DAOFactory instance;
	static {
		instance = new DAOFactory();
	}
	private DAOFactory() {
		
	}
	public static CMDAO getCMDAO() {
		CMDAO cmDAO = new CMDAOMSImpl();
		return cmDAO;
	}
	public static USORDAO getUSORDAO() {
		USORDAO usorDAO = new USORDAOSImpl();
		return usorDAO;
	}
	public static BCMDAO getBCMDAO() {
		BCMDAO bcmDAO = new BCMDAOSImpl();
		return bcmDAO;
	}
	public static MSCOREDAO getMSCOREDAO() {
		MSCOREDAO mscoreDAO = new MSCOREDAOSImpl();
		return mscoreDAO;
	}
	public static MPREDAO getMPREDAO() {
		MPREDAO mpre = new MPREDAOSImpl();
		return mpre;
	}
	public static MPDAO getMP() {
		MPDAO mpDAO = new MPDAOSImpl();
		return mpDAO;
	}
}
