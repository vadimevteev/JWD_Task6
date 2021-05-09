package by.javatr.airline.dao;

import by.javatr.airline.dao.exception.DaoException;
import by.javatr.airline.entity.planes.Plane;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Writer {
    public static void writePlanes(List<Plane> planes, String filePath) throws DaoException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath)))
        {
            objectOutputStream.writeObject(planes);
        }
        catch(IOException e){
            throw new DaoException("Error with writing to file file", e);
        }
    }
}
