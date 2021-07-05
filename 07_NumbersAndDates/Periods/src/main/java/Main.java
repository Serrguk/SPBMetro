import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        System.out.println(getPeriodFromBirthday(LocalDate.of(1970, 1, 1)));

    }

    private static String getPeriodFromBirthday(LocalDate birthday) {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthday, now);
        return String.format( "%d years, %d months, %d days", diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
