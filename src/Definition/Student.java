package Definition;

public class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private MyList<Book> books = new MyList<>();
    private MyList<String> phoneNumbers = new MyList<>();

    public Student(int rollNo, String firstName, String lastName, MyList<Book> books, MyList<String> phoneNumbers) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
        this.phoneNumbers = phoneNumbers;
    }

    public Student(int rollNo, String firstName, String lastName, MyList<String> phoneNumbers) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public MyList<Book> getBooks() {
        return books;
    }

    public String getIssuedBooksId() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < books.size; i++) {
            sb.append(books.getData(i).getBookId()).append(",");
        }
        return sb.toString();
    }

    public MyList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return " Roll Number " + this.getRollNo() + " Name:- " + this.getFirstName() + " " + this.getLastName() +
                " Phone Number:- " + this.getPhoneNumbers();
    }
}
