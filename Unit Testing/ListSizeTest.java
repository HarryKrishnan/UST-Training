import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ListSizeTest {

    public int getListSize() {
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        return list.size();
    }

    @Test
    public void testListSize() {
        assertEquals(3, getListSize());
    }
}
