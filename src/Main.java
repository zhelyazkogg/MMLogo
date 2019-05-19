import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the logo: ");
        int size = Integer.parseInt(reader.readLine());

        MMLogoPrinter printer;

        try {
            printer = new MMLogoPrinter(size);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }
        printer.print();
    }
}
