
import java.util.Scanner;

public class MainProgram {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            total.addNumber(input); // it adds the input to the sum

            if (input % 2 == 0) {
                even.addNumber(input);
                continue;
            } else {
                odd.addNumber(input);
                continue;
            }
        }
        System.out.println("Sum: " + total.sum());
        System.out.println("Sum of odd: " + odd.sum());                
        System.out.println("Sum of even: " + even.sum());
    }
}