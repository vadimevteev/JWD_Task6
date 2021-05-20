package by.javatr.airline.dao;

import by.javatr.airline.dao.exception.DaoException;
import by.javatr.airline.entity.planes.Plane;

import java.util.List;

public interface PlaneDAO {
    List<Plane> readPlanes(String filePath) throws DaoException;
    void savePlanes(List<Plane> planes, String filePath) throws DaoException;
}
