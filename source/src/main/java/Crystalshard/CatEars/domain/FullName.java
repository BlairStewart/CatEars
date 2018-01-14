package Crystalshard.CatEars.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import static Crystalshard.CatEars.domain.LessCode.fmt;

public class FullName {

    public static FullName fromString(String fullName) {
        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");
        if (firstSpaceIndex == lastSpaceIndex) {
            return new FullName(fullName.substring(0, firstSpaceIndex), "", fullName.substring(firstSpaceIndex + 1));
        }
        return new FullName(fullName.substring(0, firstSpaceIndex), fullName.substring(firstSpaceIndex + 1, lastSpaceIndex), fullName.substring(lastSpaceIndex + 1));
    }

    private String firstName;
    private String middleName;
    private String lastName;

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(firstName)
                .append(middleName)
                .append(lastName)
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
        FullName that = (FullName) o;
        return new EqualsBuilder()
                .append(firstName, that.firstName)
                .append(middleName, that.middleName)
                .append(lastName, that.lastName)
                .isEquals();
    }

    @Override
    public String toString() {
        if (middleName.isEmpty()) {
            return fmt("%s %s", firstName, lastName);
        }
        return fmt("%s %s %s", firstName, middleName, lastName);
    }
}
