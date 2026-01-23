import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BooleanFlagTest {

    public boolean isUserActive() {
        return true;
    }

    @Test
    public void testBooleanFlag() {
        assertTrue(isUserActive());
    }
}
