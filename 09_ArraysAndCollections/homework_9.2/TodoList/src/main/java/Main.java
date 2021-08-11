import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        /*
        Программа работает в бесконечном цикле, с завершением, если введена пустая строка
         */
        while (true) {
            System.out.println("Введите команду: ");
            String input = new Scanner(System.in).nextLine();
            if (input.isEmpty())
                break;

            String[] inputWords = input.split(" "); // Для парсинга команды разбиваем введённую строку на массив по пробелу
            String todoText = ""; // В переменную todoText будем сохранять текст дела без команды и индекса

            // Следующий блок кода определяет, что сохранится в переменную todoText в зависимости от первого слова в строке
            //__________________________________________________________________________________
            if (inputWords[0].equals("ADD")) {
                for (int i = 1; i < inputWords.length; i++) {
                    todoText = todoText.concat(inputWords[i]) + " ";
                }
            } else if (inputWords[0].matches("[0-9]") || inputWords[0].equals("EDIT")) {
                for (int i = 2; i < inputWords.length; i++) {
                    todoText = todoText.concat(inputWords[i]) + " ";
                }
            }
            //__________________________________________________________________________________

            // Последний блок if-else производит вызов соответствующего метода работы со списком

            if ("ADD".equals(inputWords[0])) {
                todoList.add(todoText.trim());
            } else if (inputWords[0].matches("[0-9]")) {
                todoList.add(Integer.parseInt(inputWords[0]), todoText.trim());
            } else if ("LIST".equals(inputWords[0])) {
                int counterTodos = 0;
                for (String s : todoList.getTodos()) {
                    counterTodos++;
                    System.out.println(counterTodos + " - " + s);
                }
            } else if ("DELETE".equals(inputWords[0])) {
                todoList.delete(Integer.parseInt(inputWords[1]));
            } else if ("EDIT".equals(inputWords[0])) {
                todoList.edit(todoText.trim(), Integer.parseInt(inputWords[1]));
            }
        }
    }
}
