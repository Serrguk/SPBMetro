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


        System.out.println("Бинарный поиск по списку: " + CoolNumbers.binarySearchInList(coolNumbers, "А555ЕХ132"));
        System.out.println("Простой поиск по списку: " + CoolNumbers.bruteForceSearchInList(coolNumbers, "А555ЕХ132"));


    }
}
