import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    private final Utils utils = new Utils();
    @Test
    public void testIsAllPositiveNumbers() {
        assertTrue(utils.isAllPositiveNumbers("124", "1346"));
        assertFalse(utils.isAllPositiveNumbers("6543", "-1456"));
        assertFalse(utils.isAllPositiveNumbers("0", "666"));
    }
}