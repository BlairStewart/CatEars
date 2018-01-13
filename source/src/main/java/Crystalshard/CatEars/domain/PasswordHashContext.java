package Crystalshard.CatEars.domain;

import Crystalshard.CatEars.domain.atomiccontext.StringContext;

public class PasswordHashContext extends StringContext {

    public static PasswordHashContext of(String value) {
        return new PasswordHashContext(value);
    }

    protected PasswordHashContext(String value) {
        super(value);
    }
}
