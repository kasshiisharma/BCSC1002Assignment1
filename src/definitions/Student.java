/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;
import java.util.Objects;
import java.util.Arrays;


public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private long studentUniversityRollNumber;
    private int NumberOfBookIssued;
    private Book[] bookIssuedByStudent;


    public Student(String studentFirstName, String studentMiddeName, String studentLastName,
                   long studentUniversityRollNumber, int NumberOfBookIssued) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.NumberOfBookIssued = NumberOfBookIssued;
        this.bookIssuedByStudent = bookIssuedByStudent;
    }

    public Student() { }

    public String getstudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleNameName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBookIssued() {
        return NumberOfBookIssued;
    }

    public void setNumberOfBookIssued(int NumberOfBookIssued) {
        this.NumberOfBookIssued = NumberOfBookIssued;
    }

    public Book[] getBookIssuedByStudent() {
        return bookIssuedByStudent;
    }

    public void setBookIssuedByStudent(Book[] bookIssuedByStudent) {
        this.bookIssuedByStudent = bookIssuedByStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ",studentMiddleName=" + studentMiddleName +
                ",studentLastName=" + studentLastName +
                ",studentUniversityRollNumber=" + studentUniversityRollNumber +
                ",NumberOfBookIssued=" +NumberOfBookIssued +
                ",bookIssuedByStudent=" + Arrays.toString(bookIssuedByStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentUniversityRollNumber == student.studentUniversityRollNumber &&
                NumberOfBookIssued == student.getNumberOfBookIssued() &&
                Objects.equals(studentFirstName, student.studentFirstName) &&
                Objects.equals(studentMiddleName, student.studentMiddleName) &&
                Objects.equals(studentLastName, student.studentLastName) &&
                Arrays.equals(bookIssuedByStudent, student.bookIssuedByStudent);
    }

    public void addBook(Book book){
        System.out.println(book.getBookName()+" book is issued. ");
    }
    public void returnPreviouslyIssuedBook(String bookName){
        System.out.println(bookName+" is returned");
    }
    public void showAllBooks(){
        bookIssuedByStudent = new Book[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Book"+(i+1));
        }
    }

}






