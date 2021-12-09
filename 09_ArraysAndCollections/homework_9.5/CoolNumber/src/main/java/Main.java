import java.util.ArrayList;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска вводимого номера в консоль в каждой из структуры данных
     - проанализировать полученные данные
     */

    public static void main(String[] args) {
        ArrayList<String> coolNumbers = (ArrayList<String>) CoolNumbers.generateCoolNumbers();
        System.out.println(coolNumbers);
        System.out.println(CoolNumbers.binarySearchInList(coolNumbers, "А555ЕХ132"));
    }
}
