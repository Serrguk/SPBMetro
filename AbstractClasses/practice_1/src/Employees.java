public abstract class Employees implements Employee {

    private Company company;
    private final String name;
    private double salary;

    public Employees(String name, double salary, Company company) {
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
