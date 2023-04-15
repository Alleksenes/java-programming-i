
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lol = scanner.nextInt();

        if (lol < 0) {
            System.out.println(lol * -1);
        } else {
            System.out.println(lol);
        }

    }
}
