import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emails = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется
        String regex = "\\w+@\\w+\\.(ru|com)";
        String emailLC = email.toLowerCase(Locale.ROOT); //Сделаем отдельную переменную для нужного формата
        if (emailLC.matches(regex)) {
            emails.add(emailLC);
            System.out.println("Email добавлен в список"); //Для наглядности пусть выводится сообщение
        } else System.out.println("Неверный формат email");
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(emails);
    }

}
