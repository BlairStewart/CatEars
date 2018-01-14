package crystalshard.catears.domain;

import crystalshard.catears.domain.atomiccontext.CatName;
import crystalshard.catears.domain.atomiccontext.TattooNumber;
import crystalshard.catears.domain.identifier.CatId;
import crystalshard.catears.domain.identifier.PersonId;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Cat {

    public static Cat forPersistance(CatName catName, CoatPattern coatPattern, DateOfBirth dateOfBirth, TattooNumber tattooNumber,
                                     Gender gender, PersonId currentPerson) {
        return new Cat(null, catName, coatPattern, dateOfBirth, tattooNumber, gender, currentPerson, null, null);
    }

    private final CatId catId;
    private final CatName name;
    private final CoatPattern coatPattern;
    private final DateOfBirth dateOfBirth;
    private final TattooNumber tattooNumber;
    private final Gender gender;
    private final PersonId currentPerson;
    private final DateTimeUtc createdDateUtc;
    private final DateTimeUtc updatedDateUtc;

    public Cat(CatId catId, CatName name, CoatPattern coatPattern, DateOfBirth dateOfBirth, TattooNumber tattooNumber,
               Gender gender, PersonId currentPerson, DateTimeUtc createdDateUtc, DateTimeUtc updatedDateUtc) {
        this.catId = catId;
        this.name = name;
        this.coatPattern = coatPattern;
        this.dateOfBirth = dateOfBirth;
        this.tattooNumber = tattooNumber;
        this.gender = gender;
        this.currentPerson = currentPerson;
        this.createdDateUtc = createdDateUtc;
        this.updatedDateUtc = updatedDateUtc;
    }

    public CatId getCatId() {
        return catId;
    }

    public CatName getName() {
        return name;
    }

    public CoatPattern getCoatPattern() {
        return coatPattern;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public TattooNumber getTattooNumber() {
        return tattooNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public PersonId getCurrentPerson() {
        return currentPerson;
    }

    public DateTimeUtc getCreatedDateUtc() {
        return createdDateUtc;
    }

    public DateTimeUtc getUpdatedDateUtc() {
        return updatedDateUtc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat that = (Cat) o;
        return new EqualsBuilder()
                .append(catId, that.catId)
                .append(name, that.name)
                .append(coatPattern, that.coatPattern)
                .append(dateOfBirth, that.dateOfBirth)
                .append(tattooNumber, that.tattooNumber)
                .append(gender, that.gender)
                .append(currentPerson, that.currentPerson)
                .append(createdDateUtc, that.createdDateUtc)
                .append(updatedDateUtc, that.updatedDateUtc)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(catId)
                .append(name)
                .append(coatPattern)
                .append(dateOfBirth)
                .append(tattooNumber)
                .append(gender)
                .append(currentPerson)
                .append(createdDateUtc)
                .append(updatedDateUtc)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("catId", catId)
                .append("name", name)
                .append("coatPattern", coatPattern)
                .append("dateOfBirth", dateOfBirth)
                .append("tattooNumber", tattooNumber)
                .append("gender", gender)
                .append("currentPerson", currentPerson)
                .append("createdDateUtc", createdDateUtc)
                .append("updatedDateUtc", updatedDateUtc)
                .toString();
    }
}
