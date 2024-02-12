public abstract class LandVehicle extends Vehicle{
    private int noOfWheels;

    public LandVehicle(String name, int maxOccupancy, int noOfWheels){
        super(name, maxOccupancy);
        this.noOfWheels = noOfWheels;
    }

}
