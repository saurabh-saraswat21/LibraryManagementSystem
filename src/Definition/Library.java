package Definition;

import Adt.LibraryAdt;

import java.util.Scanner;

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

    private static char selectBookType() {
        Scanner sc = new Scanner(System.in);
        String response;
        char res;
        while (true) {
            System.out.println("Enter the type of Book");
            System.out.println("1. Academic");
            System.out.println("2. Other");
            System.out.println("0.Exit");
            response = sc.next();
            res = response.charAt(0);
            if (response.length() == 1 && res == '1' || res == '2' || res == '0') {
                break;
            } else {
                System.out.println("Enter a valid input");
            }
        }
        sc.close();
        System.out.println(res);

        return res;

    }

    @Override
    public int addBook() {
        char type = selectBookType();
        switch (type) {
            case '1':
        }
        return 0;
    }

    @Override
    public Book discardBook() {
        return null;
    }
}
