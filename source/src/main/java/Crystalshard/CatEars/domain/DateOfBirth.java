package crystalshard.catears.domain;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;
import org.joda.time.LocalDate;
import org.joda.time.chrono.ISOChronology;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateOfBirth {

    private static Logger logger = Logger.getLogger(DateOfBirth.class);

    private static String iso8601Regex = "([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
    private static Pattern iso8601Pattern = Pattern.compile(iso8601Regex);

    public static DateOfBirth fromString(String dateOfBirth) {
        Matcher matcher = iso8601Pattern.matcher(dateOfBirth);
        if (!matcher.matches()) {
            String message = LessCode.fmt("Attempted to create DateOfBirth from an invalid string: %s", dateOfBirth);
            logger.error(message);
            throw new InvalidDateOfBirthStringException(message);
        }
        return new DateOfBirth(
                Integer.valueOf(matcher.group(1)),
                Integer.valueOf(matcher.group(2)),
                Integer.valueOf(matcher.group(3)));
    }

    private LocalDate localDate;

    public DateOfBirth(int year, int month, int day) {
        localDate = new LocalDate(year, month, day, ISOChronology.getInstanceUTC());
    }

    public int getYear() {
        return localDate.getYear();
    }

    public int getMonthOfYear() {
        return localDate.getMonthOfYear();
    }

    public int getDayOfMonth() {
        return localDate.getDayOfMonth();
    }

    public boolean isBefore(DateOfBirth dateOfBirth) {
        return localDate.isBefore(dateOfBirth.localDate);
    }

    public boolean isAfter(DateOfBirth dateOfBirth) {
        return localDate.isAfter(dateOfBirth.localDate);
    }

    @Override
    public String toString() {
        return LessCode.fmt("%s-%s-%s",
                LessCode.padLeftZeros(Integer.toString(localDate.getYear()), 2),
                LessCode.padLeftZeros(Integer.toString(localDate.getMonthOfYear()), 2),
                LessCode.padLeftZeros(Integer.toString(localDate.getDayOfMonth()), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DateOfBirth that = (DateOfBirth) o;
        return localDate.isEqual(that.localDate);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(localDate)
                .toHashCode();
    }
}
