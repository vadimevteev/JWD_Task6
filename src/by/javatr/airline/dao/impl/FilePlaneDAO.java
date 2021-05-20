package by.javatr.airline.dao.impl;

import by.javatr.airline.dao.PlaneDAO;
import by.javatr.airline.dao.exception.DaoException;
import by.javatr.airline.entity.planes.Plane;

import java.io.*;
import java.util.List;

public class FilePlaneDAO implements PlaneDAO {


    @Override
    public List<Plane> readPlanes(String filePath) throws DaoException {
        List<Plane> planes;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){

            planes = (List<Plane>)objectInputStream.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            throw new DaoException("Error with reading from file", e);
        }
        return planes;
    }

    @Override
    public void savePlanes(List<Plane> planes, String filePath) throws DaoException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            objectOutputStream.writeObject(planes);
        }
        catch(IOException e){
            throw new DaoException("Error with writing to file file", e);
        }
    }
}
