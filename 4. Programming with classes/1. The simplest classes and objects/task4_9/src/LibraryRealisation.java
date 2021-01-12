import java.util.ArrayList;
import java.util.Arrays;

public class LibraryRealisation {
    public static void main(String[] args) {
        Book [] books = new Book[5];
        books[0] = new Book("Triller", "Pupkin", "PubA", 2005,100, 13.47,"soft");
        books[1] = new Book("History", "Vasechkin", "PubB", 2006,200, 14.48,"soft");
        books[2] = new Book("Drama", "Pupkin", "PubB", 2007,150, 15.27,"hard");
        books[3] = new Book("Comedy", "Ivanov", "PubB", 2011,120, 16.00,"hard");
        books[4] = new Book("Roman", "Pupkin", "PubA", 2015,130, 1.00,"soft");

        ArrayList<Book> list = new ArrayList<Book>(Arrays.asList(books));
        Library library1 = new Library(books);
        Library library2 = new Library(list);

        library1.findAfter(2000);
        library2.findAfter(2006);

        library1.findAuthor("Pupkin");
        library2.findAuthor("Vasechkin");

        library1.findPublisher("PubA");
        library2.findPublisher("PubB");
    }
}
