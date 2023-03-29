public class Main {
    public static void main(String[] args) {

        Company google = new Company(1E8);
        TopManager ivanPetrov = new TopManager("Иван Петров", 3E5, google);
        google.hire(ivanPetrov);

        System.out.println(google.getIncome());
        System.out.println(google.showStaff());

        google.hire(new Manager("Тото Кутуньо", 3.5E4, google));
        System.out.println(google.showStaff());
        Manager manager = new Manager("R2D2", 12E4, google);
        System.out.println(manager.getIncomeForCompany());
        System.out.println(manager.getMonthSalary());
        System.out.println();
        TopManager top = new TopManager("Big man", 35E4, google);

    }
}
