import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company google = new Company();

        google.hireAll(new Operator(), 180);

        google.hireAll(new Manager(), 80);

        google.hireAll(new TopManager(google), 10);

        List<Employee> topSalary = google.getTopSalaryStaff(5);

        System.out.println("В компании работает " + google.getStaff().size() + " сотрудников.");
        outputTopAndLowesSalary(google, topSalary);

        google.fireAll(google.getStaff().size() / 2);
        System.out.println("\nКомпания сократила штат на 50%. Теперь её штат "
                + google.getStaff().size() + " сотрудников");

        List<Employee> topSalaryAfterReduction = google.getTopSalaryStaff(5);
        outputTopAndLowesSalary(google, topSalaryAfterReduction);

        Company amazon = new Company();
        amazon.hireAll(new Operator(), 35);

        System.out.println("В гугле работает: " + google.getCountEmployees());
        System.out.println("В амазоне работает: " + amazon.getCountEmployees());
        amazon.hire(new TopManager(amazon));
        System.out.println("В амазоне работает: " + amazon.getCountEmployees());
        System.out.println();
        amazon.fire(amazon.getStaff().get(amazon.getStaff().size() - 1));
        System.out.println("В амазоне работает: " + amazon.getCountEmployees());
    }

    //это Идея сгенерила метод, чтобы избежать дублирования кода
    private static void outputTopAndLowesSalary(Company google, List<Employee> topSalary) {
        System.out.println("Топ зарпат в компании: ");
        topSalary.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));
        List<Employee> lowesSalary = google.getLowesSalaryStaff(5);
        System.out.println("\nСписок самых низких зарплат в компании: ");
        lowesSalary.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));
    }
}
