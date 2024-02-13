package models;

public abstract class LandVehicle extends Vehicle{
    private int noOfWheels;

    public LandVehicle(String name, int maxOccupancy, int lengthOfTimeInGarage, int noOfWheels){
        super(name, maxOccupancy, lengthOfTimeInGarage);
        this.noOfWheels = noOfWheels;
    }

}
