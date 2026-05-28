package hi.vanshu;
import java.util.Scanner;
import java.util.ArrayList;

/*
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */
class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to, String Issueauthor){
        System.out.println("The book has been issued from the library to " + issued_to+"Author:"+ Issueauthor);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}
public class V_113_EX07 {
    public static void main(String[] args) {
        // Exercise 7 Solution
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bk = new ArrayList<>();
        MyLibrary l = new MyLibrary(bk);

        while (true) {
            System.out.println("1. Add book\n2. Issue book\n3. Return book\n4. Show books\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    l.addBook(new Book(name, author));
                    break;
                case 2:
                    System.out.print("Enter book name to issue: ");
                    String issueName = sc.nextLine();
                    System.out.print("Enter name of person: ");
                    String issuedTo = sc.nextLine();
                    String Issueauthor = sc.nextLine();
                    Book issueBook = new Book(issueName, Issueauthor);
                    l.issueBook(issueBook, issuedTo, Issueauthor);
                    break;
                case 3:
                    System.out.print("Enter book name to return: ");
                    String returnName = sc.nextLine();
                    String retauthor = sc.nextLine();
                    l.returnBook(new Book(returnName, retauthor));
                    break;
                case 4:
                    System.out.println("Books in the library: " + l.books);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }


    }
}
