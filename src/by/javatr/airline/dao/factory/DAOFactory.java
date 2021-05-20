package by.javatr.airline.dao.factory;

import by.javatr.airline.dao.PlaneDAO;
import by.javatr.airline.dao.impl.FilePlaneDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private DAOFactory(){}

    private final PlaneDAO filePlaneDAO = new FilePlaneDAO();

    public static DAOFactory getInstance(){
        return instance;
    }

    public PlaneDAO getFilePlaneDAO(){
        return filePlaneDAO;
    }
}
