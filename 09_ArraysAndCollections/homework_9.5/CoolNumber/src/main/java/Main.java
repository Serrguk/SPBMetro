import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска вводимого номера в консоль в каждой из структуры данных
     - проанализировать полученные данные
     */

    public static void main(String[] args) {

        // Х777УН22 -- используемый номер для поиска.
        List<String> list = CoolNumbers.generateCoolNumbers();

        boolean resultBruteForceSearch;
        long start = System.nanoTime();
        resultBruteForceSearch = CoolNumbers.bruteForceSearchInList(list, "Х777УН22");
        long stop = System.nanoTime();
        long leadTime = stop - start;
        System.out.println(resultBruteForceSearch ? "Поиск перебором: найден, время поиска " + leadTime + " нс" : "Поиск перебором: не найден, время поиска " + leadTime + " нс");

        Collections.sort(list); //Здесь сортируем лист?

        boolean resultBinarySearch;
        long startBinarySearch = System.nanoTime();
        resultBinarySearch = CoolNumbers.binarySearchInList(list, "Х777УН22");
        long stopBinarySearch = System.nanoTime();
        long leadTimeBinarySearch = stopBinarySearch - startBinarySearch;
        System.out.println(resultBinarySearch ? "Бинарный поиск: найден, время поиска " + leadTimeBinarySearch + " нс" : "Бинарный поиск: не найден, время поиска " + leadTimeBinarySearch + " нс");

        HashSet<String> stringHashSet = new HashSet<>(list);

        boolean resultSearchInHashSet;
        long startSearchInHashSet = System.nanoTime();
        resultSearchInHashSet = CoolNumbers.searchInHashSet(stringHashSet, "Х777УН22");
        long stopSearchInHashSet = System.nanoTime();
        long leadTimeSearchInHashSet = stopSearchInHashSet - startSearchInHashSet;
        System.out.println(resultSearchInHashSet ? "Поиск в HashSet: найден, время поиска " + leadTimeSearchInHashSet + " нс" : "Поиск в HashSet: не найден, время поиска " + leadTimeSearchInHashSet + " нс");

        TreeSet<String> stringTreeSet = new TreeSet<>(list);

        boolean resultSearchInTreeSet;
        long startSearchInTreeSet = System.nanoTime();
        resultSearchInTreeSet = CoolNumbers.searchInTreeSet(stringTreeSet, "Х777УН22");
        long stopSearchInTreeSet = System.nanoTime();
        long leadTimeSearchInTreeSet = stopSearchInTreeSet - startSearchInTreeSet;
        System.out.println(resultSearchInTreeSet ? "Поиск в TreeSet: найден, время поиска " + leadTimeSearchInTreeSet + " нс" : "Поиск в TreeSet: не найден, время поиска " + leadTimeSearchInTreeSet + " нс");
    }
}
