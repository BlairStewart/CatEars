package crystalshard.catears.adapter.guice;

import crystalshard.catears.adapter.configuration.PropertyStack;
import crystalshard.catears.domain.AppConfiguration;
import crystalshard.catears.adapter.configuration.PropertyAppConfiguration;
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
