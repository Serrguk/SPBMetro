import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
            char[] inputCharArray = input.trim().toCharArray();
            int spaceCount = 0;
            for (char c : inputCharArray) {
                if (c == ' ')
                    spaceCount++;
            }
            if (spaceCount != 2) {
                System.out.println("Введённая строка не является ФИО");
            }
        }
    }
}