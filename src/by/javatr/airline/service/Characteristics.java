package by.javatr.airline.service;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.service.exception.ServiceException;

public interface Characteristics {
    double findCommonLoad(AirlineCompany airlineCompany) throws ServiceException;

    int findCommonPassengers(AirlineCompany airlineCompany) throws ServiceException;
}
