package crystalshard;

import crystalshard.catears.adapter.guice.ConfigurationModule;
import crystalshard.catears.adapter.guice.InMemoryDatabaseModule;
import crystalshard.catears.domain.guice.modules.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestHelper {

    public static Injector getInjector() {
        return Guice.createInjector(new AppModule(), new ConfigurationModule(), new InMemoryDatabaseModule());
    }
}
