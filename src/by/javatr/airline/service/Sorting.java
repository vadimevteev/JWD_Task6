package by.javatr.airline.service;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.ServiceException;

import java.util.Comparator;

public interface Sorting {
    void sort(AirlineCompany airlineCompany, Comparator<Plane> comparator) throws ServiceException;
}
