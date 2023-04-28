import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.println("Enter the author of the book: ");
        String author = scanner.nextLine();
        
        System.out.println("Enter the pages the book was published: ");
        int pages = Integer.valueOf(scanner.nextLine());

        Book book = new Book(title, author, pages);

        System.out.println(book);

        
    }
}
