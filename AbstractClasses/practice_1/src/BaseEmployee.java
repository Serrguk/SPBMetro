public abstract class BaseEmployee implements Employee {

    private String name;
    private double salary;

    public BaseEmployee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + Math.round(salary) +
                '}';
    }

}
