import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedReader;

public class Main {

    public static void printSymbols(String symbol, int count) {

        for (int i = 1; i <= count; i++) {
            System.out.print(symbol);
        }
    }

    public static void main(String[] args) throws IOException {

        String exampleWith3 =
                "---***---***------***---***---\n" +
                "--*****-*****----*****-*****--\n" +
                "-***-*****-***--***-*****-***-\n" + // 5 row 2           9-4 = 5
                "***---***---******---***---***";    // 3 row 3           9-6 = 3


        String exampleWith5 =   "-----*****-----*****----------*****-----*****-----\n" + // 5 - 0
                                "----*******---*******--------*******---*******----\n" + // 3 - 2
                                "---*********-*********------*********-*********---\n" + //
                                "--*****-*********-*****----*****-*********-*****--\n" + // 15-6 = 9
                                "-*****---*******---*****--*****---*******---*****-\n" + // 15-8 = 7
                                "*****-----*****-----**********-----*****-----*****";    // 15-10 = 5

        String exampleWith7 =
                "-------*******-------*******--------------*******-------*******-------\n" +
                "------*********-----*********------------*********-----*********------\n" +
                "-----***********---***********----------***********---***********-----\n" +
                "----*************-*************--------*************-*************----\n" +
                "---*******-*************-*******------*******-*************-*******---\n" +  // 21-8 = 13
                "--*******---***********---*******----*******---***********---*******--\n" +  // 21-10 = 11
                "-*******-----*********-----*******--*******-----*********-----*******-\n" +  // 21-12 = 9
                "*******-------*******-------**************-------*******-------*******";     // 21-14 = 7

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of logo: ");
        int size = Integer.parseInt(reader.readLine());

        if (size % 2 == 0) {
            System.out.println("cannot get an even number of size.");
            return;
        }

        for (int row = 0; row <= size; row++){
            System.out.println("");

            printSymbols("-", size - row);
            if (2*size > size+row*2) {
                printSymbols("*", size + row*2);
                printSymbols("-", size - row*2);
                printSymbols("*", size + row*2);
                printSymbols("-", (size - row)*2);
                printSymbols("*", size + row*2);
                printSymbols("-", size - row*2);
                printSymbols("*", size + row*2);
                printSymbols("-", size - row);
            } else {
                printSymbols("*", size);
                printSymbols("-",row*2 - size);
                printSymbols("*", 3*size - 2*row);
                printSymbols("-",row*2 - size);
                printSymbols("*", size);
                printSymbols("-", (size - row)*2);
                printSymbols("*", size);
                printSymbols("-",row*2 - size);
                printSymbols("*", 3*size - 2*row);
                printSymbols("-",row*2 - size);
                printSymbols("*", size);
                printSymbols("-", size - row);
            }
        }

    }
}
