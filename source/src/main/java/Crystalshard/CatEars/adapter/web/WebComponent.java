package crystalshard.catears.adapter.web;

import crystalshard.catears.domain.AppConfiguration;
import crystalshard.catears.domain.Component;
import com.google.inject.Inject;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

public class WebComponent extends Component {

    private final AppConfiguration appConfiguration;
    private final HomeController homeController;

    @Inject
    public WebComponent(
            AppConfiguration appConfiguration,
            HomeController homeController) {
        this.appConfiguration = appConfiguration;
        this.homeController = homeController;
    }

    @Override
    public void boot() {
        port(appConfiguration.getWebServerPort());
        staticFileLocation(appConfiguration.getWebServerStaticFileLocation());
        homeController.register();
    }
}
