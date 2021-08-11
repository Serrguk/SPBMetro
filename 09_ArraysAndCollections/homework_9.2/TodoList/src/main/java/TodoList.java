import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todos = new ArrayList<>();

    public void add(String todo) {
        todos.add(todo);
        System.out.println("Добавлено дело \"" + todo + "\"");
    }

    public void add(int index, String todo) {
        // Если index не в пределе длины списка, то вызываем метод с одним параметром
        if (index < 0 || index > todos.size()) {
            add(todo);
        } else {
            todos.add(index, todo);
            System.out.printf("Добавлено дело \"%s\" на позицию с номером %d\n", todo, index);
        }
    }

    public void edit(String todo, int index) {
        // Заменяем дело, только если индекс существует в списке
        // В противном случае не делаем ничего
        if (index >= 0 && index < todos.size()) {
            String todoOld = todos.get(index);
            todos.set(index, todo);
            System.out.printf("Дело \"%s\" заменено на \"%s\"\n", todoOld, todo);
        }
    }

    public void delete(int index) {
        // Удаляем дело, только если индекс существует в списке
        // В противном случае не делаем ничего
        if (index >= 0 && index < todos.size()) {
            String todoRemove = todos.get(index);
            todos.remove(index);
            System.out.printf("Дело \"%s\" удалено\n", todoRemove);
        }
    }

    public ArrayList<String> getTodos() {
        // Просто возвращаем список
        return todos;
    }

}