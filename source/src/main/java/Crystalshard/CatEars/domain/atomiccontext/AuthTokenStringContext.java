package crystalshard.catears.domain.atomiccontext;

public class AuthTokenStringContext extends StringContext {

    public static AuthTokenStringContext of(String value) {
        return new AuthTokenStringContext(value);
    }

    protected AuthTokenStringContext(String value) {
        super(value);
    }
}
