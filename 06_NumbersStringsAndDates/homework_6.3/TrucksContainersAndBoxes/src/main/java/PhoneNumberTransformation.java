import java.util.Scanner;

public class PhoneNumberTransformation {
    public static void main(String[] args) {
        String number = new Scanner(System.in).nextLine();
        char[] digits = number.toCharArray();


        if (digits[0] == '8') {
            System.out.print("+7 (");
            for (int i = 1; i < digits.length; i++) {
                System.out.print(digits[i]);
                if (i == 3)
                    System.out.print(") ");
                if (i == 6)
                    System.out.print("-");
                if (i == 8)
                    System.out.print("-");
            }
        } else if (digits[0] == '+') {
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i]);
                if (i == 1)
                    System.out.print(" (");
                if (i == 4)
                    System.out.print(") ");
                if (i == 7)
                    System.out.print("-");
                if (i == 9)
                    System.out.print("-");
            }
        } else {
            System.out.print("+7 (");
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i]);
                if (i == 2)
                    System.out.print(") ");
                if (i == 5)
                    System.out.print("-");
                if (i == 7)
                    System.out.print("-");
            }
        }
    }
}

