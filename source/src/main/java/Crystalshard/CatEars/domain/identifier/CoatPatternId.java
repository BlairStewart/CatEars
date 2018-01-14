package crystalshard.catears.domain.identifier;

public class CoatPatternId extends AutoincrementIntegerId {

    public static CoatPatternId of(Integer id) {
        return new CoatPatternId(id);
    }

    protected CoatPatternId(Integer id) {
        super(id);
    }
}
