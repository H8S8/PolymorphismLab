import interfaces.IStore;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    private Garage garage;

    @BeforeEach
    public void setUp(){
        garage = new Garage();
    }

    @Test
    public void canGetItems(){
        ArrayList<IStore> emptyItemslist = new ArrayList<>(); //Vehicle
        assertThat(garage.getItems()).isEqualTo(emptyItemslist);
    }

    @Test
    public void canAddItem(){
        Canoe canoe = new Canoe("Watery", 3, 16, 6);
        LawnMower lawnMower = new LawnMower("Cow", 2, 1);
        garage.addItem(canoe);
        garage.addItem(lawnMower);
        assertThat(garage.getItems().size()).isEqualTo(2);
    }

    @Test
    public void canRemoveItem(){
        Canoe canoe = new Canoe("Watery", 3, 16, 6);
        Bike bike = new Bike("Trek", 2, 30, 2, false);
        LawnMower lawnMower = new LawnMower("Cow", 2, 1);
        garage.addItem(canoe);
        garage.addItem(bike);
        garage.addItem(lawnMower);

        garage.removeItem(canoe);
        garage.removeItem(lawnMower);
        assertThat(garage.getItems().size()).isEqualTo(1);
    }

}
