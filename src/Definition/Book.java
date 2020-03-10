package Definition;
public class Book {
    private String name;
    private String author;
    private int noOfCopies;
    private int bookId;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, String author, int noOfCopies, int bookId) {
        this.name = name;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.bookId = bookId;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    @Override
    public String toString() {
        return "[ Name:- " + this.name + " Author:- " + this.author + " No of copies:- " + this.noOfCopies + " BookID:- " + this.bookId;
    }
}