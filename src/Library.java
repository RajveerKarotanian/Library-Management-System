import java.util.ArrayList;
/*
 * Name: Rajveer Karotanian
 * 
 * Date: 3/11/25
 */
public class Library {
    // create private instance variables
    private ArrayList<Book> books;
    private ArrayList<Account> accounts;

    // constructor for library
    public Library() {
        books = new ArrayList<Book>();
        accounts = new ArrayList<Account>();
    }

    // add a book to the library's list of books
    public void addBook(Book book) {
        books.add(book);
    }

    // remove a book from the library's list of books
    public void removeBook(Book book) {
        books.remove(book);
    }

    // add an account to the library's list of accounts
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // remove account from library's list of accounts
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // sort books, where the overloaded comparator is used
    public void sortBooks() {
        books.sort(null);
    }

    // display all books in library
    public void displayBooks() {
        // go through all books in array list
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // display all accounts in library
    public void displayAccounts() {
        // go through all accounts in array list
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
