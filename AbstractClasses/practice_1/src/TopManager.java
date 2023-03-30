public class TopManager extends Employees {

    private double companyIncome;
    public TopManager(String name, double salary, Company company) {
        super(name, salary, company);
        companyIncome = company.getIncome();
    }

    public TopManager() {
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
