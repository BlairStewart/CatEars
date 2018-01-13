package Crystalshard.CatEars.adapter.web;

import spark.Route;
import spark.Spark;

public abstract class Controller {

    protected void get(String path, Route route) {
        Spark.get(path, route);
    }

    protected void post(String path, Route route) {
        Spark.post(path, route);
    }

    protected void put(String path, Route route) {
        Spark.put(path, route);
    }

    protected void delete(String path, Route route) {
        Spark.delete(path, route);
    }

    protected void patch(String path, Route route) {
        Spark.patch(path, route);
    }

    public abstract void register();
}
