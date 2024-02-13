import models.Canoe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CanoeTest {

    private Canoe canoe;

    @BeforeEach
    public void setUp(){
        canoe = new Canoe("Waves", 2, 450, 2);
    }

    @Test
    public void canReturnAverageSpeed(){
        assertThat(canoe.returnAverageSpeed()).isEqualTo(15);
    }

    @Test
    public void canReturnLengthOfTimeInGarage(){
        assertThat(canoe.returnLengthOfTimeInGarage()).isEqualTo("The vehicle titled Waves has been in the garage for 450 days.");
    }
}
