public class Operator extends BaseEmployee {


    public Operator(Company company) {
        super(company);
    }

    @Override
    public double getMonthSalary() {
        return Math.round(getSalary());
    }
}
