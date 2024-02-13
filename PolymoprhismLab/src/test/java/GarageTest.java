import models.Bike;
import models.Canoe;
import models.Garage;
import models.Vehicle;
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
    public void canGetVehicles(){
        ArrayList<Vehicle> emptyVehicleslist = new ArrayList<>();
        assertThat(garage.getVehicles()).isEqualTo(emptyVehicleslist);
    }

    @Test
    public void canAddVehicle(){
        Canoe canoe = new Canoe("Watery", 3, 16, 6);
        garage.addVehicle(canoe);
        assertThat(garage.getVehicles().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveVehicle(){
        Canoe canoe = new Canoe("Watery", 3, 16, 6);
        Bike bike = new Bike("Trek", 2, 30, 2, false);
        garage.addVehicle(canoe);
        garage.addVehicle(bike);
        garage.removeVehicle(canoe);
        assertThat(garage.getVehicles().size()).isEqualTo(1);
    }

}
