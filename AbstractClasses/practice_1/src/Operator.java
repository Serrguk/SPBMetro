public class Operator extends Employees {
    public Operator(String name, double salary, Company company) {
        super(name, salary, company);
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
