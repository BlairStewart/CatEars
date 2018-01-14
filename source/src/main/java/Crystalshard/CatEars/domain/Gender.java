package crystalshard.catears.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Gender {

    public static Gender MALE = new Gender(true);
    public static Gender FEMALE = new Gender(false);

    private boolean isMale;

    private Gender(boolean isMale) {
        this.isMale = isMale;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(isMale)
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
        Gender that = (Gender) o;
        return new EqualsBuilder()
                .append(isMale, that.isMale)
                .isEquals();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("isMale", isMale)
                .toString();
    }
}
