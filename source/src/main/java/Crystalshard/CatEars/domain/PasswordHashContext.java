package crystalshard.catears.domain;

import crystalshard.catears.domain.atomiccontext.StringContext;

public class PasswordHashContext extends StringContext {

    public static PasswordHashContext of(String value) {
        return new PasswordHashContext(value);
    }

    protected PasswordHashContext(String value) {
        super(value);
    }
}
