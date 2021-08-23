import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emails = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется
        emails.add(email);
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(emails);
    }

}
