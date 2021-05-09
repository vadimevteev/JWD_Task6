package by.javatr.airline.entity.planes;

import java.io.Serializable;

public class CargoPlane extends Plane implements Serializable {
    private double maxLoad;
    private double maxCargoVolume;

    public CargoPlane(){}

    public CargoPlane(String name, double length, Engine engineType,
                      double fuelConsumptionOverHour, double maxSpeed, int crew, double maxLoad, double maxCargoVolume) {
        super(name, length, engineType, fuelConsumptionOverHour, maxSpeed, crew);
        this.maxLoad = maxLoad;
        this.maxCargoVolume = maxCargoVolume;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public double getMaxCargoVolume() {
        return maxCargoVolume;
    }

    public void setMaxCargoVolume(double maxCargoVolume) {
        this.maxCargoVolume = maxCargoVolume;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return Double.compare(that.maxLoad, maxLoad) == 0 && Double.compare(that.maxCargoVolume, maxCargoVolume) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int)maxLoad;
        result = 31 * result + (int)maxCargoVolume;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                super.toString() +
                ", maxLoad=" + maxLoad +
                ", maxCargoVolume=" + maxLoad +
                '}';
    }
}
