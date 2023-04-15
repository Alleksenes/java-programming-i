
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input, sum = 0, count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            input = scanner.nextInt();
        
            if (input == 0){
                break;
            }

            if (input != 0){
               count++;
               sum += input;
 
            }
        }
            System.out.println("Average of the numbers: " + (1.0 * sum / count));
    }
}
