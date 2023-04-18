
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class GuestListFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
      
        System.out.println("Enter names, an empty line quits.");
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
        
        while (true) {
            String name = scanner.nextLine();
            String row = fileScanner.nextLine();
            list.add(row);

            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
    }
        System.out.println("Thank you!");
    }
}
