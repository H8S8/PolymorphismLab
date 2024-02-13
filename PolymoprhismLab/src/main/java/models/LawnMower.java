package models;

public class LawnMower {

    private String name;
    private int cableLength;
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
}
