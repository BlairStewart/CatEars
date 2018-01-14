package crystalshard.catears.adapter.configuration;

import crystalshard.catears.domain.AppConfiguration;
import crystalshard.catears.domain.DatabaseType;
import com.google.inject.Inject;
import org.apache.log4j.Logger;

public class PropertyAppConfiguration implements AppConfiguration {

    private static Logger log = Logger.getLogger(PropertyAppConfiguration.class);

    private PropertyStack propertyStack;

    @Inject
    public PropertyAppConfiguration(PropertyStack propertyStack) {
        this.propertyStack = propertyStack;
    }

    @Override
    public DatabaseType getDatabaseType() {
        String property = this.propertyStack.getProperty("database.type");
        if (property.isEmpty()) {
            String message = "database.type was missing from property files, use (InMemory)";
            log.error(message);
            throw new InvalidPropertyException(message);
        }
        return DatabaseType.valueOf(property);
    }

    @Override
    public int getWebServerPort() {
        String property = this.propertyStack.getProperty("webserver.port");
        if (property.isEmpty()) {
            String message = "webserver.port was missing from property file, use (80, 8080, etc)";
            log.error(message);
            throw new InvalidPropertyException(message);
        }
        return Integer.valueOf(property);
    }

    @Override
    public String getWebServerStaticFileLocation() {
        String property = this.propertyStack.getProperty("webserver.staticfilelocation");
        if (property.isEmpty()) {
            String message = "webserver.staticfilelocation was missing from property file, use (/public)";
            log.error(message);
            throw new InvalidPropertyException(message);
        }
        return property;
    }

    @Override
    public int getAuthTokenLength() {
        String property = this.propertyStack.getProperty("authorization.tokenlength");
        if (property.isEmpty()) {
            String message = "authorization.tokenlength was missing from property file, use (100)";
            log.error(message);
            throw new InvalidPropertyException(message);
        }
        return Integer.valueOf(property);
    }
}
