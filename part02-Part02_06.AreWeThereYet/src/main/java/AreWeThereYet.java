
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number, 4 to quit");
            int seq = scanner.nextInt();
            if (seq == 4) {
                break;
            }
            System.out.println("You input" + seq);
        }
        System.out.println("Done, thank you!");
    }
}
