/*
 * Name: Rajveer Karotanian
 * 
 * Date: 3/11/25
 */
public class AudioBook extends Book {
    // create private instance variable
    private String narrator;

    // constructor for audiobook given name, author, and narrator, calls super constructor from book
    public AudioBook(String name, String author, String narrator) {
        super(name, author);
        this.narrator = narrator;
    }

    // overloaded constructor for audiobook given name, author, narrator, borrower, and days borrowed, calls overloaded super constructor from book
    public AudioBook(String name, String author, String narrator, Account borrower, int daysBorrowed) {
        super(name, author, borrower, daysBorrowed);
        this.narrator = narrator;
    }

    // get the audiobook's narrator
    public String getNarrator() {
        return narrator;
    }

    // set the audiobook's narrator
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    // Override toString method
    @Override
    public String toString() {
        // display based on availibility, where if it is borrowed it will display the borrower and days borrowed
        if (isBorrowed()) {
            return "AudioBook:  " + getName() + " by " + getAuthor() + ", Narrated by " + narrator + " (Borrowed by " + getBorrower() + ", " + getDaysBorrowed() + " days)";
        }
        else {
            return "AudioBook:  " + getName() + " by " + getAuthor() + ", Narrated by " + narrator + " (Availible)";
        }
    }

    // Override equals method
    @Override
    public boolean equals(Object book) {
        // check if object is a book
        if (book instanceof AudioBook) {
            // calls super equals, and also checks if narrator is the same
            return super.equals(book) && narrator.equals(((AudioBook) book).getNarrator());
        }
        else {
            return false;
        }
    }
}