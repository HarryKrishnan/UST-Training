import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FileNameExtensionTest {

    public boolean checkFileNameExtension(String fileName) {
        return fileName != null && fileName.endsWith(".csv");
    }

    @Test
    public void testFileNameExtension() {
        assertTrue(checkFileNameExtension("data.csv"));
        assertFalse(checkFileNameExtension("image.png"));
    }
}
