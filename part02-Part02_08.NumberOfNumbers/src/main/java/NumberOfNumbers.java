
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        int input = 0, count = 0;
    
        while(true) {
            count++;
            
            System.out.println("Give a number:");
            input = scanner.nextInt();
        
                if (input == 0) {
                break;
                }
            
            }
            
                System.out.println("Number of numbers: " + (count-1));
        
    }
 
}