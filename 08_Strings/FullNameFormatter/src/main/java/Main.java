import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            // Разбивка введённой строки на ФИО
            char[] inputCharArray = input.trim().toCharArray(); //Складываем инпут в массив символов
            int spaceCount = 0; //инициализируем счётчик пробелов
            boolean isDigit = false; //инициализируем проверку на цифры
            for (char c : inputCharArray) { // проходим по массиву циклом форич
                if (c == ' ')
                    spaceCount++; //считаем пробелы
                if (Character.isDigit(c))
                    isDigit = true; //проверяем, есть ли цифры
            }
            if (spaceCount != 2 || isDigit) { //если пробелов не два или в строке есть цифры, выводим строку с ошибкой
                System.out.println("Введенная строка не является ФИО");
            } else {

                int firstSpace = input.indexOf(' '); // определяем, где первый пробел
                int secondSpace = input.lastIndexOf(' '); //определяем, где второй пробел
                String lastName = input.substring(0, firstSpace).trim(); // фамилия - с начала строки до первого пробела
                String name = input.substring(firstSpace, secondSpace).trim(); // имя - от первого до второго пробела
                String middleName = input.substring(secondSpace).trim(); // отчество - от второго пробела до конца строки

                System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s", lastName, name, middleName); //Вывод в нужном формате
            }

        }
    }

}