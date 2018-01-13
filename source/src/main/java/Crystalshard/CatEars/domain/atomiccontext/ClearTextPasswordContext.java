package Crystalshard.CatEars.domain.atomiccontext;

public class ClearTextPasswordContext extends StringContext {

    public static ClearTextPasswordContext of(String value) {
        return new ClearTextPasswordContext(value);
    }

    protected ClearTextPasswordContext(String value) {
        super(value);
    }
}
