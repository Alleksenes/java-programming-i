
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        if (gift <= 4999) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift <= 24999) {
            System.out.println("Tax:" + (100 + (Integer.valueOf(gift) - 5000) * 0.08));
        } else if (gift >= 25000 && gift <= 54999) {
            System.out.println("Tax:" + (1700 + (Integer.valueOf(gift) - 25000) * 0.10));
        } else if (gift >= 55000 && gift <= 199999) {
            System.out.println("Tax:" + (4700 + (Integer.valueOf(gift) - 55000) * 0.12));
        } else if (gift >= 200000 && gift <= 999999) {
            System.out.println("Tax:" + (22100 + (Integer.valueOf(gift) - 200000) * 0.15));
        } else if (gift >= 1000000) {
            System.out.println("Tax:" + (142100 + (Integer.valueOf(gift) - 1000000) * 0.17));
        }
    }
}
