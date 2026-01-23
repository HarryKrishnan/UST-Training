import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class NullCheckTest {

    public String getUsername() {
        return "admin";
    }

    @Test
    public void testNullCheck() {
        assertNotNull(getUsername());
    }
}
