public class Manager extends Employees {
    public Manager(String name, double salary, Company company) {
        super(name, salary, company);
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
