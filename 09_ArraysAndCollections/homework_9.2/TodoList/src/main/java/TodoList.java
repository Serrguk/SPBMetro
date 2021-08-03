import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todos = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todos.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index < 0 || index > todos.size())
            System.out.println("Дело с таким индексом не существует");
        else todos.add(index, todo);
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < 0 || index > todos.size())
            System.out.println("Дело с таким индексом не существует");
        else todos.set(index, todo);
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < 0 || index > todos.size())
            System.out.println("Дело с таким индексом не существует");
        else todos.remove(index);
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todos;
    }

}