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

            } else if (!PhoneBook.checkName(input).equals("")) {
                String name = PhoneBook.checkName(input);
                if (phoneBook.getPhonesByName(name).isEmpty()) {
                    System.out.printf("Такого имени нет в списке контактов\nВведите номер для контакта %s: ", name);
                    input = scanner.nextLine();
                    if (PhoneBook.checkNumber(input) != 0) {
                        long phone = PhoneBook.checkNumber(input);
                        String phoneString = String.valueOf(phone);
                        if (phoneBook.getNameByPhone(phoneString).equals("")) {
                            phoneBook.addContact(phoneString, name);
                            System.out.printf("Контакт %s сохранён!\n", name);
                        } else {
                            String oldName = phoneBook.getNameByPhone(phoneString);
                            phoneBook.addContact(phoneString, name);
                            System.out.printf("Такой номер был найден, поэтому контакт %s перезаписан на %s!\n", oldName, name);
                        }
                    } else System.out.println("Неверно введённый номер");
                } else System.out.println(phoneBook.getPhonesByName(name));
            } else if (PhoneBook.checkNumber(input) != 0) {
                long number = PhoneBook.checkNumber(input);
                String phoneString = String.valueOf(number);
                if (phoneBook.getNameByPhone(phoneString).isEmpty()) {
                    System.out.printf("Такого номера нет в списке контактов\nВведите имя для номера %s: ", phoneString);
                    input = scanner.nextLine();
                    if (!PhoneBook.checkName(input).equals("")) {
                        String name = PhoneBook.checkName(input);
                        if (phoneBook.getPhonesByName(name).isEmpty()) {
                            phoneBook.addContact(phoneString, name);
                            System.out.printf("Контакт %s сохранён!\n", name);
                        } else {
                            System.out.println("Контакт найден: " + phoneBook.getPhonesByName(name));
                        }
                    } else System.out.println("Неверно введённое имя");
                } else {
                    System.out.println(phoneBook.getNameByPhone(phoneString));
                }
            } else System.out.println("Неверно введённые данные");
        }
    }
}
