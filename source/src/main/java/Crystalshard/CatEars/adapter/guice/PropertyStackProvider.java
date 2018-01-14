package Crystalshard.CatEars.adapter.guice;

import Crystalshard.CatEars.adapter.configuration.OverridePropertyFileLocation;
import Crystalshard.CatEars.adapter.configuration.PropertyFileClassLoader;
import Crystalshard.CatEars.adapter.configuration.PropertyFileFileSystemLoader;
import Crystalshard.CatEars.adapter.configuration.PropertyStack;
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
