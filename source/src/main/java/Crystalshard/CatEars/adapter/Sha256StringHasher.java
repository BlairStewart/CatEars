package crystalshard.catears.adapter;

import crystalshard.catears.domain.PasswordHashContext;
import crystalshard.catears.domain.StringHasher;
import crystalshard.catears.domain.atomiccontext.ClearTextPasswordContext;
import org.apache.log4j.Logger;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Sha256StringHasher implements StringHasher {

    private static MessageDigest digest;

    static {
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            String message = "Unable to initialize SHA-256 Message Digest.";
            Logger.getLogger(StringHasher.class).error(message, e);
        }
    }

    @Override public PasswordHashContext getHash(ClearTextPasswordContext password) {
        byte[] hash = digest.digest(password.getValue().getBytes(StandardCharsets.UTF_8));
        return PasswordHashContext.of(Base64.getEncoder().encodeToString(hash));
    }
}
