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
        assertThat(bike.returnAverageSpeed()).isEqualTo(20);
    }

    @Test
    public void canReturnLengthOfTimeInGarage(){
        assertThat(bike.returnLengthOfTimeInGarage()).isEqualTo("The vehicle titled Giant has been in the garage for 24 days.");
    }

    @Test
    public void canPumpUpTyres(){
        assertThat(bike.pumpUpTyres()).isEqualTo("Tyres are pumped!");
    }
}