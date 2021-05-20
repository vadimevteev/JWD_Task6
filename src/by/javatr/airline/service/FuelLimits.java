package by.javatr.airline.service;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.ServiceException;

import java.util.List;

public interface FuelLimits {
    List<Plane> findFuelConsumption(AirlineCompany airlineCompany, double lowLimit, double highLimit) throws ServiceException;
}
