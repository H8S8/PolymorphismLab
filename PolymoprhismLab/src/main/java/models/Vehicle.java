package models;
import interfaces.IStore;

public abstract class Vehicle implements IStore {

    private String name;
    private int maxOccupancy;
    private int lengthOfTimeInGarage;

    public Vehicle(String name, int maxOccupancy, int lengthOfTimeInGarage){
        this.name = name;
        this.maxOccupancy = maxOccupancy;
        this.lengthOfTimeInGarage = lengthOfTimeInGarage;
    }
    public abstract int returnAverageSpeed();

    public String returnLengthOfTimeInGarage(){
        return ("The vehicle titled " + this.name + " has been in the garage for "
                + this.lengthOfTimeInGarage + " days.");
    }
}
