public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 300);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket("Стол", 5000);
        Basket chuBasket = new Basket();
        chuBasket.add("Люк", 300, 2, 33.7);

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");

        chuBasket.print("Корзина Чу: ");

        System.out.println("Общий вес всех корзин: " + Basket.getTotalWeight());
        System.out.println("Общая стоимость всех корзин: " + Basket.getAllTotalPrice());
    }
}
