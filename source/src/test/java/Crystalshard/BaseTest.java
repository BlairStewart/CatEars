package crystalshard;

import crystalshard.catears.domain.identifier.CatId;
import crystalshard.catears.domain.identifier.CoatPatternId;
import crystalshard.catears.domain.identifier.PersonId;

import java.net.URL;
import java.util.Random;

@SuppressWarnings("SameParameterValue")
public class BaseTest {
    private Random random = new Random();
    private String alphaNumericString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    protected URL anonUrl() {
        try {
            return new URL("http", anonString(), 80, "/");
        } catch (Exception ignored) {

        }
        return null;
    }

    protected CatId anonCatId() {
        return CatId.of(anonInt());
    }

    protected PersonId anonPersonId() {
        return PersonId.of(anonInt());
    }

    protected CoatPatternId anonCoatPatternId() {
        return CoatPatternId.of(anonInt());
    }

    protected String anonString() {
        return anonString(20);
    }

    protected int anonInt() {
        return random.nextInt();
    }

    private int anonInt(int bound) {
        return random.nextInt(bound);
    }

    private String anonString(int length) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            sb.append(alphaNumericString.charAt(random.nextInt(alphaNumericString.length())));
        }
        return sb.toString();
    }

    protected boolean anonBool() {
        return random.nextBoolean();
    }
}
