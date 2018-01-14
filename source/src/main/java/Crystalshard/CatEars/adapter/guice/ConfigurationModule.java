package crystalshard.catears.adapter.guice;

import crystalshard.catears.adapter.configuration.PropertyStack;
import crystalshard.catears.domain.AppConfiguration;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import spark.ResponseTransformer;
import spark.TemplateEngine;

public class ConfigurationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PropertyStack.class).toProvider(PropertyStackProvider.class).in(Singleton.class);
        bind(AppConfiguration.class).toProvider(AppConfigurationProvider.class).in(Singleton.class);
        bind(ResponseTransformer.class).toProvider(ResponseTransformerProvider.class).in(Singleton.class);
        bind(TemplateEngine.class).toProvider(TemplateEngineProvider.class).in(Singleton.class);
    }
}
