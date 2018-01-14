package Crystalshard.CatEars.adapter.guice;

import Crystalshard.CatEars.adapter.configuration.PropertyStack;
import Crystalshard.CatEars.adapter.spark.JsonResponseTransformer;
import Crystalshard.CatEars.domain.AppConfiguration;
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
