import java.util.ArrayList;
import java.util.Collection;

public class Company {
    private double income;
    private final ArrayList<Employee> staff;

    public Company(double income) {
        this.income = income;
        staff = new ArrayList<>();
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public void hireAll(Collection<Employee> employees, Employee employee, int count) {
        if (employee instanceof TopManager) {
            TopManager manager = new TopManager();
            manager.setSalary(250000);
            employees.add(manager);
        }
        //сгенерировать найм нескольких сотрудников
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public void fire(Employee employee) {
        staff.remove(employee);
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    public ArrayList<Employee> getLowesSalaryStaff(int count) {
        return null;
    }
}
