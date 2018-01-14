package crystalshard.catears.domain;

import crystalshard.catears.domain.atomiccontext.AuthTokenStringContext;

public interface TokenGenerator {
    AuthTokenStringContext randomToken();
}
