package crystalshard.catears;

import crystalshard.catears.adapter.guice.InMemoryDatabaseModule;
import crystalshard.catears.domain.AppConfiguration;
import crystalshard.catears.domain.DatabaseType;
import crystalshard.catears.domain.LessCode;
import crystalshard.catears.domain.guice.modules.AppModule;
import crystalshard.catears.adapter.guice.ConfigurationModule;
import crystalshard.catears.domain.InvalidApplicationConfigurationException;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.log4j.Logger;

import static crystalshard.catears.domain.LessCode.fmt;

public class App {
    private static Logger log = Logger.getLogger(App.class);

    public static void main( String[] args ) {
        try {
            Injector injector = Guice.createInjector(new AppModule(), new ConfigurationModule());
            AppConfiguration configuration = injector.getInstance(AppConfiguration.class);
            Injector childInjector = getChildInjector(injector, configuration);
            FeatureSetBooter booter = childInjector.getInstance(FeatureSetBooter.class);
            booter.boot();
        }
        catch (Exception e) {
            String message = LessCode.fmt("Failed to start application: %s", e.getMessage());
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