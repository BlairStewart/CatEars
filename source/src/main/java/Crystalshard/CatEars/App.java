package Crystalshard.CatEars;

import Crystalshard.CatEars.adapter.guice.ConfigurationModule;
import Crystalshard.CatEars.domain.AppConfiguration;
import Crystalshard.CatEars.domain.DatabaseType;
import Crystalshard.CatEars.domain.InvalidApplicationConfigurationException;
import Crystalshard.CatEars.adapter.guice.InMemoryDatabaseModule;
import Crystalshard.CatEars.domain.guice.modules.AppModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.log4j.Logger;

import static Crystalshard.CatEars.domain.LessCode.fmt;

public class App
{
    private static Logger log = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        try {
            Injector injector = Guice.createInjector(new AppModule(), new ConfigurationModule());
            AppConfiguration configuration = injector.getInstance(AppConfiguration.class);
            Injector childInjector = getChildInjector(injector, configuration);
            FeatureSetBooter booter = childInjector.getInstance(FeatureSetBooter.class);
            booter.boot();
        }
        catch (Exception e) {
            String message = fmt("Failed to start application: %s", e.getMessage());
            log.error(message);
        }
    }

    private static Injector getChildInjector(Injector injector, AppConfiguration config) {
        Injector childInjector;
        if (config.getDatabaseType().equals(DatabaseType.InMemory)) {
            childInjector = injector.createChildInjector(new InMemoryDatabaseModule());
            log.info("*************************************************************************");
            log.info("*                                                                       *");
            log.info("*             Initializing Database in Memory Mode                      *");
            log.info("*                                                                       *");
            log.info("*************************************************************************");
        }
        else {
            String message = fmt("Unable to initialize selected database type: %s", config.getDatabaseType().toString());
            log.error(message);
            throw new InvalidApplicationConfigurationException(message);
        }
        return childInjector;
    }
}