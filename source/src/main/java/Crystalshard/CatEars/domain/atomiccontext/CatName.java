package crystalshard.catears.domain.atomiccontext;

public class CatName extends StringContext {

    public static CatName of(String name) {
        return new CatName(name);
    }

    protected CatName(String value) {
        super(value);
    }
}
