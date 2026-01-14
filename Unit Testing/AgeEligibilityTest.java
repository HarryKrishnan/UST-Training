import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AgeEligibilityTest {

    public boolean checkEligibility(int age) {
        return age >= 18;
    }

    @Test
    public void testAgeEligibility() {
        assertTrue(checkEligibility(18));
        assertTrue(checkEligibility(25));
        assertFalse(checkEligibility(17));
    }
}
