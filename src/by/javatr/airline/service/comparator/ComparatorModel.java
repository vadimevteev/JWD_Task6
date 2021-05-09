package by.javatr.airline.service.comparator;

import by.javatr.airline.entity.planes.Plane;

import java.util.Comparator;

public class ComparatorModel implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        return o1.getModelName().compareTo(o2.getModelName());
    }
}
