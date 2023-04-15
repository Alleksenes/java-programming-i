
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0, totam = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        for (int i : list){
            sum += i;
            totam++;
        }
        
        
        System.out.println("Average: " + (1.0 * (sum / totam)));
    
}
}

