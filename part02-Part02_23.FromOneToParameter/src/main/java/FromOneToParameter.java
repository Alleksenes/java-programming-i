

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }

    public static void printUntilNumber(int input) {
        int arg = 0;

        while (arg <= input) {
            System.out.println(arg);
            arg++;
        }
    }

}
