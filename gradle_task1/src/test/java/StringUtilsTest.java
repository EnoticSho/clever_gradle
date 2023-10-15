import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private final StringUtils utils = new StringUtils();
    @Test
    public void testIsPositiveNumber() {
        assertTrue(utils.isPositiveNumber("213"));
        assertFalse(utils.isPositiveNumber("-54145"));
        assertFalse(utils.isPositiveNumber("0"));
        assertFalse(utils.isPositiveNumber("asdfasdf"));
    }
}
