package Crystalshard.CatEars.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import static Crystalshard.CatEars.domain.LessCode.fmt;

public class MailingAddress {

    private String municipalAddressLine;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    public MailingAddress(String municipalAddressLine, String city, String province, String postalCode, String country) {
        this.municipalAddressLine = municipalAddressLine;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getMunicipalAddressLine() {
        return municipalAddressLine;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(municipalAddressLine)
                .append(city)
                .append(province)
                .append(postalCode)
                .append(country)
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
        MailingAddress that = (MailingAddress) o;
        return new EqualsBuilder()
                .append(municipalAddressLine, that.municipalAddressLine)
                .append(city, that.city)
                .append(province, that.province)
                .append(postalCode, that.postalCode)
                .append(country, that.country)
                .isEquals();
    }

    @Override
    public String toString() {
        return fmt("%s\n%s %s %s\n%s",
                municipalAddressLine, city, province, postalCode, country);
    }
}
