package models;

public class Car extends LandVehicle{

    private boolean doorsLocked;

    public Car(String name, int lengthOfTimeInGarage, boolean doorsLocked){
        super(name, 5, lengthOfTimeInGarage, 4);
        this.doorsLocked = doorsLocked;
    }

    @Override
    public int returnAverageSpeed(){
        return 30;
    }

    @Override
    public String returnLengthOfTimeInGarage(){
        return ("The car titled " + this.name + " has been in the garage for "
                + this.lengthOfTimeInGarage + " days.");
    }
}
