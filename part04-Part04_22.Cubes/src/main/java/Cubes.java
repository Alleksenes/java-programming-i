
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Enter a number: ");
        
        String input = scanner.nextLine();
        int number = Integer.valueOf(input);
        if (input == "end") {
            break;
        }
        System.out.println("The cube of " + number + " is " + (number * number * number));

        
        
    }
}
}
