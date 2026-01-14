import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringUppercaseTest {

    public String convertToUppercase(String input) {
        return input == null ? null : input.toUpperCase();
    }

    @Test
    public void testStringUppercaseConversion() {
        assertEquals("JAVA", convertToUppercase("java"));
    }
}
