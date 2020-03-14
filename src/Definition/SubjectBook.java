package Definition;

public class SubjectBook extends Book {
    private String SubName;
    private int Edition;

    public SubjectBook(String name, String author, int noOfCopies, int bookId, String SubName, int Edition) {
        super(name, author, noOfCopies, bookId);
        this.SubName = SubName;
        this.Edition = Edition;
    }

    public String getSubName() {
        return SubName;
    }

    public int getEdition() {
        return Edition;
    }


    @Override
    public String toString() {
        return "[ Subject name :- " + this.getSubName() + " Edition :- " + this.getEdition() + super.toString() + "]\n";
    }
}
