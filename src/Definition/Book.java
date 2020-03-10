package Definition;
public class Book {
    private String name;
    private String author;
    private String noOfCopies;
    private int bookId;

    public Book(String name, String author, String noOfCopies, int bookId) {
        this.name = name;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.bookId = bookId;
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

    public String getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(String noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
