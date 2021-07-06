import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7899 рубля, а Маша - 30000 рублей";
    System.out.println(calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text){
    String regex = "[0-9]+";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);

    int sum = 0;
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      sum = sum + Integer.parseInt(text.substring(start, end));
    }
    return sum;
  }

}