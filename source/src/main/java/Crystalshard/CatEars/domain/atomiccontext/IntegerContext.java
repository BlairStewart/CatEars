package crystalshard.catears.domain.atomiccontext;

import org.apache.commons.lang.builder.CompareToBuilder;

public class IntegerContext extends Context<Integer> {

    protected IntegerContext(Integer value) {
        super(value);
    }

    @Override
    public int compareTo(Context<Integer> o) {
        return new CompareToBuilder()
                .append(getValue(), o.getValue())
                .toComparison();
    }

}
