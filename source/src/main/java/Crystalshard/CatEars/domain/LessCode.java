package crystalshard.catears.domain;

public class LessCode {
    public static String fmt(String stringToFormat, String... args) {
        return String.format(stringToFormat, args);
    }

    public static String padLeftZeros(String number, int digits) {
        return String.format("%1$" + digits + "s", number).replace(' ', '0');
    }
}
