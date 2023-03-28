public class Operator extends Employees {
    public Operator(String name, double salary, Company company) {
        super(name, salary, company);
    }

    @Override
    public double getMonthSalary() {
        return getSalary();
    }
}
