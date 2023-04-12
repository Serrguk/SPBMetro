import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Company {
    private final List<Employee> staff;
    private int countEmployees = 0;

    public Company() {
        staff = new ArrayList<>();
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public double getIncome() {
        int income = 0;
        for (Employee e : staff) {
            if (e instanceof Manager) {
                income += ((Manager) e).getIncomeForCompany();
            }
        }
        return income;
    }

    public void hire(Employee employee) {
        switch (employee.getClass().getSimpleName()) {
            case "TopManager" -> {
                TopManager topManager = new TopManager(this);
                topManager.setName("TopManager" + countEmployees);
                topManager.setSalary(250_000 + (350_000 - 250_000) * Math.random());
                staff.add(topManager);
            }
            case "Manager" -> {
                Manager manager = new Manager();
                manager.setName("Manager" + countEmployees);
                manager.setSalary(100_000 + (150_000 - 100_000) * Math.random());
                manager.setCompany(this);
                staff.add(manager);
            }
            case "Operator" -> {
                Operator operator = new Operator();
                operator.setName("Operator" + countEmployees);
                operator.setSalary(35_000 + 5000 * Math.random());
                operator.setCompany(this);
                staff.add(operator);
            }
        }
        countEmployees++;
    }

    public void hireAll(Employee employee, int count) {
        IntStream.range(0, count).forEach(i -> hire(employee));
    }

    public List<Employee> getStaff() {
        return new ArrayList<>(staff);
    }

    public void fire(Employee employee) {
        staff.remove(employee);
        employee.setCompany(null);
        countEmployees--;
    }

    //Метод для массового сокращения штата в трудные времена
    public void fireAll(int count) {
        List<Employee> list = new ArrayList<>(staff);
        AtomicInteger size = new AtomicInteger(list.size());
        if (count > size.get()) {
            System.out.println("В компании всего " + size + " работников!");
        } else {
            Random random = new Random();
            IntStream.range(0, count)
                    .forEach(i -> {
                        int index = random.nextInt(size.get());
                        list.get(index).setCompany(null);
                        list.remove(index);
                        size.getAndDecrement();
                    });
            staff.clear();
            staff.addAll(list);
            countEmployees = staff.size();
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getList(count, Comparator.reverseOrder());
    }

    public List<Employee> getLowesSalaryStaff(int count) {
        return getList(count, Employee::compareTo);
    }

    private List<Employee> getList(int count, Comparator<Employee> comparator) {
        if (count < 0) {
            System.out.println("Передано неверное значение!");
            return Collections.emptyList();
        }
        if (count > staff.size()) {
            count = staff.size();
        }
        staff.sort(comparator);
        return new ArrayList<>(staff.subList(0, count));
    }
}
