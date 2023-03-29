public class TopManager extends Employees {

    private final double companyIncome;
    private Company company;
    public TopManager(Company company) {
        super(company);
        companyIncome = company.getIncome();
    }

    @Override
    public double getMonthSalary() {
        if (companyIncome > 1E7) {
            return getSalary() + getSalary() * 1.5;
        } else {
            return getSalary();
        }
    }
}
