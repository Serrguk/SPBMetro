public class Manager extends BaseEmployee {

    private double incomeForCompany;
    public Manager(Company company) {
        super(company);
        setIncomeForCompany();
    }

    @Override
    public double getMonthSalary() {
        return Math.round(getSalary() + incomeForCompany * 0.05);
    }

    public void setIncomeForCompany() {
        incomeForCompany = Math.round(115000 + (140000 - 115000) * Math.random());
    }

}
