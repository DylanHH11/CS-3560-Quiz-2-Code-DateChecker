import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.JANUARY), "January should have 31 days");
    }
}