package crystalshard.catears.adapter.web;

import spark.ResponseTransformer;
import spark.Route;
import spark.Spark;

public abstract class ApiController extends Controller {

    private ResponseTransformer responseTransformer;

    protected ApiController(ResponseTransformer responseTransformer) {
        this.responseTransformer = responseTransformer;
    }

    @Override
    protected void get(String path, Route route) {
        Spark.get(path, route, this.responseTransformer);
    }

    @Override
    protected void post(String path, Route route) {
        Spark.post(path, route, this.responseTransformer);
    }

    @Override
    protected void delete(String path, Route route) {
        Spark.delete(path, route, this.responseTransformer);
    }

    @Override
    protected void patch(String path, Route route) {
        Spark.patch(path, route, this.responseTransformer);
    }

    @Override
    protected void put(String path, Route route) {
        Spark.put(path, route, this.responseTransformer);
    }
}
