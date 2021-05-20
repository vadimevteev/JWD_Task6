package by.javatr.airline.service.impl;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.Sorting;
import by.javatr.airline.service.exception.ServiceException;
import by.javatr.airline.valid.ValidObject;

import java.util.Comparator;
import java.util.List;

public class SortingImpl implements Sorting {

    @Override
    public void sort(AirlineCompany airlineCompany, Comparator<Plane> comparator) throws ServiceException {
        if(ValidObject.isNullObject(airlineCompany) || ValidObject.isNullObject(comparator))
            throw new ServiceException("Airline Company or comparator is null!");

        List<Plane> planes = airlineCompany.getPlanes();
        planes.sort(comparator);
    }
}
