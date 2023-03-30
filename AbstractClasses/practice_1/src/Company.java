import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

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
        for (int i = 0; i < count; i++) {
            if (employee instanceof TopManager) {
                TopManager manager = new TopManager(((TopManager) employee).getCompany());
                manager.setName("TopManager" + countEmployees);
                manager.setSalary(250_000 + (350_000 - 250_000) * Math.random());
                employees.add(manager);
            } else if (employee instanceof Manager) {
                Manager manager = new Manager(((Manager) employee).getCompany());
                manager.setName("Manager" + countEmployees);
                manager.setSalary(100_000 + (150_000 - 100_000) * Math.random());
                employees.add(manager);
            } else if (employee instanceof Operator) {
                Operator operator = new Operator(((Operator) employee).getCompany());
                operator.setName("Operator" + countEmployees);
                operator.setSalary(35_000);
                employees.add(operator);
            }
            countEmployees++;
        }
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public void fire(Employee employee) {
        staff.remove(employee);
        countEmployees--;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        staff.sort(Comparator.comparingDouble(Employee::getMonthSalary));
        ArrayList<Employee> employeesWithTopSalary = new ArrayList<>();
        for (int i = staff.size() - 1; i >= staff.size() - count; i--) {
            employeesWithTopSalary.add(staff.get(i));
        }
        return employeesWithTopSalary;
    }
    public ArrayList<Employee> getLowesSalaryStaff (int count){
        staff.sort(Comparator.comparingDouble(Employee::getMonthSalary));
        ArrayList<Employee> employeesWithLowesSalary = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employeesWithLowesSalary.add(staff.get(i));
        }
        return employeesWithLowesSalary;
    }
}
