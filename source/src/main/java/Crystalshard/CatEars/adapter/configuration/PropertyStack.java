package crystalshard.catears.adapter.configuration;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static crystalshard.catears.domain.LessCode.fmt;

public class PropertyStack {

    private static Logger log = Logger.getLogger(PropertyStack.class);

    private List<PropertyFile> propertyFiles;

    public PropertyStack() {
        propertyFiles = new ArrayList<>();
    }

    public PropertyStack addPropertyFile(PropertyFile propertyFile) {
        this.propertyFiles.add(propertyFile);
        return this;
    }

    public String getProperty(String key) {
        for (PropertyFile propertyFile : propertyFiles) {
            String value = propertyFile.getProperty(key);
            if (!value.isEmpty()) {
                return value;
            }
        }
        String message = fmt("Requested property key that was not defined: %s", key);
        log.warn(message);
        return "";
    }
}
