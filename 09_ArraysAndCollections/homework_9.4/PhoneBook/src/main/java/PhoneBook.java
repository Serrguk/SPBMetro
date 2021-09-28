import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента

        String regexNumber = "[^0-9]";
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher matcher = pattern.matcher(phone);
        String result = matcher.replaceAll("");
        String numberPhone = "0";

        boolean correctInput = true;

        if (result.length() == 11 && result.charAt(0) == '7') {
            numberPhone = result;
        } else if (result.length() == 11 && result.charAt(0) == '8') {
            numberPhone = "7".concat(result.substring(1));
        } else if (result.length() == 10) {
            numberPhone = "7".concat(result);
        } else correctInput = false;
        long resultNumber = Long.parseLong(numberPhone);

        String regexContact = "[А-я]+";
        String resultName = null;
        if (name.matches(regexContact)) {
            resultName = name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase(Locale.ROOT);
        } else correctInput = false;

        if (correctInput) {
        phoneBook.put(resultNumber, resultName);
            System.out.println(resultName + ": Контакт добавлен");
        } else System.out.println("Неверный формат ввода. Контакт добавлен не будет");
    }

    public static Map<Long, String> phoneBook = new HashMap<>();

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        Long number = Long.parseLong(phone);
        if (phoneBook.containsKey(number)) {
            return phoneBook.get(number) + " - " + number;
        } else return "";
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        phoneBook.forEach((key, value) -> stringTreeSet.add(value + " - " + key));
        return stringTreeSet;
    }

}