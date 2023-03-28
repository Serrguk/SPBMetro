public class Main {
    public static void main(String[] args) {

        Company google = new Company(10_000_000D);
        TopManager ivanPetrov = new TopManager("Иван Петров", 300_000, google);
        google.hire(ivanPetrov);

        System.out.println(google.getIncome());
        System.out.println(google.showStaff());

        google.hire(new Manager("Тото Кутуньо", 35000, google));
        System.out.println(google.showStaff());
        Manager manager = new Manager("R2D2", 120_000, google);
        System.out.println(manager.getIncomeForCompany());
        System.out.println(manager.getMonthSalary());
        System.out.println();
        TopManager top = new TopManager("Big man", 350_000, google);
        System.out.println(top.getMonthSalary());

    }
}
