import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер, имя или команду: ");
        while (true) {
            String input = scanner.nextLine();

            while (input.isEmpty()) {
                System.out.print("Вы ничего не ввели. Введите номер или имя: ");
                input = scanner.nextLine();
            }
            if (input.equals("EXIT"))
                break;

            else if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
            } else if (isDigit(input)) {                                //Если ввели номер
                if (PhoneBook.checkNumber(input) != 0) {
                    if (phoneBook.getNameByPhone(input).equals("")) {   //Если номера не существует
                        System.out.print("Такого номера в телефонной книге нет\n" +
                                "Введите имя абонента для номера \"" + input + "\": ");
                        String name = scanner.nextLine();
                        if (phoneBook.getPhonesByName(name).isEmpty()) {
                            phoneBook.addContact(input, name);
                        } else
                            System.out.println(phoneBook.getPhonesByName(name));
                    } else {
                        System.out.println(phoneBook.getNameByPhone(input));
                    }
                } else {
                    System.out.println("Неверно введённый номер");
                }
            } else if (!isDigit(input)) {
                if (!PhoneBook.checkName(input).equals("")) {
                    if (phoneBook.getPhonesByName(input).isEmpty()) {
                        System.out.print("Такого имени в телефонной книге нет\nВведите номер телефона для абонента \"" + input + "\": ");
                        String phone = scanner.nextLine();
                        if (phoneBook.getNameByPhone(phone).equals("")) {
                            phoneBook.addContact(phone, input);
                        } else System.out.println(phoneBook.getNameByPhone(phone));
                    } else {
                        System.out.println(phoneBook.getPhonesByName(input));
                    }
                } else {
                    System.out.println("Неверно введённое имя. Используйте кириллицу");
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
