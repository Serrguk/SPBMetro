import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
//        staff.sort((o1, o2) -> {
//            int salaryCompare = o1.getSalary().compareTo(o2.getSalary());
//            if (salaryCompare == 0) {
//                return o1.getName().compareTo(o2.getName());
//            }
//            return salaryCompare;
//        });
        //___________________________________________________________
        //Выше закомментирована реализация метода с помощью лямбда-выражения
        //Ниже - реализация с помощью Stream.API
        staff.sort(Comparator.comparingDouble(Employee::getSalary)
                .thenComparing(Employee::getName));
    }
}