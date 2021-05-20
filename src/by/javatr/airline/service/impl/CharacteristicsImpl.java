package by.javatr.airline.service.impl;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.CargoPlane;
import by.javatr.airline.entity.planes.PassengerPlane;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.Characteristics;
import by.javatr.airline.service.exception.ServiceException;
import by.javatr.airline.valid.ValidLoad;
import by.javatr.airline.valid.ValidObject;
import by.javatr.airline.valid.ValidPassengers;

import java.util.List;

public class CharacteristicsImpl implements Characteristics {

    @Override
    public double findCommonLoad(AirlineCompany airlineCompany) throws ServiceException {
        if(ValidObject.isNullObject(airlineCompany))
            throw new ServiceException("Airline Company is null!");

        List<Plane> planes = airlineCompany.getPlanes();
        double commonLoad = 0;
        for(Plane plane : planes)

            if(plane instanceof CargoPlane){
                double load = ((CargoPlane) plane).getMaxLoad();
                commonLoad += ValidLoad.isValid(load) ? load : 0;
            }


        return commonLoad;

    }

    @Override
    public int findCommonPassengers(AirlineCompany airlineCompany) throws ServiceException {
        if(ValidObject.isNullObject(airlineCompany))
            throw new ServiceException("Airline Company is null!");

        List<Plane> planes = airlineCompany.getPlanes();
        int commonPassengers = 0;
        for(Plane plane : planes)
            if(plane instanceof PassengerPlane) {
                PassengerPlane passengerPlane = (PassengerPlane) plane;
                int businessPassengers = passengerPlane.getBusinessPassengers();
                int economyPassengers = passengerPlane.getEconomyPassengers();
                int firstClassPassengers = passengerPlane.getFirstClassPassengers();

                if(ValidPassengers.isValid(businessPassengers,economyPassengers,firstClassPassengers))
                    commonPassengers += (businessPassengers + economyPassengers + firstClassPassengers);
            }

        return commonPassengers;
    }
}
