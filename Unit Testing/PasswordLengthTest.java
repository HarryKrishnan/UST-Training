import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PasswordLengthTest {

    public boolean checkPasswordLength(String password) {
        return password != null && password.length() >= 8;
    }

    @Test
    public void testPasswordLengthRule() {
        assertTrue(checkPasswordLength("password123"));
        assertFalse(checkPasswordLength("short"));
    }
}
