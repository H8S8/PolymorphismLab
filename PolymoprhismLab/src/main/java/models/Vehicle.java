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
    public int averageSpeed(){
        return 0; //This is a placeholder, this function will be overloaded in the subclasses
    }

    public String returnLengthOfTimeInGarage(){
        return ("The vehicle titled " + this.name + " has been in the garage for "
                + this.lengthOfTimeInGarage + " days.");
    }
}
