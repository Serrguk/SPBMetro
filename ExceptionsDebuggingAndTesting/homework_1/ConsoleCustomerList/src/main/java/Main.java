import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Logger logger;
    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров\n" +
            "Type \"end\" to exit";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        logger = LogManager.getRootLogger();

        while (true) {

            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+", 2);
            try {
                switch (tokens[0]) {
                    case "add" -> executor.addCustomer(tokens[1]);
                    case "list" -> executor.listCustomers();
                    case "remove" -> executor.removeCustomer(tokens[1]);
                    case "count" -> System.out.println("There are " + executor.getCount() + " customers");
                    case "help" -> System.out.println(helpText);
                    case "end" -> {
                        return;
                    }
                    default -> System.out.println(COMMAND_ERROR);
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                System.out.println("Wrong format! Correct format example: add Василий Петров " +
                        "vasily.petrov@gmail.com +79215637722");
                logger.info("Неверный формат данных: " + Arrays.toString(tokens));
            } catch (EmailFormatException ex) {
                System.out.println(ex.getMessage());
                logger.info("Неверный email: " + Arrays.toString(tokens));
            } catch (PhoneNumberFormatException ex) {
                System.out.println(ex.getMessage());
                logger.info("Неверный формат номера телефона: " + Arrays.toString(tokens));
            }
        }
    }
}

