import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ArrayContainsTest {

    public boolean containsValue(int[] numbers, int value) {
        for (int num : numbers) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testArrayContainsValue() {
        int[] data = { 1, 2, 3, 4, 5 };
        assertTrue(containsValue(data, 3));
    }
}
