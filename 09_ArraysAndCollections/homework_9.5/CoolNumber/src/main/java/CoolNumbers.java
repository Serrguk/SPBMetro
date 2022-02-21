import java.util.*;

public class CoolNumbers {
    private static final String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

    public static List<String> generateCoolNumbers() {
        String coolNumber;
        List<String> coolNumbers = new ArrayList<>();
        String letter;
        String letter1;
        String letter2;
        String digit;
        int regionInteger;
        String region;

        for (int i = 0; i < 2_000_001; i++) {
            letter = letters[(int) (Math.random() * letters.length)];
            letter1 = letters[(int) (Math.random() * letters.length)];
            letter2 = letters[(int) (Math.random() * letters.length)];
            digit = String.valueOf((int) (Math.random() * 9));
            regionInteger = (int) (1 + Math.random() * 198);

            if (regionInteger < 10) {
                region = "0" + regionInteger;
            } else region = String.valueOf(regionInteger);

            coolNumber = letter.concat(digit).concat(digit).concat(digit).concat(letter1).concat(letter2).concat(region);
            coolNumbers.add(coolNumber);
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long start = System.nanoTime();
        long finish;
        for (String s : list) {
            if (s.equals(number)) {
                finish = System.nanoTime();
                System.out.println("Время поиска: " + (finish - start) + " наносекунд");
                return true;
            }
        }
        finish = System.nanoTime();
        System.out.println("Время поиска: " + (finish - start) + " наносекунд");
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        int min = 0;
        int max = sortedList.size() - 1;
        int middle;
        String temp;
        long start = System.nanoTime();
        long finish;
        while (min <= max) {
            middle = min + max;
            temp = sortedList.get(middle);
            if (temp.equals(number)) {
                finish = System.nanoTime();
                System.out.println("Время поиска: " + (finish - start) + " наносекунд");
                return true;
            }
            if (temp.compareTo(number) > 0)
                max = middle - 1;
            else min = middle + 1;
        }
        finish = System.nanoTime();
        System.out.println("Время поиска: " + (finish - start) + " наносекунд");
        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long start = System.nanoTime();
        long finish;
        for (String s : hashSet) {
            if (s.equals(number)) {
                finish = System.nanoTime();
                System.out.println("Время поиска: " + (finish - start) + " наносекунд");
                return true;
            }
        }
        finish = System.nanoTime();
        System.out.println("Время поиска: " + (finish - start) + " наносекунд");
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long start = System.nanoTime();
        long finish;
        for (String s : treeSet) {
            if (s.equals(number)) {
                finish = System.nanoTime();
                System.out.println("Время поиска: " + (finish - start) + " наносекунд");
                return true;
            }
        }
        finish = System.nanoTime();
        System.out.println("Время поиска: " + (finish - start) + " наносекунд");
        return false;
    }

}
