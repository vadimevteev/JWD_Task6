package by.javatr.airline.service.realization;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.condition.Sorting;
import by.javatr.airline.service.exception.NullObjectException;
import by.javatr.airline.valid.ValidObject;

import java.util.Comparator;
import java.util.List;

public class SortingRealization implements Sorting {

    @Override
    public void sort(AirlineCompany airlineCompany, Comparator<Plane> comparator) throws NullObjectException {
        if(ValidObject.isNullObject(airlineCompany) || ValidObject.isNullObject(comparator))
            throw new NullObjectException("Airline Company or comparator is null!");

        List<Plane> planes = airlineCompany.getPlanes();
        planes.sort(comparator);
    }
}
