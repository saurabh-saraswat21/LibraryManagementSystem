package Execution;

import Definition.MyLibrary.Library;

import java.util.Scanner;

public class Main {
    public static Integer getInteger(Scanner sc) {
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

    public static void main(String[] args) {

        Library lib = new Library();
        boolean exit = false;
        while (!exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome in the Library");
            System.out.println("1.Issue Book");
            System.out.println("2.Add a new Book in the Library");
            System.out.println("3.Add a new Student Entry");
            System.out.println("4.Discard a copy of a book");
            System.out.println("5.Return Book");
            System.out.println("6.Exit");
            int choice = getInteger(sc);
            switch (choice) {
                case 1:
                    lib.issueBook();
                    break;
                case 2:
                    lib.addBook();
                    break;
                case 3:
                    lib.addStudent();
                    break;
                case 4:
                    lib.discardBook();
                    break;
                case 5:
                    lib.returnBook();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Not Valid Input");
                    sc.close();
                    break;
            }
        }
    }

}
