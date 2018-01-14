package Crystalshard.CatEars.adapter.guice;

import Crystalshard.CatEars.domain.AppConfiguration;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.apache.velocity.app.VelocityEngine;
import spark.TemplateEngine;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.Properties;

public class TemplateEngineProvider implements Provider<TemplateEngine> {

    private final AppConfiguration appConfiguration;

    @Inject
    public TemplateEngineProvider(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @Override
    public TemplateEngine get() {
        return new VelocityTemplateEngine(getVelocityEngine());
    }

    private VelocityEngine getVelocityEngine() {
        VelocityEngine velocityEngine = new VelocityEngine();
        Properties properties = new Properties();
        properties.setProperty("resource.loader", "class");
        properties.setProperty(
                "class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        velocityEngine.init(properties);
        return velocityEngine;
    }
}

