import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
            ArrayList<Books> books = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Merhaba bebisim ! \n Sana kücük bir kitaplik hazirladim. \n Kitaplarini girer misin? (Baslik, sayfa sayisi ve yayin yili olarak) \n");

            while (true) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                if (title.isEmpty()) {
                    break;
                }
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.print("Year: ");
                int year = Integer.valueOf(scanner.nextLine());
                books.add(new Books(title, pages, year));
            }
            
            System.out.print("What information will be printed? ");
            String info = scanner.nextLine();
            
            for (Books book : books) {
                if (info.equals("everything")) {
                    System.out.println(book);
                } else if (info.equals("name")) {
                    System.out.println(book.getTitle());
                } else if (info.equals ("pages")) {
                    System.out.println(book.getPages());
                } else if (info.equals("year")) {
                    System.out.println(book.getYear());
                }
            }
        }
    }

