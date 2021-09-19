import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат ввода";
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
            String[] words = input.split(" ");

            if (words[0].equals("ADD") && words.length == 2) {
                emailList.add(words[1]);
            } else if (words[0].equals("LIST")) {
                if (emailList.emails.size() != 0) {        // Для наглядности сделаем проверку, пуст ли список
                    for (int i = 0; i < emailList.emails.size(); i++)
                        System.out.println(emailList.getSortedEmails().get(i));

                } else System.out.println("Список пуст");
            } else System.out.println(WRONG_EMAIL_ANSWER);
        }
    }
}
