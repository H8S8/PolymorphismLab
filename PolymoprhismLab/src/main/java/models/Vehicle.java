package models;
import interfaces.IStore;

public abstract class Vehicle implements IStore {

    protected String name;
    private int maxOccupancy;
    protected int lengthOfTimeInGarage;

    public Vehicle(String name, int maxOccupancy, int lengthOfTimeInGarage){
        this.name = name;
        this.maxOccupancy = maxOccupancy;
        this.lengthOfTimeInGarage = lengthOfTimeInGarage;
    }
    public abstract int returnAverageSpeed();

    public abstract String returnLengthOfTimeInGarage();//{
//        return ("The vehicle titled " + this.name + " has been in the garage for "
//                + this.lengthOfTimeInGarage + " days.");
//    }
}
