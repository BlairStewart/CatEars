package crystalshard.catears.adapter.spark;

import crystalshard.catears.adapter.web.views.ViewEnvelope;
import spark.Request;
import spark.Response;
import spark.Route;

public abstract class RouteHandler<T> implements Route {

    @Override
    public Object handle(Request request, Response response) {
        response.header("Content-Type", "application/json");
        try {
            validate(request);
            return ViewEnvelope.of(process(request));
        }
        catch (NotFoundException ex) {
            response.status(404);
            return ExceptionEnvelope.of(ex);
        }
        catch (Exception ex) {
            response.status(500);
            return ExceptionEnvelope.of(ex);
        }
    }

    protected abstract void validate(Request request);

    protected abstract T process(Request request);
}
