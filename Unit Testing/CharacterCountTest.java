import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CharacterCountTest {

    public int countCharacters(String input) {
        return input == null ? 0 : input.length();
    }

    @Test
    public void testCharacterCount() {
        assertEquals(5, countCharacters("Hello"));
    }
}
