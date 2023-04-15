
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "true";
        System.out.println("Give a string: ");
        String input = scanner.nextLine();

        if (text.equals(input)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }


    }
}
