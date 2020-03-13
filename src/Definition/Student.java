package Definition;

public class Student {
    private int rollNo;
    private String firstName;
    private String lastName;
    private MyList<Integer> books = new MyList<Integer>();
    private MyList<String> phoneNumbers = new MyList<>();

    public Student(int rollNo, String firstName, String lastName, MyList<Integer> books, MyList<String> phoneNumbers) {
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

    public MyList<Integer> getBooks() {
        return books;
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
