import lombok.AllArgsConstructor;
import lombok.Data;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private Integer salary;
    private LocalDate workStart;

    public static List<Employee> loadStaffFromFile(String path) {
        List<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                String dateFormat = "dd.MM.yyyy";
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        LocalDate.parse(fragments[2],
                                DateTimeFormatter.ofPattern(dateFormat))
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }

    public String toString() {
        return name + " - " + salary + " - " +
                (DateTimeFormatter.ofPattern("dd.MM.yyyy")).format(workStart);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(workStart, employee.workStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, workStart);
    }

}
