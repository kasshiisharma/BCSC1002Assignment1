/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;
public class Book {

    // components of definition class:
    //1. private feild

    private String bookName;
    private String bookAuthorName;
    private String bookIsbnNumber;
    //2.the constructor method: used to initialize the attribues.
    //a. non-parameterized constructor : the constructor has no parameter.
    public Book() {
        this.bookName = null;
        this.bookAuthorName = null;
        this.bookIsbnNumber = null;
    }
    //b. parameterized constructor : they have some parameter.
    public Book(String bookName , String bookAuthorName , String bookIsbnNumber){
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookIsbnNumber = bookIsbnNumber;
    }

    // a getter and setter method.
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getbookAuthorName(){
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName){
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookIsbnNumber(){
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookISBNnumber){
        this.bookIsbnNumber = bookIsbnNumber;
    }

    // the toString() method : used to convert an object to String.
    public String toString() {
        return "Name Of Book:" + " " + this.bookName + "\n"
                + "Name Of Author Of Book:" + " " + this.bookAuthorName + "\n"
                + "ISBN Number Of Book:" + " " + this.bookIsbnNumber + ".";
    }
    //the equals() and hashCode() method.
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() !=o.getClass()){
            return false;
    }
    Book book = (Book) o;
    return Objects.equals(getBookName(),book.getBookName()) &&
            Objects.equals(getbookAuthorName(), book.getbookAuthorName()) &&
            Objects.equals(getBookIsbnNumber(), book.getBookIsbnNumber());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getBookName(), getbookAuthorName() , getBookIsbnNumber());
    }
}