import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreetingMessageTest {

    public String getGreeting(String username) {
        return "Welcome, " + username;
    }

    @Test
    public void testGreetingMessage() {
        assertEquals("Welcome, User", getGreeting("User"));
    }
}
