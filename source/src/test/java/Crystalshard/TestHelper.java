package Crystalshard;

import Crystalshard.CatEars.adapter.guice.ConfigurationModule;
import Crystalshard.CatEars.adapter.guice.InMemoryDatabaseModule;
import Crystalshard.CatEars.domain.guice.modules.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestHelper {

    public static Injector getInjector() {
        return Guice.createInjector(new AppModule(), new ConfigurationModule(), new InMemoryDatabaseModule());
    }
}
