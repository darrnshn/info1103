import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        // See how many books we have
        int numBooks = Integer.parseInt(args[0]);

        // Create the necessary arrays to hold book data
        Book[] books = new Book[numBooks];

        // Read in the book details
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < numBooks; i++) {
            books[i] = new Book(keyboard.nextLine(), keyboard.nextLine(), Integer.parseInt(keyboard.nextLine()));
        }

        // Find the newest book
        int newestBook = 0;
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getYear() > books[newestBook].getYear()) {
                newestBook = i;
            }
        }

        System.out.println("The newest book in our catalogue is " + books[newestBook].getTitle() +
            " by " + books[newestBook].getAuthor() + " (" + books[newestBook].getYear() + ")");

        keyboard.close();
    }
}
