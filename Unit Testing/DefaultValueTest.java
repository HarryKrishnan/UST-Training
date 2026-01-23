import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultValueTest {

    public String getDefaultCountryCode() {
        return "IN";
    }

    @Test
    public void testDefaultValue() {
        assertEquals("IN", getDefaultCountryCode());
    }
}
