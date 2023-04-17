
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; 

public class Cubes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        List<Integer> results = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            CubesConstructor cubes = new CubesConstructor(Integer.valueOf(input));
            int result = cubes.volume();
            results.add(result);
        }
       
        for (int result : results) {
            System.out.println(result);
        }

    }
}
