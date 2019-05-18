import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String exampleWith3 =   "---***---***------***---***---\n" +
                                "--*****-*****----*****-*****--\n" +
                                "-***-*****-***--***-*****-***-\n" +
                                "***---***---******---***---***";


        String exampleWith5 =   "-----*****-----*****----------*****-----*****-----\n" +
                                "----*******---*******--------*******---*******----\n" +
                                "---*********-*********------*********-*********---\n" +
                                "--*****-*********-*****----*****-*********-*****--\n" +
                                "-*****---*******---*****--*****---*******---*****-\n" +
                                "*****-----*****-----**********-----*****-----*****";

        String exampleWith7 =   "-------*******-------*******--------------*******-------*******-------\n" +
                                "------*********-----*********------------*********-----*********------\n" +
                                "-----***********---***********----------***********---***********-----\n" +
                                "----*************-*************--------*************-*************----\n" +
                                "---*******-*************-*******------*******-*************-*******---\n" +
                                "--*******---***********---*******----*******---***********---*******--\n" +
                                "-*******-----*********-----*******--*******-----*********-----*******-\n" +
                                "*******-------*******-------**************-------*******-------*******";

        System.out.println(exampleWith3);
        System.out.println("");
        System.out.println(exampleWith5);
        System.out.println("");
        System.out.println(exampleWith7);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of logo: ");
        int size = Integer.parseInt(reader.readLine());

        if (size % 2 == 0) {
            System.out.println("cannot get an even number of size.");
        } else {
            for (int d = 1; d <= size; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size; d++) {
                System.out.print("-");
            }
            for (int d = 1; d <= size; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size; d++) {
                System.out.print("-");
            }
            System.out.println("");             // втори ред
        }

            for (int d = 1; d <= size -1 ; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size - 1; s++) {
                System.out.print("*");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size - 2; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size - 1; s++) {
                System.out.print("*");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size - 1; d++) {
                System.out.print("-");
            }
            for (int d = 1; d <= size -1 ; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size - 1; s++) {
                System.out.print("*");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size - 2; d++) {
                System.out.print("-");
            }
            for (int s = 1; s <= size - 1; s++) {
                System.out.print("*");
            }
            for (int s = 1; s <= size; s++) {
                System.out.print("*");
            }
            for (int d = 1; d <= size - 1; d++) {
                System.out.print("-");
            }

        System.out.println("");                     // трети ред
        for (int d = 1; d <= size -2 ; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size - 2; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size - 1; s++) {
            System.out.print("*");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size -2 ; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size - 2; d++) {
            System.out.print("-");
        }
        for (int d = 1; d <= size -2 ; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size - 2; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size - 1; s++) {
            System.out.print("*");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size -2 ; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size - 2; d++) {
            System.out.print("-");
        }

        System.out.println(""); // четвърти ред
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
        for (int d = 1; d <= size; d++) {
            System.out.print("-");
        }
        for (int s = 1; s <= size; s++) {
            System.out.print("*");
        }
    }
}
