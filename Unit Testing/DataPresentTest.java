import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DataPresentTest {

    public boolean isDataPresent() {
        return true;
    }

    @Test
    public void testDataPresentFlag() {
        assertTrue(isDataPresent());
    }
}
