package models;

public abstract class Vehicle {

    private String name;
    private int maxOccupancy;

    public Vehicle(String name, int maxOccupancy){
        this.name = name;
        this.maxOccupancy = maxOccupancy;
    }
    public int averageSpeed(){
        return 0; //This is a placeholder, this function will be overloaded in the subclasses
    }
}
