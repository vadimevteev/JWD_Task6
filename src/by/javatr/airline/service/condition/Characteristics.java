package by.javatr.airline.service.condition;

import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.service.exception.NullObjectException;

public interface Characteristics {
    double findCommonLoad(AirlineCompany airlineCompany) throws NullObjectException;

    int findCommonPassengers(AirlineCompany airlineCompany) throws NullObjectException;
}
