import models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void SetUp(){
        car = new Car("Volvo", true);
    }

    @Test
    public void canReturnAverageSpeed(){
        assertThat(car.averageSpeed()).isEqualTo(30);
    }
}
