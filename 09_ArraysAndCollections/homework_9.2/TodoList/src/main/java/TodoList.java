import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todos = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todos.add(todo);
        System.out.println("Добавлено дело \"" + todo + "\"");
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index < 0 || index > todos.size()) {
            add(todo);
        } else {
            todos.add(index, todo);
            System.out.printf("Добавлено дело \"%s\" на позицию с номером %d", todo, index);
        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index >= 0 && index < todos.size()) {
            String todoOld = todos.get(index);
            todos.set(index, todo);
            System.out.printf("Дело \"%s\" заменено на \"%s\"\n", todoOld, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >= 0 && index < todos.size()) {
            String todoRemove = todos.get(index);
            todos.remove(index);
            System.out.printf("Дело \"%s\" удалено\n", todoRemove);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todos;
    }

}