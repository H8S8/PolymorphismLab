package models;
import interfaces.IStore;
import java.util.ArrayList;

public class Garage {

    private ArrayList<IStore> items;

    public Garage(){
        this.items = new ArrayList<>();
    }

    public ArrayList<IStore> getItems(){
        return this.items;
    }

    public void addItem(IStore item){
        this.items.add(item);
    }

    public void removeItem(IStore item){
        this.items.remove(item);
    }
}
