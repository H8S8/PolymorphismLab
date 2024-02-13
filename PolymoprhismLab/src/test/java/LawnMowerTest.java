import models.LawnMower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LawnMowerTest {

    private LawnMower lawnMower;

    @BeforeEach
    public void setUp(){
        lawnMower = new LawnMower("DeWalt", 20, 59);
    }

    @Test
    public void canReturnLengthOfTimeInGarage(){
        assertThat(lawnMower.returnLengthOfTimeInGarage()).isEqualTo("The lawnmower titled DeWalt has been in the garage for 59 days.");
    }
}
