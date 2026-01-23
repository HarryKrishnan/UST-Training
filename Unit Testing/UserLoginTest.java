import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserLoginTest {

    public boolean validateLogin(String username, String password) {
        return "admin".equals(username) && "admin123".equals(password);
    }

    @Test
    public void testUserLoginValidation() {
        assertTrue(validateLogin("admin", "admin123"));
        assertFalse(validateLogin("user", "pass"));
    }
}
