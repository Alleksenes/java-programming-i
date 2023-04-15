
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names, an empty line quits.");
       while (true) {
           String name = scanner.nextLine();
           if (name.isEmpty()) {
               break;
           }
           items.add(new Item(name));
       }

         for (Item item : items) {
              System.out.println(item);
         } 
// q: why do we use : instead of . in the for loop?
//q: so you are saying that when we use : sign, we use it to iterate larger units than string?




        
        

    }
}
