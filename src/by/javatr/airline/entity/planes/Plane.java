package by.javatr.airline.entity.planes;


import java.io.Serializable;

public abstract class Plane implements Serializable {
    private String modelName;
    private double length;
    private Engine engineType;
    private double fuelConsumptionOverHour;
    private double maxSpeed;
    private int crew;

    public Plane(){}

    public Plane(String name, double length, Engine engineType,
                 double fuelConsumptionOverHour, double maxSpeed, int crew) {
        this.modelName = name;
        this.length = length;
        this.engineType = engineType;
        this.fuelConsumptionOverHour = fuelConsumptionOverHour;
        this.maxSpeed = maxSpeed;
        this.crew = crew;
    }

    public String getModelName() {
        return modelName;
    }

    public double getLength() {
        return length;
    }


    public Engine getEngineType() {
        return engineType;
    }

    public double getFuelConsumptionOverHour() {
        return fuelConsumptionOverHour;
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getCrew() {
        return crew;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

    public void setFuelConsumptionOverHour(double fuelConsumptionOverHour) {
        this.fuelConsumptionOverHour = fuelConsumptionOverHour;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return
                "name='" + modelName + '\'' +
                ", length=" + length +
                ", engineType=" + engineType +
                ", fuelConsumptionOverHour=" + fuelConsumptionOverHour +
                ", maxSpeed=" + maxSpeed +
                ", crew=" + crew;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        return Double.compare(plane.length, length) == 0
                && Double.compare(plane.fuelConsumptionOverHour, fuelConsumptionOverHour) == 0
                && Double.compare(plane.maxSpeed, maxSpeed) == 0
                && crew == plane.crew && modelName.equals(plane.modelName)
                && engineType == plane.engineType;
    }

    @Override
    public int hashCode() {
        int result = modelName.hashCode();
        result = 31 * result + (int) length;
        result = 31 * result + engineType.hashCode();
        result = 31 * result + (int) fuelConsumptionOverHour;
        result = 31 * result + (int) maxSpeed;
        result = 31 * result + (int) crew;
        return result;
    }
}
