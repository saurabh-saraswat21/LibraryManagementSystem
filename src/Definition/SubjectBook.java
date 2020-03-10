package Definition;

public class SubjectBook extends Book {
    private String SubName;
    private String Edition;

    public SubjectBook(String name, String author, String noOfCopies, int bookId, String SubName, String Edition) {
        super(name, author, noOfCopies, bookId);
        this.SubName = SubName;
        this.Edition = Edition;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String subName) {
        SubName = subName;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }
}
