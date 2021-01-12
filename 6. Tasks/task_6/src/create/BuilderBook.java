package create;

import entity.Book;

public class BuilderBook {
    private Book book;

    public BuilderBook() {
        reset();
    }

    public  void reset(){
        book = new Book();
    }

    public void setAuthor(String author){
        book.setAuthor(author);
    }

    public void setName(String name){
        book.setName(name);
    }

    public void setComment(String comment){
        book.setComment(comment);
    }

    public void setIsPaper(boolean paper){
        book.setPaper(paper);
    }

    public Book getBook(){
        return book;
    }

}
