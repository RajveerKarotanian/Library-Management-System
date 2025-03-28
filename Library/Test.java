/*
 * Name: Rajveer Karotanian
 * 
 * Date: 3/11/25
 */
public class Test {
    /*
     * Problem Description: Create a library management system, where you can add books and accounts to the library. You must create a book 
     *                      class, an audio book class, an account class, and a library class. 
     * 
     *                          A book must be an object that has a name, author, borrower, and days borrowed. The book should be able to be 
     *                          created with a constructer taking in a name and author, or an overloaded constructor which also asks for the 
     *                          account borrowing it and days borrowed. This class should implement methods to borrow and return the book. 
     *                          This class should also implement Comparable for sorting, and have it's own toString and equals method. 
     * 
     *                          An audio book must be an object, which inherits from the book class, essentially having the same functionality 
     *                          and attributes as a book, but with the addition of a narrator. This class should also have it's own toString 
     *                          and equals method to account for the additional narrator.
     * 
     *                          An account must be an object that has a name, fees, and an ArrayList of borrowed books. This class should have 
     *                          methods for borrowing and returning books, and updating fees if a book is overdue. This class should also have
     *                          it's own toString method.
     * 
     *                          A library must be an object that has ArrayLists of books and accounts. This class should implement methods to 
     *                          add and remove books and accounts, and should have a method to sort the books. This class should also have methods
     *                          to display all the books and accounts in the library.
     */
    public static void main(String[] args) {
        // create an instance of Library
        Library library = new Library();

        // create books, and then add them to the library
        Book book1 = new Book("Diary of a Wimpy Kid", "Jeff Kinney");
        Book book2 = new Book("Harry Potter", "J.K. Rowling");
        Book book3 = new Book("Test Same Author", "J.K. Rowling");
        AudioBook book4 = new AudioBook("The Hunger Games", "Suzanne Collins", "Carol");
        AudioBook book5 = new AudioBook("The Maze Runner", "James Dashner", "Mark");
    
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Show all books in library
        System.out.println("Show starting library:");
        library.displayBooks();

        // test sorting method
        library.sortBooks();
        System.out.println("\nTest sorting books (also tests compareTo):");
        library.displayBooks();

        // create accounts, and then add them to the library
        Account account1 = new Account("Jake");
        Account account2 = new Account("Sarah");
        Account account3 = new Account("Billy");


        // add accounts to library
        library.addAccount(account1);
        library.addAccount(account2);
        library.addAccount(account3);

        // display all accounts in library
        System.out.println("\nShow starting accounts:");
        library.displayAccounts();

        // create a book using overloaded constructor (tests for super constructor too)
        AudioBook book6 = new AudioBook("The Giver", "Lois Lowry", "Ron", account1, 5);

        // borrow books
        account1.borrowBook(book1);
        account2.borrowBook(book2);
        account2.borrowBook(book3);
        account3.borrowBook(book4);
        account3.borrowBook(book5);

        // display users again with new books
        System.out.println("\nDisplay accounts after borrowing books:");
        library.displayAccounts();

        // attempt borrowing a book that is already borrowed
        System.out.println("\nTest borrowing an already borrowed book:");
        account2.borrowBook(book1);

        // test returning a book
        System.out.println("\nTest returning a book:");
        System.out.println(book1);
        System.out.println(book6);
        account1.returnBook(book1);
        account1.returnBook(book6);
        System.out.println(book1);
        System.out.println(book6);
        

        // test removing book and accounts
        library.removeBook(book1);
        library.removeBook(book6);
        library.removeAccount(account1);
        System.out.println("\nTest removing books (Diary of a Wimpy Kid):");
        library.displayBooks();
        System.out.println("\nTest removing accounts (Jake):");
        library.displayAccounts();

        // test overdue fees
        book2.setDaysBorrowed(14);
        book3.setDaysBorrowed(20);
        System.out.println("\nTest overdue fees:");
        account2.updateFees();
        System.out.println(account2);

        // test equals method
        System.out.println("\nTest equals method:");
        Book book7 = new Book("TestBook1", "TestAuthor1");
        Book book8 = new Book("TestBook1", "TestAuthor1");
        Book book9 = new Book("TestBook2", "TestAuthor2");
        AudioBook book10 = new AudioBook("TestAudioBook1", "TestAuthor1", "TestNarrator1");
        AudioBook book11 = new AudioBook("TestAudioBook1", "TestAuthor1", "TestNarrator1");
        AudioBook book12 = new AudioBook("TestAudioBook2", "TestAuthor2", "TestNarrator2");
        AudioBook book13 = new AudioBook("TestAudioBook2", "TestAuthor2", "TestNarrator3");
        System.out.println("\tTesting Books:");
        System.out.println("\t\t1. " + book7);
        System.out.println("\t\t2. " + book8);
        System.out.println("\t\t3. " + book9);
        System.out.println("\t" + "Test if books equal:");
        System.out.println("\t\tBook 1 equals Book 2: " + book7.equals(book8));
        System.out.println("\t\tBook 1 equals Book 3: " + book7.equals(book9));
        System.out.println("\n\tTesting AudioBooks:");
        System.out.println("\t\t1. " + book10);
        System.out.println("\t\t2. " + book11);
        System.out.println("\t\t3. " + book12);
        System.out.println("\t\t4. " + book13);
        System.out.println("\t" + "Test if audio books equal:");
        System.out.println("\t\tAudioBook 1 equals AudioBook 2: " + book10.equals(book11));
        System.out.println("\t\tAudioBook 1 equals AudioBook 3: " + book10.equals(book12));
        System.out.println("\t\tAudioBook 3 equals AudioBook 4: " + book12.equals(book13));
    }
}