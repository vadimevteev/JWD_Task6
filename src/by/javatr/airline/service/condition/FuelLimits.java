package by.javatr.airline.service.condition;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.IncorrectLimitsException;
import by.javatr.airline.service.exception.NullObjectException;

import java.util.List;

public interface FuelLimits {
    List<Plane> findFuelConsumption(AirlineCompany airlineCompany, double lowLimit, double highLimit) throws NullObjectException, IncorrectLimitsException;
}
