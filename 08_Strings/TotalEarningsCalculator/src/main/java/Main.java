public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //TODO: напишите ваш код, результат вывести в консоль

        int firstDigitVasya = text.indexOf("5");
        int vasyaIncome = Integer.parseInt(text.substring(firstDigitVasya, firstDigitVasya + 4));

        int firstDigitPetya = text.indexOf("7");
        int petyaIncome = Integer.parseInt(text.substring(firstDigitPetya, firstDigitPetya + 4));

        int firstDigitMasha = text.lastIndexOf("3");
        int mashaIncome = Integer.parseInt(text.substring(firstDigitMasha, firstDigitMasha + 5));
        System.out.println(vasyaIncome + petyaIncome + mashaIncome);
    }
}
