
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int x = scan.nextInt();
        if(x < 2015) {
            System.out.println("Ancient history!");
        } else {
            System.out.println(x);
        }
    }
}
