import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> vehicles;

    public Garage(){
        this.vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }
}
