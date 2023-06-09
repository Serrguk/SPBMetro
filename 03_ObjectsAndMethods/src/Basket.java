public class Basket {
    private String items;
    private int totalPrice;
    private int limit;
    private double weight = 0;
    private static double totalWeight;
    private static int allTotalPrice;

    public Basket() {
        items = "Список товаров: ";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price >= limit)
            return;
        items = items + name + " - " + count + " шт. - " + price + "\n";
        totalPrice = totalPrice + count * price;
        allTotalPrice = allTotalPrice + totalPrice;
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1);
        this.weight = this.weight + weight;
        totalWeight = totalWeight + weight;
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        this.weight = this.weight + count * weight;
        totalWeight = totalWeight + weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        weight = 0;
        totalWeight = 0;
        allTotalPrice = 0;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public static int getAllTotalPrice() {
        return allTotalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty())
            System.out.println("Корзина пуста");
        else
            System.out.println(items);
    }
}
