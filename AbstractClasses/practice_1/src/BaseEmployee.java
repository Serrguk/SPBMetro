public abstract class BaseEmployee implements Employee {

    private final Company company;
    private String name;
    private double salary;

    public BaseEmployee(Company company) {
        this.company = company;
        this.name = null;
        this.salary = 0;

    }

    public Company getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + Math.round(salary) +
                '}';
    }
}
