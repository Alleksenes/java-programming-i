
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();

        if (in1 > in2) {
            System.out.println(in1 + "is greater than" + in2);

        } else if (in1 < in2) {
            System.out.println(in1 + "is smaller than" + in2);

        } else if (in1 == in2) {
            System.out.println(in1 + "is equal to" + in2);
        }
    }
}
