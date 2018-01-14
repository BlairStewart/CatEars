package crystalshard.catears.adapter.web;

import com.google.inject.Inject;
import spark.ModelAndView;
import spark.Spark;
import spark.TemplateEngine;
import spark.TemplateViewRoute;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.path;

public class HomeController extends TemplateController {

    private TemplateEngine templateEngine;

    @Inject
    public HomeController(TemplateEngine templateEngine) {
        super(templateEngine);
    }

    @Override
    public void register() {

        Spark.before((req, res) -> {
            String path = req.pathInfo();
            if (path.endsWith("/") && !path.equals("/")) {
                res.redirect(path.substring(0, path.length() - 1));
            }
        });

        path("/", () -> {
            get("/", (TemplateViewRoute) (request, response) -> {
                Map<String, Object> model = new HashMap<>();
                model.put("firstName", "First");
                model.put("lastName", "Last");

                return new ModelAndView(model, "angular.vm");
            });
        });

    }
}

