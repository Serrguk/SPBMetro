public class Main {
    public static void main(String[] args) {
        /*
        Как передать в классы сотрудников в метода начисления зарплаты
        информацию о доходе компании?
        Как у сотрудника узнавать его компанию?
        Как уволить сотрудника?
         */

        Company google = new Company(500_000_000D);
        TopManager ivanPetrov = new TopManager("Иван Петров", 300_000, google);
        google.hire(ivanPetrov);

        System.out.println(google.getIncome());
        System.out.println(google.showStaff());

        google.hire(new Manager("Тото Кутуньо", 35000, google));
        System.out.println(google.showStaff());
        google.fire(ivanPetrov);
        System.out.println(google.showStaff());

    }
}
