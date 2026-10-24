import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.JANUARY));
    }
    @Test
    public void testAprilDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.APRIL));
    }
}