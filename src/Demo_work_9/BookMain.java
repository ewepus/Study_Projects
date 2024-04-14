package Demo_work_9;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = Double.parseDouble(sc.nextLine());

        try {
            Book book = new Book(title, author, price);
            System.out.println(book);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
