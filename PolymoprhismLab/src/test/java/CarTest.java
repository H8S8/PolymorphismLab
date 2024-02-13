import models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void SetUp(){
        car = new Car("Volvo", 7, true);
    }

    @Test
    public void canReturnAverageSpeed(){
        assertThat(car.returnAverageSpeed()).isEqualTo(30);
    }

    @Test
    public void canReturnLengthOfTimeInGarage(){
        assertThat(car.returnLengthOfTimeInGarage()).isEqualTo("The vehicle titled Volvo has been in the garage for 7 days.");
    }

    @Test
    public void canPumpUpTyres(){
        assertThat(car.pumpUpTyres()).isEqualTo("Tyres are pumped!");
    }
}
