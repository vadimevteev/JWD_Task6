package by.javatr.airline.entity;

import by.javatr.airline.entity.planes.Plane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineCompany {

    private List<Plane> planes;
    private String name;

    public AirlineCompany(){
        planes = new ArrayList<>();
    }

    public AirlineCompany(List<Plane> planes, String name) {
        this.planes = planes;
        this.name = name;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlane(Plane plane){
        planes.add(plane);
    }

    public void removePlane(Plane plane){
        planes.remove(plane);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "planes=" + planes +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineCompany that = (AirlineCompany) o;
        return planes.equals(that.planes) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = planes.hashCode();
        return result * 31 + name.hashCode();
    }
}
