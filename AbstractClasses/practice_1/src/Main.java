public class Main {
    public static void main(String[] args) {

        Company google = new Company(10_000_000D);
        TopManager ivanPetrov = new TopManager("Иван Петров", 300_000, google);
        google.hire(ivanPetrov);

        System.out.println(google.getIncome());
        System.out.println(google.getStaff());

        google.hire(new Manager("Тото Кутуньо", 35000, google));
        System.out.println(google.getStaff());
        Manager manager = new Manager("R2D2", 120_000, google);
        System.out.println("R2D2 заработал для компании " + manager.getIncomeForCompany() + " рублей.");
        manager.setIncomeForCompany();
        System.out.println("R2D2 заработал для компании " + manager.getIncomeForCompany() + " рублей.");

        System.out.println(manager.getMonthSalary());
        System.out.println();
        TopManager top = new TopManager("Big man", 350_000, google);
        System.out.println(top.getMonthSalary());

    }
}
