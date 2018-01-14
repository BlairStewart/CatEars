package Crystalshard.CatEars.domain;

import Crystalshard.CatEars.domain.atomiccontext.ClearTextPasswordContext;

public interface StringHasher {
    PasswordHashContext getHash(ClearTextPasswordContext password);
}
