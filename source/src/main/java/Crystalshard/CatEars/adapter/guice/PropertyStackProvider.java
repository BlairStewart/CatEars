package crystalshard.catears.adapter.guice;

import crystalshard.catears.adapter.configuration.PropertyFileFileSystemLoader;
import crystalshard.catears.adapter.configuration.PropertyStack;
import crystalshard.catears.adapter.configuration.OverridePropertyFileLocation;
import crystalshard.catears.adapter.configuration.PropertyFileClassLoader;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class PropertyStackProvider implements Provider<PropertyStack> {

    private OverridePropertyFileLocation overridePropertyFileLocation;

    @Inject
    public PropertyStackProvider(OverridePropertyFileLocation overridePropertyFileLocation) {
        this.overridePropertyFileLocation = overridePropertyFileLocation;
    }

    @Override
    public PropertyStack get() {
        PropertyStack stack = new PropertyStack();
        if (!overridePropertyFileLocation.getLocation().isEmpty()) {
            stack.addPropertyFile(new PropertyFileFileSystemLoader(overridePropertyFileLocation.getLocation()));
        }
        stack.addPropertyFile(new PropertyFileClassLoader("prod.properties"));
        return stack;
    }
}
