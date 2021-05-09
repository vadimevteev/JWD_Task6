package by.javatr.airline.service.realization;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.CargoPlane;
import by.javatr.airline.entity.planes.PassengerPlane;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.exception.NullObjectException;
import by.javatr.airline.service.condition.Characteristics;
import by.javatr.airline.valid.ValidObject;

import java.util.List;

public class CharacteristicsRealization implements Characteristics {

    @Override
    public double findCommonLoad(AirlineCompany airlineCompany) throws NullObjectException {
        if(ValidObject.isNullObject(airlineCompany))
            throw new NullObjectException("Airline Company is null!");

        List<Plane> planes = airlineCompany.getPlanes();
        double commonLoad = 0;
        for(Plane plane : planes)
            if(plane instanceof CargoPlane){
                commonLoad += ((CargoPlane) plane).getMaxLoad();
            }


        return commonLoad;

    }

    @Override
    public int findCommonPassengers(AirlineCompany airlineCompany) throws NullObjectException {
        if(ValidObject.isNullObject(airlineCompany))
            throw new NullObjectException("Airline Company is null!");

        List<Plane> planes = airlineCompany.getPlanes();
        int commonPassengers = 0;
        for(Plane plane : planes)
            if(plane instanceof PassengerPlane) {
                PassengerPlane passengerPlane = (PassengerPlane) plane;
                int passengers = passengerPlane.getBusinessPassengers()
                        + passengerPlane.getEconomyPassengers()
                        + passengerPlane.getFirstClassPassengers();
                commonPassengers += passengers;
            }

        return commonPassengers;
    }
}
