package Adt;

import Definition.Book.Book;

public interface LibraryAdt {
     int issueBook();

     void returnBook();

     int addBook();

     Book discardBook();

     void addStudent();
}
