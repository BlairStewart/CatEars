package Crystalshard.CatEars.domain.identifier;

public class PersonId extends AutoincrementIntegerId {

    public static PersonId of(Integer id) {
        return new PersonId(id);
    }

    protected PersonId(Integer id) {
        super(id);
    }
}
