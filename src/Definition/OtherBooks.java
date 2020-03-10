package Definition;

public class OtherBooks extends Book {
    private String bookType;

    public OtherBooks(String name, String author, String noOfCopies, int bookId, String bookType) {
        super(name, author, noOfCopies, bookId);
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
