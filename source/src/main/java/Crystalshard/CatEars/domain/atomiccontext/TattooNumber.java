package crystalshard.catears.domain.atomiccontext;

public class TattooNumber extends IntegerContext {

    public static TattooNumber of(Integer number) {
        return new TattooNumber(number);
    }

    protected TattooNumber(Integer value) {
        super(value);
    }
}
