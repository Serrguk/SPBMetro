public class Operator extends BaseEmployee {


    public Operator() {
        super();
    }

    @Override
    public double getMonthSalary() {
        return Math.round(getSalary());
    }
}
