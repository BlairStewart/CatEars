package Crystalshard.CatEars.adapter.guice;

import Crystalshard.CatEars.adapter.configuration.PropertyAppConfiguration;
import Crystalshard.CatEars.adapter.configuration.PropertyStack;
import Crystalshard.CatEars.domain.AppConfiguration;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class AppConfigurationProvider implements Provider<AppConfiguration> {

    private PropertyStack propertyStack;

    @Inject
    public AppConfigurationProvider(PropertyStack propertyStack) {
        this.propertyStack = propertyStack;
    }

    @Override
    public AppConfiguration get() {
        return new PropertyAppConfiguration(propertyStack);
    }
}
