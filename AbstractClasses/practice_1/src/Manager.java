public class Manager extends Employees {

    private double incomeForCompany;
    public Manager(String name, double salary, Company company) {
        super(name, salary, company);
        incomeForCompany = 115000 + (140000 - 115000) * Math.random();
    }

    @Override
    public double getMonthSalary() {
        return Math.round(getSalary() + incomeForCompany * 0.05);
    }

    public double getIncomeForCompany() {
        return Math.round(incomeForCompany);
    }

    public void setIncomeForCompany() {
        this.incomeForCompany = 115000 + (140000 - 115000) * Math.random();
    }
}
