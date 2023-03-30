import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company google = new Company(10_000_000D);

        google.hireAll(google.getStaff(), new Manager(google), 80);

        google.hireAll(google.getStaff(), new TopManager(google), 5);

        List<Employee> topSalary = google.getTopSalaryStaff(5);

        System.out.println("Топ зарпат в компании: ");
        topSalary.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));
        List<Employee> lowesSalary = google.getLowesSalaryStaff(5);
        System.out.println("\nСписок самых низких зарплат в компании: ");
        lowesSalary.forEach(employee -> System.out.println(employee.getMonthSalary() + " рублей."));


    }
}
