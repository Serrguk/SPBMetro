import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static final EmailList emailList = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO: write code here
            String regex = "\\w+@\\w+\\.[ru]*[com]*";
            String[] words = input.split(" ");

            if (words[0].equals("ADD") && words.length == 2) {
                if (words[1].toLowerCase(Locale.ROOT).matches(regex)) {
                    emailList.add(words[1].toLowerCase(Locale.ROOT));
                    System.out.println("Email внесён в список"); //Вывод для наглядности
                } else System.out.println(WRONG_EMAIL_ANSWER);
            } else if (words[0].equals("LIST")) {
                if (emailList.emails.size() != 0) {
                    for (String list : emailList.emails) {
                        System.out.println(list);
                    }
                } else System.out.println("Список пуст");
            } else System.out.println("Неверный формат ввода");
        }
    }
}
