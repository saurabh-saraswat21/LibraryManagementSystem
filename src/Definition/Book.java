package Definition;
public class Book {
    private String name;
    private String author;
    private int noOfCopies;
    private int bookId;
    public MyList<Integer> issuedTo = new MyList<>();
    public int issuedCopies;

    public Book(String name, String author, int noOfCopies, int bookId) {
        this.name = name;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.bookId = bookId;
    }

    public MyList<Integer> getIssuedTo() {
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

    public int getIssuedCopies() {
        return issuedCopies;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return " BookID:- " + this.getBookId() + " Book Name:- " + this.getName() + " Author:- " + this.getAuthor() + " No of copies:- " + this.getNoOfCopies() +
                " Issued to:- " + this.getIssuedCopies();
    }
}