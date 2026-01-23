import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EmailValidationTest {

    public boolean validateEmail(String email) {
        return email != null && email.contains("@");
    }

    @Test
    public void testEmailValidation() {
        assertTrue(validateEmail("test@example.com"));
        assertFalse(validateEmail("testexample.com"));
    }
}
