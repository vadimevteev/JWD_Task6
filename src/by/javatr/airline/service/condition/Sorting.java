package by.javatr.airline.service.condition;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.NullObjectException;

import java.util.Comparator;

public interface Sorting {
    void sort(AirlineCompany airlineCompany, Comparator<Plane> comparator) throws NullObjectException;
}
