package by.javatr.airline.service.comparator;

import by.javatr.airline.entity.planes.Plane;

import java.util.Comparator;

public class ComparatorSpeed implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        return Double.compare(o1.getMaxSpeed(), o2.getMaxSpeed()) ;
    }
}
