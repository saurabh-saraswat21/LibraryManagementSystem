package Definition;
public class Book {
    private String name;
    private String author;
    private int noOfCopies;
    private int bookId;
    int issuedTo;

    public int getIssuedTo() {
        return issuedTo;
    }

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
        return " Book Name:- " + this.getName() + " Author:- " + this.getAuthor() + " No of copies:- " + this.getNoOfCopies() + " BookID:- " + this.getBookId() + " Issued to:- " + this.getIssuedTo();
    }
}