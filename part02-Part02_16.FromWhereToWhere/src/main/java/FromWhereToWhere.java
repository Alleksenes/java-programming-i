
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int fromInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int toInput = Integer.valueOf(scanner.nextLine());
       
        while(fromInput <= toInput) {
            
            System.out.println(fromInput);
            fromInput++;
        } 
    
    }

    
    }