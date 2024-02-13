package models;

public class Car extends LandVehicle{

    private boolean doorsLocked;

    public Car(String name, boolean doorsLocked){
        super(name, 5, 4);
        this.doorsLocked = doorsLocked;
    }

    @Override
    public int averageSpeed(){
        return 30;
    }
}
