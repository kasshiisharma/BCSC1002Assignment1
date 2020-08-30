/*  Created by IntelliJ IDEA.
 *  User: kashish sharma
 *  Date: 30-08-20
 *  Time: 10:17pm
 *  File Name : Library.java
 * */
package definitions;
import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Library(Book[] currentlyAvailableBooks){
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }
    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
       this.currentlyAvailableBooks = currentlyAvailableBooks;
     }

    @Override
    public String toString() {
        return "Library{" +
                "currentlyAvailableBooks=" + Arrays.toString(currentlyAvailableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Library library = (Library) o;
        return Arrays.equals(currentlyAvailableBooks, library.currentlyAvailableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(currentlyAvailableBooks);
    }
}
