package models;
import interfaces.IStore;

public class LawnMower implements IStore {

    private String name;
    private double cableLength;
    private int lengthOfTimeInGarage;

    public LawnMower(String name, int cableLength, int lengthOfTimeInGarage){
        this.name = name;
        this.cableLength = cableLength;
        this.lengthOfTimeInGarage = lengthOfTimeInGarage;
    }

    public String returnLengthOfTimeInGarage(){
        return "The lawnmower titled " + this.name + " has been in the garage for "
                + this.lengthOfTimeInGarage + " days.";
    }

    public double returnNoOfLoopsOfCable(int lengthOfCableInOneLoop){
        return this.cableLength / lengthOfCableInOneLoop;
    }

    public double returnNoOfLoopsOfCable(double lengthOfCableInOneLoop){
        return this.cableLength / lengthOfCableInOneLoop;
    }
}
