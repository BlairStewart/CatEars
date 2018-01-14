package crystalshard.catears.domain;

import crystalshard.catears.domain.atomiccontext.CoatPatternName;
import crystalshard.catears.domain.identifier.CoatPatternId;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CoatPattern {

    public static CoatPattern forPersistance(CoatPatternName name) {
        return new CoatPattern(null, name, null, null);
    }

    private final CoatPatternId coatPatternId;
    private final CoatPatternName name;
    private final DateTimeUtc createdDateUtc;
    private final DateTimeUtc updatedDateUtc;

    public CoatPattern(CoatPatternId coatPatternId, CoatPatternName name, DateTimeUtc createdDateUtc,
                       DateTimeUtc updatedDateUtc) {
        this.coatPatternId = coatPatternId;
        this.name = name;
        this.createdDateUtc = createdDateUtc;
        this.updatedDateUtc = updatedDateUtc;
    }

    public CoatPatternId getCoatPatternId() {
        return coatPatternId;
    }

    public CoatPatternName getName() {
        return name;
    }

    public DateTimeUtc getCreatedDateUtc() {
        return createdDateUtc;
    }

    public DateTimeUtc getUpdatedDateUtc() {
        return updatedDateUtc;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(coatPatternId)
                .append(name)
                .append(createdDateUtc)
                .append(updatedDateUtc)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoatPattern that = (CoatPattern) o;
        return new EqualsBuilder()
                .append(coatPatternId, that.coatPatternId)
                .append(name, that.name)
                .append(createdDateUtc, that.createdDateUtc)
                .append(updatedDateUtc, that.updatedDateUtc)
                .isEquals();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("coatPatternId", coatPatternId)
                .append("name", name)
                .append("createdDateUtc", createdDateUtc)
                .append("updatedDateUtc", updatedDateUtc)
                .toString();
    }
}
