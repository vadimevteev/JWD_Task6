package by.javatr.airline.service.realization;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.IncorrectLimitsException;
import by.javatr.airline.service.exception.NullObjectException;
import by.javatr.airline.service.condition.FuelLimits;
import by.javatr.airline.valid.ValidObject;

import java.util.ArrayList;
import java.util.List;

public class FuelLimitsRealization implements FuelLimits {

    @Override
    public List<Plane> findFuelConsumption(AirlineCompany airlineCompany, double lowLimit, double highLimit) throws NullObjectException, IncorrectLimitsException {
        if(ValidObject.isNullObject(airlineCompany))
            throw new NullObjectException("Airline Company is null!");

        if(lowLimit > highLimit)
            throw new IncorrectLimitsException("Incorrect limits of fuel");

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
