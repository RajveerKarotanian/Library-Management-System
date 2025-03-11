import java.util.ArrayList;
/*
 * Name: Rajveer Karotanian
 * 
 * Date: 3/11/25
 */
public class Account {
    // create private instance variables
    private String name;
    private double fees;
    private ArrayList<Book> borrowedBooks;

    // constructor for account given name
    public Account(String name) {
        this.name = name;
        fees = 0;
        borrowedBooks = new ArrayList<Book>();
    }

    // get name of user
    public String getName() {
        return name;
    }

    // set user's name
    public void setName(String name) {
        this.name = name;
    }

    // get the fees due by the user
    public double getFees() {
        return fees;
    }

    // attempt to, and add a book to the user's borrowed books
    public void borrowBook(Book book) {
        // check if book is borrowed, displaying a message if it is
        if (book.isBorrowed()) {
            System.out.println(book.getName() + " is already borrowed by " + book.getBorrower() + ".");
        }
        else {
            // add book to borrowed books
            borrowedBooks.add(book);
            book.borrow(name);
        }
    }

    // return the borrowed book
    public void returnBook(Book book) {
        // check if book borrowed, displaying a message if it isn't
        if (!book.isBorrowed()) {
            System.out.println(book.getName() + " is not borrowed.");
        }
        else {
            // remove book from borrowed books
            borrowedBooks.remove(book);
            book.returnBook();
        }
    }

    // update fees for any overdue books
    public void updateFees() {
        fees = 0;
        // go through each book in array list
        // learned how to use for-each loop from https://www.geeksforgeeks.org/for-each-loop-in-java/
        for (Book book : borrowedBooks) {
            if (book.isOverdue()) {
                // $2 fixed fee, + $0.25 per day overdue
                fees += (book.getDaysBorrowed() - 14) * 0.25 + 2;
            }
        }
    }

    // Override toString method, display name, borrowed books, and fees
    @Override
    public String toString() {
        String output = "Account:  " + name + "\nBorrowed Books:\n";
        // go through each book in array list
        for (Book book : borrowedBooks) {
            output += "\t" +  book + "\n";
        }
        output += "Fees:  $" + fees + "\n";
        return output;
    }
}