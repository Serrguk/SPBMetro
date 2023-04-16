import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws PhoneNumberFormatException, EmailFormatException {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException();
        }
        if (!checkEmail(components[2])) {
            throw new EmailFormatException("Wrong format email!");
        }
        if (!checkPhoneNumber(components[3])) {
            throw new PhoneNumberFormatException("Wrong format number phone!");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }

    private boolean checkPhoneNumber(String number) {
        return number.matches("\\+?[0-9]+")
                && number.length() <= 12
                && number.length() >= 10
                && (number.length() != 12 || number.charAt(0) == '+');
    }
    private boolean checkEmail(String email) {
        return email.matches("[a-z]+@[a-z]+.com|[a-z]+@[a-z]+.ru");
    }
}