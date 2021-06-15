public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 300);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");
    }
}
