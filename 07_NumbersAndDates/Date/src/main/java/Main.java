import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E").localizedBy(Locale.ENGLISH);
        int birthdayCount = 0;
        StringBuilder text = new StringBuilder();

        while (today.isAfter(birthday) || today.isEqual(birthday)) {
            text.append(birthdayCount).append(" - ").append(formatter.format(birthday)).append(System.lineSeparator());
            birthdayCount++;
            birthday = birthday.plusYears(1);
        }
        return text.toString();
    }
}
