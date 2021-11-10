import java.util.Scanner;

public class Main {
    public static String input;

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер, имя или команду: ");
            input = scanner.nextLine();
            while (input.isEmpty()) {
                System.out.print("Вы ничего не ввели. Введите номер, имя или команду: ");
                input = scanner.nextLine();
            }
            if (input.equals("EXIT")) {
                break;
            } else if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());

            } else {
                try {
                    if (PhoneBook.isNumber(input)) {
                        String phoneContact = PhoneBook.parseNumber(input);
                        String nameContact = phoneBook.getNameByPhone(phoneContact);
                        if (nameContact.isEmpty()) {
                            System.out.printf("Такого номера нет в списке контактов\nВведите имя для номера %s: ", phoneContact);
                            input = scanner.nextLine();
                            nameContact = PhoneBook.parseName(input);
                            phoneBook.addContact(phoneContact, nameContact);
                            System.out.printf("Контакт %s сохранён\n", nameContact);
                        } else {
                            System.out.println("Контакт найден: " + nameContact);
                        }
                    } else if (PhoneBook.isName(input)) {
                        String nameContact = PhoneBook.parseName(input);
                        if (phoneBook.getPhonesByName(nameContact).isEmpty()) {
                            System.out.printf("Такого имени нет в списке контактов\nВведите номер для контакта %s: ", nameContact);
                            input = scanner.nextLine();
                            String phoneContact = PhoneBook.parseNumber(input);
                            phoneBook.addContact(phoneContact, nameContact);
                            System.out.printf("Контакт %s сохранён\n", nameContact);
                        } else {
                            System.out.println("Контакт найден: " + nameContact);
                        }
                    } else {
                        System.out.println("Неверная команда");
                    }
                } catch (InvalidArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
