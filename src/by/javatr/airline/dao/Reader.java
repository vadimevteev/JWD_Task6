package by.javatr.airline.dao;

import by.javatr.airline.dao.exception.DaoException;
import by.javatr.airline.entity.planes.Plane;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Reader {

    public static List<Plane> readPlanes(String filePath) throws DaoException {
        List<Plane> planes;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){

            planes = (List<Plane>)objectInputStream.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            throw new DaoException("Error with reading from file", e);
        }
        return planes;
    }
}
