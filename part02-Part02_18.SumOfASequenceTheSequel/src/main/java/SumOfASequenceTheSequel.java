
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("First number?");
        int lovo = scanner.nextInt();
        
        System.out.println("Last number?");
        int higo = scanner.nextInt();

        for (int i = lovo; lovo <= higo; lovo++) {
            sum += lovo;

        }
        System.out.println("The number is " + sum);

    }
}
