package Adt;

import Definition.Book;
import Definition.Student;

public interface LibraryAdt {
     int issueBook(Book book, Student student);

     void returnBook(Student student, Book book);

     int addBook();

     Book discardBook();
}
