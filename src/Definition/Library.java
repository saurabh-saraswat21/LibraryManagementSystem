package Definition;

import Adt.LibraryAdt;

public class Library implements LibraryAdt {
    private int totalBooks;
    private int issuedBooks;
    private MyList<Book> stock;

    @Override
    public int issueBook(Book book, Student student) {
        return 0;
    }

    @Override
    public void returnBook(Student student, Book book) {
    }

    @Override
    public int addBook() {


        return 0;
    }

    @Override
    public Book discardBook() {
        return null;
    }
}
