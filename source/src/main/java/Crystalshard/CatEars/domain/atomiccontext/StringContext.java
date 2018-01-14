package crystalshard.catears.domain.atomiccontext;

import org.apache.commons.lang.builder.CompareToBuilder;

public abstract class StringContext extends Context<String> {

    protected StringContext(String value) {
        super(value);
    }

    @Override
    public int compareTo(Context<String> o) {
        return new CompareToBuilder()
                .append(getValue(), o.getValue())
                .toComparison();
    }

    public boolean equalsIgnoreCase(StringContext o) {
        return getValue().equalsIgnoreCase(o.getValue());
    }
}
