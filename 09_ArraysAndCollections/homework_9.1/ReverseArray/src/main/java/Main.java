public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] arrayOfLine = line.split(",?\\s+");
        for (String s : arrayOfLine) {
            System.out.print(s + " ");
        }
        System.out.println();

        ReverseArray.reverse(arrayOfLine);

        for (String s : arrayOfLine) {
            System.out.print(s + " ");
        }


    }
}
