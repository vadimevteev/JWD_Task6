package by.javatr.airline.entity.planes;

import java.io.Serializable;

public class PassengerPlane extends Plane implements Serializable {
    private int economyPassengers;
    private int businessPassengers;
    private int firstClassPassengers;

    public PassengerPlane(){}

    public PassengerPlane(String name, double length, Engine engineType,
                          double fuelConsumptionOverHour, double maxSpeed, int crew,
                          int economyPassengers, int businessPassengers, int firstClassPassengers) {
        super(name, length, engineType, fuelConsumptionOverHour, maxSpeed, crew);
        this.economyPassengers = economyPassengers;
        this.businessPassengers = businessPassengers;
        this.firstClassPassengers = firstClassPassengers;
    }

    public void setEconomyPassengers(int economyPassengers) {
        this.economyPassengers = economyPassengers;
    }

    public int getEconomyPassengers() {
        return economyPassengers;
    }

    public int getBusinessPassengers() {
        return businessPassengers;
    }

    public void setBusinessPassengers(int businessPassengers) {
        this.businessPassengers = businessPassengers;
    }

    public int getFirstClassPassengers() {
        return firstClassPassengers;
    }

    public void setFirstClassPassengers(int firstClassPassengers) {
        this.firstClassPassengers = firstClassPassengers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return economyPassengers == that.economyPassengers
                && businessPassengers == that.businessPassengers
                && firstClassPassengers == that.firstClassPassengers;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + economyPassengers;
        result = 31 * result + businessPassengers;
        result = 31 * result + firstClassPassengers;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                super.toString() +
                ", economyPassengers=" + economyPassengers +
                ", businessPassengers=" + businessPassengers +
                ", firstClassPassengers=" + firstClassPassengers +
                '}';
    }

}
