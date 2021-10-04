import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        try {
            if (!checkName(name).equals("") && checkNumber(phone) != 0) {
                phoneBook.put(checkNumber(phone), checkName(name));
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Неверные данные");
        }
    }

    private static Map<Long, String> phoneBook = new HashMap<>();

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
        TreeSet<String> stringThreeSet = new TreeSet<>();
        for (Map.Entry<Long, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(name)) {
                stringThreeSet.add(entry.getValue() + " - " + entry.getKey());
            }
        }
        return stringThreeSet;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> stringTreeSet = new TreeSet<>();
        phoneBook.forEach((key, value) -> stringTreeSet.add(value + " - " + key));
        return stringTreeSet;
    }

    public static long checkNumber(String number) {
        boolean check = true;
        String numberPhone = "";
        String regexNumber = "[^0-9]";

        if (number.isEmpty() || number.matches(regexNumber)) {
            check = false;
        } else {
            Pattern pattern = Pattern.compile(regexNumber);
            Matcher matcher = pattern.matcher(number);
            String result = matcher.replaceAll("");

            if (result.length() == 11 && result.charAt(0) == '7') {
                numberPhone = result;
            } else if (result.length() == 11 && result.charAt(0) == '8') {
                numberPhone = "7".concat(result.substring(1));
            } else if (result.length() == 10) {
                numberPhone = "7".concat(result);
            } else {
                check = false;
            }
        }
        if (check) {
            return Long.parseLong(numberPhone);
        } else return 0;
    }

    public static String checkName(String name) {
        String regexContact = "[А-я]+";
        if (!name.matches(regexContact) || name.isEmpty()) {
            return "";
        } else {
            return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase(Locale.ROOT);
        }
    }
}