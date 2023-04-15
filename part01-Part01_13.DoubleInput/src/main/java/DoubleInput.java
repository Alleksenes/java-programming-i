
import java.util.Scanner;

import javax.management.ValueExp;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + value);




    }
}
