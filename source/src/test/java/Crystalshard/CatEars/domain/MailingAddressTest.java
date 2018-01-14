package crystalshard.catears.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class MailingAddressTest {


    @Test
    public void toString_shouldReturnCorrectAddressBlock() {
        String expected = "236 Simon Fraser Crescent\nSaskatoon SK S7H 3T2\nCanada";
        MailingAddress mailingAddress = new MailingAddress("236 Simon Fraser Crescent",
                "Saskatoon", "SK", "S7H 3T2", "Canada");

        String actual = mailingAddress.toString();

        assertEquals(expected, actual);
    }

}