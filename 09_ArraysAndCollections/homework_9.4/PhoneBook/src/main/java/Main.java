public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("9050878379", "эБРАГИМ");

        PhoneBook.phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));


    }
}
