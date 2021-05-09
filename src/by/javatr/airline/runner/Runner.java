package by.javatr.airline.runner;

import by.javatr.airline.dao.Reader;
import by.javatr.airline.dao.Writer;
import by.javatr.airline.dao.exception.DaoException;
import by.javatr.airline.entity.AirlineCompany;
import by.javatr.airline.entity.planes.CargoPlane;
import by.javatr.airline.entity.planes.Engine;
import by.javatr.airline.entity.planes.PassengerPlane;
import by.javatr.airline.entity.planes.Plane;
import by.javatr.airline.service.comparator.ComparatorModel;
import by.javatr.airline.service.exception.IncorrectLimitsException;
import by.javatr.airline.service.exception.NullObjectException;
import by.javatr.airline.service.realization.CharacteristicsRealization;
import by.javatr.airline.service.realization.FuelLimitsRealization;
import by.javatr.airline.service.realization.SortingRealization;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String... args)  {
        try {
            List<Plane> planesWrite = new ArrayList<>();
            planesWrite.add(new CargoPlane("Airbus Beluga XL", 63, Engine.TURBOPROP, 131, 1500, 4, 53000, 1500));
            planesWrite.add(new CargoPlane("Boeing 747 LCF Dreamlifter", 58, Engine.TURBOPROP, 145, 1800, 4, 56000, 1840));
            planesWrite.add(new PassengerPlane("Tu-154", 48, Engine.JET, 155, 820, 7, 180, 28, 0));
            planesWrite.add(new PassengerPlane("Airbus A310", 47, Engine.ELECTRIC, 180, 858, 7, 160, 23, 0));
            planesWrite.add(new PassengerPlane("Boeing-747", 77, Engine.ELECTRIC, 150, 917, 8, 285, 76, 14));

            Writer.writePlanes(planesWrite, "src\\planes.dat");
            List<Plane> planesRead = Reader.readPlanes("src\\planes.dat");
            AirlineCompany airlineCompany = new AirlineCompany(planesRead, "Aeroflot");
            System.out.println("Common load: ");
            CharacteristicsRealization characteristicsRealization = new CharacteristicsRealization();
            System.out.println(characteristicsRealization.findCommonLoad(airlineCompany));
            System.out.println("Common passengers: ");
            System.out.println(characteristicsRealization.findCommonPassengers(airlineCompany));

            System.out.println("Sorted planes by model:");
            SortingRealization sortingRealization = new SortingRealization();
            Comparator<Plane> comparator = new ComparatorModel();
            sortingRealization.sort(airlineCompany, comparator);
            System.out.println(airlineCompany.getPlanes());

            System.out.println("Plane with that characteristics of fuel:");
            FuelLimitsRealization fuelLimitsRealization = new FuelLimitsRealization();
            System.out.println(fuelLimitsRealization.findFuelConsumption(airlineCompany, 150, 180));
        }
        catch (DaoException| NullObjectException | IncorrectLimitsException e){
            e.printStackTrace();
        }
    }
}
