package models;

public class Canoe extends Vehicle{

    private int noOfOars;

    public Canoe(String name, int maxNoOfOccupants, int noOfOars){
        super(name, maxNoOfOccupants);
        this.noOfOars = noOfOars;
    }

    @Override
    public int averageSpeed(){
        return 15;
    }
}
