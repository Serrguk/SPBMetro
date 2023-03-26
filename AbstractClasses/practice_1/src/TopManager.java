public class TopManager extends Employees implements Employee {

    public TopManager(String name, double salary, Company company) {
        super(name, salary, company);
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }


}
