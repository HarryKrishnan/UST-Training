import org.junit.Test;

public class InvalidAgeExceptionTest {

    public void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionForInvalidAge() {
        checkAge(-1);
    }
}
