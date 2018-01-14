package crystalshard.catears.domain.identifier;

public abstract class AutoincrementIntegerId extends IntegerId {
    public AutoincrementIntegerId(Integer id) {
        super(id);
    }

    protected boolean validate(Integer id) {
        return (id != null && id > 0);
    }
}
