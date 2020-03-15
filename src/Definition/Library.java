package Definition;

import Adt.LibraryAdt;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Library implements LibraryAdt {
    private static Scanner sc = new Scanner(System.in);
    public int totalBooks = 0;
    public int issuedBooks = 0;
    public MyList<Book> stock = new MyList<>();
    public MyList<Student> studentDatabase = new MyList<>();

    private static Integer takeOneDigitIntInput() {
        while (true) {
            String s = sc.next();
            char input = s.charAt(0);
            if (s.length() == 1) {
                if (input == '0' || input == '1' || input == '2' || input == '3' || input == '4' || input == '5' || input == '6' || input == '7' || input == '8' || input == '9') {
                    return (int) input - 48;
                } else {
                    System.out.println("Enter Valid Input");
                }
            } else {
                System.out.println("Enter Valid Input");
            }

        }
    }

    private static int selectBookType() {
        int res;

        while (true) {
            System.out.println("Enter the type of Book");
            System.out.println("1. Academic");
            System.out.println("2. Other");
            System.out.println("0.Exit");
            res = takeOneDigitIntInput();
            if (res == 1 || res == 2 || res == 0) {
                break;
            } else {
                System.out.println("Enter a Valid Input");
            }
        }
        return res;
    }

    private static SubjectBook enterSubBookDetails() {
        System.out.println("Enter book details:-");
        System.out.println("Enter The Subject of the book");
        String subName = sc.next();
        System.out.println("Enter the name of the book");
        String name = sc.next();
        System.out.println("Enter the author of the book");
        String author = sc.next();
        System.out.println("Enter the Book Edition");
        int Edition = sc.nextInt();
        System.out.println("Enter the Book ID");
        int bookId = sc.nextInt();
        System.out.println("Enter the number of copies to be added");
        int noOfCopies = sc.nextInt();
        return new SubjectBook(name, author, noOfCopies, bookId, subName, Edition);
    }

    private static OtherBooks enterOtherBookDetails() {
        System.out.println("Enter book details:-");
        System.out.println("Enter The Type of the book");
        String type = sc.next();
        System.out.println("Enter the Book Language");
        String language = sc.next();
        System.out.println("Enter the name of the book");
        String name = sc.next();
        System.out.println("Enter the author of the book");
        String author = sc.next();
        System.out.println("Enter the Book ID");
        int bookId = sc.nextInt();
        System.out.println("Enter the number of copies to be added");
        int noOfCopies = sc.nextInt();
        return new OtherBooks(name, author, noOfCopies, bookId, type, language);
    }

    private static Student getNewStudentDetails() {
        String firstName = getFirstName();
        String lastName = getLastName();
        int rollNo = getRollNo();
        MyList<String> contactNumbers = getContacts();

        return new Student(rollNo, firstName, lastName, contactNumbers);

    }

    /**
     * A helper method of getNewStudentDetails() method
     * use to input FirstName of the Student
     *
     * @return FirstName of the new Student
     */
    private static String getFirstName() {
        System.out.println("Please Enter the name of the Person");
        System.out.print("FirstName: ");
        return sc.next();

    }

    /**
     * A helper method of getNewStudentDetails() method
     * use to input LastName of the Student
     *
     * @return LastName of the new Student
     */

    private static String getLastName() {
        System.out.print("LastName: ");
        return sc.next();

    }

    /**
     * A helper method of getNewStudentDetails() method
     * use to input contactNumbers of the Student
     * Ensures that there must be AtLeast 1 contact for every individual Student
     *
     * @return a list Containing ContactsNumbers of the new Student
     */
    private static MyList<String> getContacts() {

        /*
        Declaration of a new list to store ContactNumbers of the new Contact
         */
        MyList<String> contactNumbers = new MyList<>();
        /*
        A String Variable to store an individual Contact of the new Contact
         */
        String contactNo;
        while (true) {
            System.out.print("ContactNumber: ");
            contactNo = sc.next();
             /*
             If entered number is valid add contactNo to the list
              */
            if (Pattern.matches("[0-9]+", contactNo)) {
                contactNumbers.add(contactNo);
                break;
            }
            /*
            if entered number is not valid i.e, contains characters except digits

             */
            else {
                System.out.println("Invalid PhoneNumber");
            }
        }
        while (true) {
            /*
            Asking again for a contactNumber if user  want to add
             */
            System.out.print("Do You Want to add a new ContactNumber? (y/n) :");
            String a = sc.next();
            a = a.toLowerCase();
            /*
            Checking if the entered input is a single character or not
            if not printing Invalid input message
             */
            char at = a.charAt(0);
            if (a.length() > 1) {
                System.out.println("Please Enter a Valid Input i.e., y for Yes or n for No");
                continue;
            }
            /*
            if entered input means yes allow to add a new contact and add that contact also to the list of ContactNumbers
             */

            if (at == 'y') {
                System.out.print("ContactNumber: ");
                contactNo = sc.next();
                /*
                checking a valid contact number
                 */
                if (Pattern.matches("[0-9]+", contactNo)) {

                    contactNumbers.add(contactNo);
                } else {
                    System.out.println("Invalid PhoneNumber");
                }
            }
            /*
            if the entered input means no end the loop and return the contactNumbers list
             */
            else if (at == 'n') {
                break;
            }
            /*
            If there is some invalid input other than 'y' or 'n' then print Invalid input message
             */
            else {
                System.out.println("Please Enter a Valid Input i.e., y for Yes or n for No");
            }
        }
        return contactNumbers;

    }

    /**
     * A helper method of getNewStudentDetails() method
     * use to input roll number of the Student
     *
     * @return roll number of the new Student
     */
    private static int getRollNo() {
        String rollNum;
        int rollNo;
        while (true) {
            System.out.print("Roll Number: ");
            rollNum = sc.next();
             /*
             If entered number is valid
              */
            if (Pattern.matches("[0-9]+", rollNum)) {
                rollNo = Integer.parseInt(rollNum);
                break;
            }
            /*
            if entered roll number is not valid i.e, contains characters except digits

             */
            else {
                System.out.println("Invalid RollNumber");
            }
        }
        return rollNo;
    }

    private static int getBookId() {
        String BookId;
        int BookID;
        while (true) {
            System.out.print("Book ID: ");
            BookId = sc.next();
             /*
             If entered ID is valid
              */
            if (Pattern.matches("[0-9]+", BookId)) {
                BookID = Integer.parseInt(BookId);
                break;
            }
            /*
            if entered ID is not valid i.e, contains characters except digits

             */
            else {
                System.out.println("Invalid BookID Try Again");
            }
        }
        return BookID;
    }

    @Override
    public int issueBook() {
        Student student = getAndMatchStudent();
        if (student == null) {
            System.out.println("Sorry that student is not found in the database kindly add the Student first");
            return 0;
        } else {
            System.out.println("Welcome, " + student.getFirstName());
        }
        Book book = getAndMatchBook();
        if (book == null) {
            System.out.println("Sorry, Book Not found");
            return 0;
        } else {
            System.out.println("You have chosen " + book.getName() + " press 1 to continue press 0 to exit");
            int res = takeOneDigitIntInput();
            if (res == 1) {
                if (checkAvailability(book)) {
                    student.getBooks().add(book);
                    issuedBooks++;
                    book.issuedCopies++;
                    book.issuedTo.add(student.getRollNo());
                    System.out.println("Book issued Successfully");
                } else {
                    System.out.println("Sorry The Book is currently Out of Stock ! come back later");
                }

            } else if (res == 0) {
                System.out.println("No Books Issued");
            } else {
                System.out.println("Invalid Input !");
            }
        }

        return 0;
    }

    @Override
    public void addStudent() {
        int i;
        String message;
        System.out.println("How Many Students you want to add ?");
        int student = sc.nextInt();
        for (i = 0; i < student; i++) {
            System.out.println("Enter " + (i + 1) + " Student Details:-");

            studentDatabase.add(getNewStudentDetails());
        }
        if (i >= 1) {
            message = i > 1 ? " Students Added SuccessFully" : " Student Added SuccessFully";
            System.out.println((i) + message);
        } else
            System.out.println("Exited... No new Students Added");


    }

    @Override
    public Book discardBook() {
        return null;
    }

    @Override
    public int addBook() {
        while (true) {
            try {
                int type = selectBookType();
                switch (type) {
                    case 1:
                        SubjectBook newBook = enterSubBookDetails();
                        stock.add(newBook);
                        totalBooks = totalBooks + newBook.getNoOfCopies();
                        break;
                    case 2:
                        OtherBooks newBook1 = enterOtherBookDetails();
                        stock.add(newBook1);
                        totalBooks = totalBooks + newBook1.getNoOfCopies();
                        break;
                    case 0:
                        break;

                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Not Valid Input");
            }
        }
        return 0;
    }

    @Override
    public void returnBook() {
    }

    private Student getAndMatchStudent() {
        int roll = getRollNo();
        for (int i = 0; i < this.studentDatabase.size; i++) {
            int roll1 = studentDatabase.getData(i).getRollNo();
            if (roll == roll1)
                return studentDatabase.getData(i);
        }
        return null;
    }

    private Book getAndMatchBook() {
        int bookId = getBookId();
        for (int i = 0; i < this.stock.size; i++) {
            int id = stock.getData(i).getBookId();
            if (id == bookId)
                return stock.getData(i);
        }
        return null;
    }

    private static boolean checkAvailability(Book book) {
        return book.getIssuedCopies() < book.getNoOfCopies();
    }

    private static boolean updateStudent(Student student, Book book) {
        student.setBooks(book);
        return true;
    }

}
