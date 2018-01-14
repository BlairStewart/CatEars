package crystalshard.catears.domain;

import crystalshard.catears.domain.atomiccontext.ClearTextPasswordContext;

public interface StringHasher {
    PasswordHashContext getHash(ClearTextPasswordContext password);
}
