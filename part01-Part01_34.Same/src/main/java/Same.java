
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write two strings");
        String fist = scan.nextLine();
        String sord = scan.nextLine();

        if(fist.equals(sord)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        // Write your program here. 
    }
}
