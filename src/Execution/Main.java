package Execution;

import Definition.Library;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook();
        lib.addBook();
        System.out.println(lib.stock);


    }
}
