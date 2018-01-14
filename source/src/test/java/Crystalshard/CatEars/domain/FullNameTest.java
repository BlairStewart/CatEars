package Crystalshard.CatEars.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class FullNameTest {

    @Test
    public void fromString_noMiddleName() {

        FullName fullName = FullName.fromString("Blair Stewart");

        assertEquals("Blair", fullName.getFirstName());
        assertEquals("", fullName.getMiddleName());
        assertEquals("Stewart", fullName.getLastName());
    }

    @Test
    public void fromString_oneMiddleName() {

        FullName fullName = FullName.fromString("Blair Kenneth Stewart");

        assertEquals("Blair", fullName.getFirstName());
        assertEquals("Kenneth", fullName.getMiddleName());
        assertEquals("Stewart", fullName.getLastName());
    }

    @Test
    public void fromString_manyMiddleNames() {

        FullName fullName = FullName.fromString("Blair Kenneth Andrew Stewart");

        assertEquals("Blair", fullName.getFirstName());
        assertEquals("Kenneth Andrew", fullName.getMiddleName());
        assertEquals("Stewart", fullName.getLastName());
    }

    @Test
    public void toString_noMiddleName() {
        String expected = "Blair Stewart";
        FullName fullName = FullName.fromString(expected);

        String actual = fullName.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void toString_oneMiddleName() {
        String expected = "Blair Kenneth Stewart";
        FullName fullName = FullName.fromString(expected);

        String actual = fullName.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void toString_manyMiddleNames() {
        String expected = "Blair Kenneth Andrew Stewart";
        FullName fullName = FullName.fromString(expected);

        String actual = fullName.toString();

        assertEquals(expected, actual);
    }

}