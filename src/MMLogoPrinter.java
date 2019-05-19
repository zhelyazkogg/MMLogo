public class MMLogoPrinter {

    private int size;

    public MMLogoPrinter(int size) {
        if (size % 2 == 0 || size <= 2 || size > 10000) {
            throw new IllegalArgumentException("Size should be an odd number, between 2 and 10 000.");
        }
        this.size = size;
    }

    public static void printSymbols(String symbol, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(symbol);
        }
    }

    public void print() {
        for (int row = 0; row <= size; row++) {
            printSymbols("-", size - row);
            boolean isUpperHalf = size > row * 2;
            if (isUpperHalf) {
                printSymbols("*", size + row * 2);
                printSymbols("-", size - row * 2);
                printSymbols("*", size + row * 2);
                printSymbols("-", (size - row) * 2);
                printSymbols("*", size + row * 2);
                printSymbols("-", size - row * 2);
                printSymbols("*", size + row * 2);
                printSymbols("-", size - row);
            } else {
                printSymbols("*", size);
                printSymbols("-", row * 2 - size);
                printSymbols("*", 3 * size - 2 * row);
                printSymbols("-", row * 2 - size);
                printSymbols("*", size);
                printSymbols("-", (size - row) * 2);
                printSymbols("*", size);
                printSymbols("-", row * 2 - size);
                printSymbols("*", 3 * size - 2 * row);
                printSymbols("-", row * 2 - size);
                printSymbols("*", size);
                printSymbols("-", size - row);
            }

            System.out.println("");
        }
    }
}
