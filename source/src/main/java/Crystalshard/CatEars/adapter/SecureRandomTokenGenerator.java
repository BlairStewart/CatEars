package Crystalshard.CatEars.adapter;

import Crystalshard.CatEars.domain.AppConfiguration;
import Crystalshard.CatEars.domain.TokenGenerator;
import Crystalshard.CatEars.domain.atomiccontext.AuthTokenStringContext;
import com.google.inject.Inject;

import java.security.SecureRandom;

public class SecureRandomTokenGenerator implements TokenGenerator {
    static final String ALPHA_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom secureRandom = new SecureRandom();

    private AppConfiguration appConfiguration;

    @Inject
    public SecureRandomTokenGenerator(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @Override public AuthTokenStringContext randomToken() {
        return AuthTokenStringContext.of(randomString(appConfiguration.getAuthTokenLength()));
    }

    private String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( ALPHA_STRING.charAt( secureRandom.nextInt(ALPHA_STRING.length()) ) );
        return sb.toString();
    }
}
