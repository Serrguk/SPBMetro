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

            String regex = "[^0-9]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            String result = matcher.replaceAll("");

            if (result.length() == 11 && result.charAt(0) == '7') System.out.println(result);
            else if (result.length() == 11 && result.charAt(0) == '8')
                System.out.println("7".concat(result.substring(1)));
            else if (result.length() == 10)
                System.out.println("7".concat(result));
            else System.out.println("Неверный формат номера");
        }
    }

}
