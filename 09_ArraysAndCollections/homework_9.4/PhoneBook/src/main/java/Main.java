public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("(905) 087-83-79", "эБРАГИМ");
        phoneBook.addContact("(907-83-79", "эБРАГИМ");
        phoneBook.addContact("(905) 087-83-79", "эslj");
        phoneBook.addContact("(905) 087-83-79", "53");
        phoneBook.addContact("(905) 087-83-63", "чуи");
        phoneBook.addContact("(905) 087-35-63", "степан");

        PhoneBook.phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println();
        phoneBook.addContact("(905) 087-83-79", "Костян");

        PhoneBook.phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println(phoneBook.getNameByPhone("79050878379"));

    }
}
