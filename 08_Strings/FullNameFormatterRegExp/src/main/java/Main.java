import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String regex = "[А-Я][а-я]+-?[а-я]+\\s[А-Я][а-я]+\\s[А-Я][а-я]+$";

      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);

      if (!matcher.find()) System.out.println("Введенная строка не является ФИО");
      else {
        String[] words = input.split(" ");
        System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s\n", words[0], words[1], words[2]);
      }
    }
  }

}