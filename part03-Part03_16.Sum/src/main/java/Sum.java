
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(12);
        numbers.add(-16);
        numbers.add(-9);
        System.out.println(sum(numbers));
        
        numbers.add(-5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;

        if (numbers.size() == 0){
            return -1;
        }

        for (int i : numbers){
            sum += i;
        }
        return sum;
    }

}
