package models;

public class Bike extends LandVehicle{

    private boolean electricBike;

    public Bike(String name, int maxOccupants, int lengthOfTimeInGarage, int noOfWheels, boolean electricBike){
        super(name, maxOccupants, lengthOfTimeInGarage, noOfWheels);
        this.electricBike = electricBike;
    }

    @Override
    public int averageSpeed(){
        return 20; // Gradient is a decimal
    }
}
