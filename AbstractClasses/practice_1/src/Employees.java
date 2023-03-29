public abstract class Employees implements Employee {

    private Company company;
    private String name;
    private double salary;

    public Employees(Company company) {
        this.company = company;
        this.name = null;
        this.salary = 0;

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
