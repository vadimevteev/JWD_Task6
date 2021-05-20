package by.javatr.airline.valid;

public class ValidPassengers {
    public static boolean isValid(int... arr){
        for(int num : arr){
            if(num < 0)
                return false;
        }
        return true;
    }

}
