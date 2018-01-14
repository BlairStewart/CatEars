package crystalshard.catears.domain;

import crystalshard.InjectorBaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfBirthTest extends InjectorBaseTest {

    @Test
    public void fromString() {
        String expected = "2018-01-13";

        DateOfBirth dateOfBirth = DateOfBirth.fromString(expected);

        String actual = dateOfBirth.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void equals() {
        DateOfBirth dateOfBirth = new DateOfBirth(2018, 1, 20);
        DateOfBirth dateOfBirth1 = new DateOfBirth(2018, 1, 20);

        boolean shouldBeTrue = dateOfBirth.equals(dateOfBirth1);

        assertTrue(shouldBeTrue);
    }

    @Test
    public void isAfter() {
        DateOfBirth dateOfBirth = new DateOfBirth(2018, 1, 20);
        DateOfBirth dateOfBirth1 = new DateOfBirth(2018, 2, 20);

        boolean shouldBeTrue = dateOfBirth1.isAfter(dateOfBirth);

        assertTrue(shouldBeTrue);
    }

    @Test
    public void isBefore() {
        DateOfBirth dateOfBirth = new DateOfBirth(2018, 1, 20);
        DateOfBirth dateOfBirth1 = new DateOfBirth(2018, 2, 20);

        boolean shouldBeTrue = dateOfBirth.isBefore(dateOfBirth1);

        assertTrue(shouldBeTrue);
    }

}