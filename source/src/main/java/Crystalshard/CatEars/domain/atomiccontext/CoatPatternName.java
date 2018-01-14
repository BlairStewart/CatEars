package crystalshard.catears.domain.atomiccontext;

public class CoatPatternName extends StringContext {

    public static CoatPatternName of(String name) {
        return new CoatPatternName(name);
    }

    protected CoatPatternName(String value) {
        super(value);
    }
}
