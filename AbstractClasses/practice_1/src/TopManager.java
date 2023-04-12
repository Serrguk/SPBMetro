public class TopManager extends BaseEmployee {

    private final double companyIncome;

    public TopManager(Company company) {
        super();
        companyIncome = company.getIncome();
    }

    @Override
    public double getMonthSalary() {
        if (companyIncome > 1E7) {
            return Math.round(getSalary() + getSalary() * 1.5);
        } else {
            return Math.round(getSalary());
        }
    }

}
