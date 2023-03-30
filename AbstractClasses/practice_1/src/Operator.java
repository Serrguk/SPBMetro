public class Operator extends Employees {


    public Operator(Company company) {
        super(company);
    }

    @Override
    public double getMonthSalary() {
        return getSalary();
    }
}
