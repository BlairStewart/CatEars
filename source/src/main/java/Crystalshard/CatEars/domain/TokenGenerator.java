package Crystalshard.CatEars.domain;

import Crystalshard.CatEars.domain.atomiccontext.AuthTokenStringContext;

public interface TokenGenerator {
    AuthTokenStringContext randomToken();
}
