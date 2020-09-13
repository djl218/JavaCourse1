import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Books(title, pages, year));
        }
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String bookInfo = scanner.nextLine();
        if (bookInfo.equals("name")) {
            for (Books book: books) {
                System.out.println(book.getTitle());
            }
        }
        if (bookInfo.equals("everything")) {
            for (Books book: books) {
                System.out.println(book.toString());
            }
        }
    }
}
