package Crystalshard.CatEars.domain;

import Crystalshard.CatEars.domain.identifier.PersonId;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Person {

    public static Person forPersistance(FullName fullName, MailingAddress mailingAddress, PhoneNumber home,
                                        PhoneNumber work, PhoneNumber mobile, Email email) {
        return new Person(null, fullName, mailingAddress, home, work, mobile, email, null, null);
    }

    private final PersonId personId;
    private final FullName fullName;
    private final MailingAddress address;
    private final PhoneNumber homeNumber;
    private final PhoneNumber workNumber;
    private final PhoneNumber mobileNumber;
    private final Email email;
    private final DateTimeUtc createdDateUtc;
    private final DateTimeUtc updatedDateUtc;

    public Person(PersonId personId, FullName fullName, MailingAddress address, PhoneNumber homeNumber,
                  PhoneNumber workNumber, PhoneNumber mobileNumber, Email email, DateTimeUtc createdDateUtc,
                  DateTimeUtc updatedDateUtc) {
        this.personId = personId;
        this.fullName = fullName;
        this.address = address;
        this.homeNumber = homeNumber;
        this.workNumber = workNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.createdDateUtc = createdDateUtc;
        this.updatedDateUtc = updatedDateUtc;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public MailingAddress getAddress() {
        return address;
    }

    public PhoneNumber getHomeNumber() {
        return homeNumber;
    }

    public PhoneNumber getWorkNumber() {
        return workNumber;
    }

    public PhoneNumber getMobileNumber() {
        return mobileNumber;
    }

    public Email getEmail() {
        return email;
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
                .append(personId)
                .append(fullName)
                .append(address)
                .append(homeNumber)
                .append(workNumber)
                .append(mobileNumber)
                .append(email)
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
        Person that = (Person) o;
        return new EqualsBuilder()
                .append(personId, that.personId)
                .append(fullName, that.fullName)
                .append(address, that.address)
                .append(homeNumber, that.homeNumber)
                .append(workNumber, that.workNumber)
                .append(mobileNumber, that.mobileNumber)
                .append(email, that.email)
                .append(createdDateUtc, that.createdDateUtc)
                .append(updatedDateUtc, that.updatedDateUtc)
                .isEquals();

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("personId", personId)
                .append("fullName", fullName)
                .append("address", address)
                .append("homeNumber", homeNumber)
                .append("workNumber", workNumber)
                .append("mobileNumber", mobileNumber)
                .append("email", email)
                .append("createdDateUtc", createdDateUtc)
                .append("updatedDateUtc", updatedDateUtc)
                .toString();
    }
}
