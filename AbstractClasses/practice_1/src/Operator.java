public class Operator extends Employees implements Employee {
    public Operator(String name, double salary, Company company) {
        super(name, salary, company);
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
