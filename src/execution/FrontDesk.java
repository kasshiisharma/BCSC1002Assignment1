/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-\"Welcome To The FrontDesk\"-=-=-=-=-=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issue book for me.\n" +
                "3. Show me all my issues book.\n" +
                "4. Exit.\n");
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter Book name: ");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter Author name: ");
                    String bookAuthorName = scanner.nextLine();
                    System.out.println("Enter ISBN number: ");
                    String bookIsbnNumber = scanner.nextLine();
                    Book book = new Book(bookName, bookAuthorName, bookIsbnNumber);
                    student.addBook(book);
                    break;
                case 2:
                    System.out.println("Enter name of book which you want to return");
                    String returnBookName = scanner.nextLine();
                    student.returnPreviouslyIssuedBook(returnBookName);
                    break;
                case 3:
                    student.showAllBooks();
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }

        } while(choice!= 4);

    }
}
