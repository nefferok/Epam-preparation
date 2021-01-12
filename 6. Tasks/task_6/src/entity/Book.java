package entity;

public class Book {
    private String author;
    private String name;
    private String comment;
    private boolean isPaper;

    public Book() {
    }

    public Book(String author, String name, String comment, boolean isPaper) {
        this.author = author;
        this.name = name;
        this.comment = comment;
        this.isPaper = isPaper;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isPaper() {
        return isPaper;
    }

    public void setPaper(boolean paper) {
        isPaper = paper;
    }
}
