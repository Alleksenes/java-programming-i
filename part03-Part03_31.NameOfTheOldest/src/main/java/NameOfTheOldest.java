
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age, oldest = 0;
        while (true) {
            String num = scanner.nextLine();
            if (num.equals("")) {
                break;
            }

            String[] data = num.split(",");
            age = Integer.valueOf(data[1]);
            if (age > oldest) {
                oldest = age;
                name = data[0];
            }
            System.out.println("Name of the oldest: " + name);

        }
    }
}
