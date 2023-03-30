import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Company {
    private double income;
    private final ArrayList<Employee> staff;
    private int countEmployees = 0;

    public Company(double income) {
        this.income = income;
        staff = new ArrayList<>();
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void hire(Employee employee) {
        staff.add(employee);
        countEmployees++;
    }

    public void hireAll(Collection<Employee> employees, Employee employee, int count) {
        IntStream.range(0, count).forEach(i -> {
            switch (employee.getClass().getSimpleName()) {
                case "TopManager" -> {
                    TopManager topManager = new TopManager(((TopManager) employee).getCompany());
                    topManager.setName("TopManager" + countEmployees);
                    topManager.setSalary(250_000 + (350_000 - 250_000) * Math.random());
                    employees.add(topManager);
                }
                case "Manager" -> {
                    Manager manager = new Manager(((Manager) employee).getCompany());
                    manager.setName("Manager" + countEmployees);
                    manager.setSalary(100_000 + (150_000 - 100_000) * Math.random());
                    employees.add(manager);
                }
                case "Operator" -> {
                    Operator operator = new Operator(((Operator) employee).getCompany());
                    operator.setName("Operator" + countEmployees);
                    operator.setSalary(35_000);
                    employees.add(operator);
                }
            }
            countEmployees++;
        });
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public void fire(Employee employee) {
        staff.remove(employee);
        countEmployees--;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return staff.stream()
                .sorted(Comparator.comparingDouble(Employee::getMonthSalary).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    public List<Employee> getLowesSalaryStaff(int count) {
        return staff.stream()
                .sorted(Comparator.comparingDouble(Employee::getMonthSalary))
                .limit(count)
                .collect(Collectors.toList());
    }
}
