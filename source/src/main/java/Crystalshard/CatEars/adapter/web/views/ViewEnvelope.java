package Crystalshard.CatEars.adapter.web.views;

public class ViewEnvelope {

    public static ViewEnvelope EMPTY = new ViewEnvelope();

    public static ViewEnvelope of(Object results) {
        ViewEnvelope ve = new ViewEnvelope();
        ve.results = results;
        return ve;
    }

    private Object results;
}
