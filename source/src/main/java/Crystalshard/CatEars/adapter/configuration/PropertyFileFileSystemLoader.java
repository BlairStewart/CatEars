package Crystalshard.CatEars.adapter.configuration;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import static Crystalshard.CatEars.domain.LessCode.fmt;

public class PropertyFileFileSystemLoader implements PropertyFile {
    private Logger logger = Logger.getLogger(PropertyFileFileSystemLoader.class);
    private Properties properties;

    public PropertyFileFileSystemLoader(String propertyFileLocation) {
        this.properties = loadPropertyFileFromFS(propertyFileLocation);
    }

    private Properties loadPropertyFileFromFS(String propertyFileLocation) {
        InputStream input = null;
        Properties properties = new Properties();

        try {
            input = new FileInputStream(propertyFileLocation);
            properties.load(input);
            logger.info(fmt("Loaded property file from file system location: %s", propertyFileLocation));

        } catch (Exception ex) {
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
