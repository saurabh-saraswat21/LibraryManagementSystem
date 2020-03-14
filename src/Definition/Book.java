package Definition;
public class Book {
    private String name;
    private String author;
    private int noOfCopies;
    private int bookId;
    int issuedTo;

    public Book(String name, String author, int noOfCopies, int bookId) {
        this.name = name;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.bookId = bookId;
    }

    public int getIssuedTo() {
        return issuedTo;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    public int getNoOfCopies() {
        return noOfCopies;
    }

    public int getBookId() {
        return bookId;
    }
    @Override
    public String toString() {
        return " Book Name:- " + this.getName() + " Author:- " + this.getAuthor() + " No of copies:- " + this.getNoOfCopies() + " BookID:- " + this.getBookId() + " Issued to:- " + this.getIssuedTo();
    }
}