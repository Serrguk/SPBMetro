import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        while (true) {
            System.out.println("Введите команду: ");
            String input = new Scanner(System.in).nextLine();
            String[] inputWords = input.split(" ");
            String todo = "";
            int indexInput;

            if (input.equals("")) {
                break;
            } else if (inputWords[0].matches("[0-9]") && inputWords[1].equals("ADD")) {
                    indexInput = Integer.parseInt(inputWords[0]);
                    for (int i = 2; i < inputWords.length; i++) {
                        todo = todo.concat(inputWords[i]) + " ";
                    }
                    todoList.add(indexInput, todo.trim());
                    System.out.printf("Добавлено дело \"%s\"\n", todo.trim());

            } else if (inputWords[0].equals("ADD")) {
                for (int i = 1; i < inputWords.length; i++) {
                    todo = todo.concat(inputWords[i]) + " ";
                }
                todoList.add(todo.trim());
                System.out.printf("Добавлено дело \"%s\"\n", todo.trim());
            }
            else if (inputWords[0].equals("LIST")) {
                int countTodo = 1;
                for (String todoInList : todoList.getTodos()) {
                    System.out.println(countTodo + " - " + todoInList);
                    countTodo++;
                }
            } else if (inputWords[0].equals("EDIT")) {
                indexInput = Integer.parseInt(inputWords[1]);
                String todoOld = todoList.todos.get(indexInput);
                for (int i = 2; i < inputWords.length; i++) {
                    todo = todo.concat(inputWords[i]) + " ";
                }
                todoList.edit(todo.trim(), indexInput);
                System.out.println("Дело \"" + todoOld.trim() + "\" заменено на \"" + todo.trim() + "\"");
            } else if (inputWords[0].equals("DELETE")) {
                indexInput = Integer.parseInt(inputWords[1]);

                System.out.println("Дело " + todoList.todos.get(indexInput) + " удалено");
                todoList.delete(indexInput);
            }
        }
    }
}
