package Adt;

import Definition.Book;

public interface LibraryAdt {
     int issueBook();

     void returnBook();

     int addBook();

     Book discardBook();
}
