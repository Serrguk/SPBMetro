import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company google = new Company(10_000_000D);

        google.hireAll(google.getStaff(), new Operator(google), 180);

        google.hireAll(google.getStaff(), new Manager(google), 80);

        google.hireAll(google.getStaff(), new TopManager(google), 10);


        List<Employee> topSalary = google.getTopSalaryStaff(15);

        System.out.println("В компании работает " + google.getStaff().size() + " сотрудников.");
        System.out.println("Топ зарпат в компании: ");
        topSalary.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));
        List<Employee> lowesSalary = google.getLowesSalaryStaff(30);
        System.out.println("\nСписок самых низких зарплат в компании: ");
        lowesSalary.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));

        google.fireAll(google.getStaff(), google.getStaff().size() / 2);
        System.out.println("\nКомпания сократила штат на 50%. Теперь её штат " + google.getStaff().size()
         + " сотрудников");

        List<Employee> topSalaryAfterReduction = google.getTopSalaryStaff(15);
        System.out.println("Топ зарпат в компании: ");
        topSalaryAfterReduction.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));
        List<Employee> lowesSalaryAfterReduction = google.getLowesSalaryStaff(30);
        System.out.println("\nСписок самых низких зарплат в компании: ");
        lowesSalaryAfterReduction.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));

        Company amazon = new Company(50_000_000_000d);

        amazon.hireAll(amazon.getStaff(), new Operator(amazon), 35);
        System.out.println(google.getCountEmployees());
        System.out.println(amazon.getCountEmployees());
    }
}
