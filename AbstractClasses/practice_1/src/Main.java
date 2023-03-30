public class Main {
    public static void main(String[] args) {

        Company google = new Company(10_000_000D);

        google.hireAll(google.getStaff(), new Manager(google), 80);

        google.hireAll(google.getStaff(), new TopManager(google), 5);

        System.out.println(google.getTopSalaryStaff(10));
        System.out.println();
        System.out.println(google.getLowesSalaryStaff(10));

    }
}
