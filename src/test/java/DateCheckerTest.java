import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
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

    // to test multiple input values
    // we simplify 12 units tests to 2 using
    // ParameterizexdTests -> multiple values into a single unitTest

    //Indicate to JUnit we use Enum values so use EnumSource
    // January, March, May, July, August, October, and December

    // Parameterized test using EnumSource for all months with 31 days
    @ParameterizedTest
    @EnumSource(
            value = DateChecker.Month.class,
            names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"}
    )
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }

    // Check for months that do not have 31 days
    @ParameterizedTest
    @EnumSource(
            value = DateChecker.Month.class,
            names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}
    )
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month), month + " should not have 31 days");
    }

}