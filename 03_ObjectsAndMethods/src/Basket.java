public class Basket {
    private static String items = "";

    public static void main(String[] args) {
        add("Колбаса", 85);
        add("Молоко", 60);
        add("Масло", 120);
        print("Содержимое корзины: ");
        clear();
        print("Содержимое корзины: ");
    }

    public static void add(String name, int price) {
        items = items + name + " - " + price + "\n";
    }

    public static void clear() {
        items = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty())
            System.out.println("Корзина пуста");
        else
            System.out.println(items);
    }
}
