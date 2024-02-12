import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CanoeTest {

    Canoe canoe;

    @BeforeEach
    public void setUp(){
        canoe = new Canoe("Waves", 2, 2);
    }

    @Test
    public void canReturnAverageSpeed(){
        assertThat(canoe.averageSpeed()).isEqualTo(15);
    }
}
