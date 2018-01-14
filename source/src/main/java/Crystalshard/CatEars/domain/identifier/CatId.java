package crystalshard.catears.domain.identifier;

public class CatId extends AutoincrementIntegerId {

    public static CatId of(Integer id) {
        return new CatId(id);
    }

    protected CatId(Integer id) {
        super(id);
    }
}
