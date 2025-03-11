/*
 * Name: Rajveer Karotanian
 * 
 * Date: 3/11/25
 */
public class Book implements Comparable<Book> {
    // create private instance variables, and initialize some of them
    private String name;
    private String author;
    private String borrower;
    private boolean isBorrowed = false;
    private int daysBorrowed = 0;

    // Constructor for book given name and author
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Overloaded constructor for book given name, author, borrower, and days borrowed
    public Book(String name, String author, Account borrower, int daysBorrowed) {
        this.name = name;
        this.author = author;
        this.daysBorrowed = daysBorrowed;
        borrower.borrowBook(this);
    }

    // get name of book
    public String getName() {
        return name;
    }

    // get author of book
    public String getAuthor() {
        return author;
    }

    // get how many days the book has been borrowed for
    public int getDaysBorrowed() {
        return daysBorrowed;
    }

    // set how many days the book has been borrowed for
    public void setDaysBorrowed(int daysBorrowed) {
        this.daysBorrowed = daysBorrowed;
    }

    // set the name of the book
    public void setName(String name) {
        this.name = name;
    }

    // set the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }

    // check the availibility of the book by seeing if it is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // borrow book and set set the borrower to the input name
    public void borrow(String borrower) {
        isBorrowed = true;
        this.borrower = borrower;
    }

    // get the book's borrower
    public String getBorrower() {
        return borrower;
    }

    // returns the book from the borrower, making it availible and removing the borrower
    public void returnBook() {
        isBorrowed = false;
        borrower = "";
    }

    // check if book is overdue (two weeks)
    public boolean isOverdue() {
        return daysBorrowed > 14;
    }

    // Override toString method
    @Override
    public String toString() {
        // display based on availibility, where if it is borrowed it will display the borrower and days borrowed
        if (isBorrowed) {
            return "Book:  " + name + " by " + author + " (Borrowed by " + borrower + ", " + daysBorrowed + " days)";
        }
        else {
            return "Book:  " + name + " by " + author + " (Availible)";
        }
    }

    // Override equals method
    @Override
    public boolean equals(Object book) {
        // check if object is a book
        if (book instanceof Book) {
            // check if name and author are equal
            return name.equals(((Book) book).getName()) && author.equals(((Book) book).getAuthor());
        }
        else {
            return false;
        }
    }

    // Override compareTo method
    @Override
    public int compareTo(Book book) {
        // compare by author, if author the same, compare by name
        if (author.compareTo(book.getAuthor()) == 0) {
            return name.compareTo(book.getName());
        }
        else {
            return author.compareTo(book.getAuthor());
        }
    }
}