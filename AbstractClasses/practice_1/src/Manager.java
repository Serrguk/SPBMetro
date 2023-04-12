public class Manager extends BaseEmployee {

    private double incomeForCompany;

    public Manager() {
        super();
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
