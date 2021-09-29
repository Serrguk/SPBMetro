import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            String input = scanner.nextLine();

            while (input.isEmpty()) {
                System.out.print("Вы ничего не ввели. Введите номер или имя: ");
                input = scanner.nextLine();
            }
            if (input.equals("-1"))
                break;

            else if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
            } else if (isDigit(input)) {                                   //Если ввели номер
                if (phoneBook.getNameByPhone(input).equals("")) {   //Если номера не существует
                    System.out.print("Такого номера в телефонной книге нет\nВведите имя абонента для номера \"" + input + "\": ");
                    String name = scanner.nextLine();
                    phoneBook.addContact(input, name);
                } else {
                    System.out.println(phoneBook.getNameByPhone(input));
                }
            } else if (!isDigit(input)) {
                if (phoneBook.getPhonesByName(input).isEmpty()) {
                    System.out.print("Такого имени в телефонной книге нет\nВведите номер телефона для абонента \"" + input + "\": ");
                    String phone = scanner.nextLine();
                    phoneBook.addContact(phone, input);
                } else {
                    System.out.println(phoneBook.getPhonesByName(input));
                }
            }
        }
    }

    private static boolean isDigit(String string) throws NumberFormatException {
        try {
            Long.parseLong(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
