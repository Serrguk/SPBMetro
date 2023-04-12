public interface Employee extends Comparable<Employee> {
    double getMonthSalary();

    default void setCompany(Company company) {
    }

    @Override
    default int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}
