package by.javatr.airline.service.comparator;

import by.javatr.airline.entity.planes.Plane;

import java.util.Comparator;

public class ComparatorFuelAndCrew implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        int result = Double.compare(o1.getFuelConsumptionOverHour(),o2.getFuelConsumptionOverHour());
        if(result == 0)
            result = Double.compare(o1.getCrew(), o2.getCrew());
        return result;
    }
}
