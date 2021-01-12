import java.util.ArrayList;

public class Library {
    private Book [] books;
    private ArrayList<Book> list;
    private String type;

    private static final String LIST_TYPE = "list";
    private static final String ARRAY_TYPE = "array";

    public Library(ArrayList<Book> list) {
        this.list = list;
        this.type = LIST_TYPE;
    }

    public Library(Book... books) {
        this.books = books;
        this.type = ARRAY_TYPE;
    }

    public void findAuthor (String author){
        System.out.println("\nProgram found the following:");

        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getAuthor().equals(author)) {
                    System.out.println(books[i].toString());
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAuthor().equals(author))
                    System.out.println(list.get(i).toString());
            }
        }

    }

    public void findPublisher (String publisher){
        System.out.println("\nProgram found the following:");

        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getPublisher().equals(publisher)) {
                    System.out.println(books[i].toString());
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPublisher().equals(publisher))
                    System.out.println(list.get(i).toString());
            }
        }

    }
    public void findAfter (int year){
        System.out.println("\nProgram found the following:");

        if (this.type.equals(ARRAY_TYPE)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getYear()>year) {
                    System.out.println(books[i].toString());
                }
            }
        } else if (this.type.equals(LIST_TYPE)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getYear()>year)
                    System.out.println(list.get(i).toString());
            }
        }
}
}
