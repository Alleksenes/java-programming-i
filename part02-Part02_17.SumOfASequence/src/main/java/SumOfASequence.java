
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Last number?");
        int nuno = scanner.nextInt();

        for (int i = 0; i <= nuno; i++) {
            sum += i;

        }
        System.out.println("The number is " + sum);



    }
}
