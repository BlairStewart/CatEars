package crystalshard.catears.adapter.configuration;

import crystalshard.catears.domain.LessCode;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileClassLoader implements PropertyFile {

    private Logger logger = Logger.getLogger(PropertyFileClassLoader.class);
    private Properties properties;

    public PropertyFileClassLoader(String propertyFileLocation) {
        this.properties = loadPropertyFile(propertyFileLocation);
    }

    private Properties loadPropertyFile(String propertyFileLocation) {
        InputStream input = null;
        Properties properties = new Properties();

        try {
            input = getClass().getClassLoader().getResourceAsStream(propertyFileLocation);
            if (input == null) {
                logger.error(String.format("Unable to find property file at: %s", propertyFileLocation));
            }
            else {
                properties.load(input);
                logger.info(LessCode.fmt("Loaded property file from class location: %s", getClass().getClassLoader().getResource(propertyFileLocation).toString()));
            }
        }
        catch (IOException ex) {
            logger.error("There was a problem loading the properties file.", ex);
        }
        finally {
            if (input != null) {
                try {
                    input.close();
                }
                catch (IOException e) {
                    logger.error("There was a problem closing the properties file.", e);
                }
            }
        }

        return properties;
    }

    @Override
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}


