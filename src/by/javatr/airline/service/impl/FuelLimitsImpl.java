package by.javatr.airline.service.impl;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.ServiceException;
import by.javatr.airline.service.FuelLimits;
import by.javatr.airline.valid.ValidObject;

import java.util.ArrayList;
import java.util.List;

public class FuelLimitsImpl implements FuelLimits {

    @Override
    public List<Plane> findFuelConsumption(AirlineCompany airlineCompany, double lowLimit, double highLimit) throws ServiceException {
        if(ValidObject.isNullObject(airlineCompany))
            throw new ServiceException("Airline Company is null!");

        if(lowLimit < 0 || lowLimit > highLimit)
            throw new ServiceException("Incorrect limits of fuel");

        List<Plane> planes = airlineCompany.getPlanes();
        List<Plane> result = new ArrayList<>();
        for(Plane plane : planes){
            double fuel = plane.getFuelConsumptionOverHour();
            if( fuel >= lowLimit && fuel <= highLimit)
                result.add(plane);
        }
        return result;
    }
}
