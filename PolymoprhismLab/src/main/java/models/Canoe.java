package models;

public class Canoe extends Vehicle{

    private int noOfOars;

    public Canoe(String name, int maxNoOfOccupants, int lengthOfTimeInGarage, int noOfOars){
        super(name, maxNoOfOccupants, lengthOfTimeInGarage);
        this.noOfOars = noOfOars;
    }

    @Override
    public int returnAverageSpeed(){
        return 15;
    }

    @Override
    public String returnLengthOfTimeInGarage(){
        return ("The canoe titled " + this.name + " has been in the garage for "
                + this.lengthOfTimeInGarage + " days.");
    }
}
