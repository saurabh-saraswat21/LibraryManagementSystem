package Execution;

import Definition.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook();
        //lib.addBook();
        //lib.addStudent();
        //lib.issueBook();
        lib.discardBook();
    }

}
