import models.Bike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BikeTest {

    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike("Giant", 1, 24, 2, false);
    }

    @Test
    public void canReturnAverageSpeed(){
        assertThat(bike.averageSpeed()).isEqualTo(20);
    }
}