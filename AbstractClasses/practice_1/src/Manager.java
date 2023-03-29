public class Manager extends Employees {

    private double incomeForCompany;
    public Manager(String name, double salary, Company company) {
        super(name, salary, company);
        setIncomeForCompany();
    }

    @Override
    public double getMonthSalary() {
        return Math.round(getSalary() + incomeForCompany * 0.05);
    }

    public double getIncomeForCompany() {
        return incomeForCompany;
    }

    public void setIncomeForCompany() {
        incomeForCompany = Math.round(115000 + (140000 - 115000) * Math.random());
    }
}
