import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента

        String regex = "[^0-9]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        String result = matcher.replaceAll("");
        String number;

        if (result.length() == 11 && result.charAt(0) == '7') {
            number = result;
        } else if (result.length() == 11 && result.charAt(0) == '8') {
            number = "7".concat(result.substring(1));
        } else if (result.length() == 10) {
            number = "7".concat(result);
        } else System.out.println("Неверный формат номера");
    }

    private static Map<Long, String> phoneBook;

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>();
    }

}