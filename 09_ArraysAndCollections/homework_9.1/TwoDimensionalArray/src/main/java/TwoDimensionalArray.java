public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] symbols = new char[size][size];
        for (int i = 0; i < symbols.length; i++) {
           symbols[i][i] = symbol;
           symbols[symbols.length - 1 - i][i] = symbol;
        }

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < symbols[i].length; j++) {
                if (symbols[i][j] != symbol)
                    symbols[i][j] = ' ';
            }
        }

        return symbols;
    }
}
