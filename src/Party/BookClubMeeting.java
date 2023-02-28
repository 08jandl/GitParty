package Party;

public class BookClubMeeting {
    public static void main(String[] args) {
        //Tell us why you chose that party
        System.out.println("I chose this party/get-together because I like reading books.");

        //Declare variables with meaningful names and appropriate data types
        String bookTitle;
        String author;
        boolean enjoyableRead;
        boolean useful;
        boolean beautifullyWritten;
        boolean goodBook;

        //Initialize your variables
        bookTitle = "Clean Code";
        author = "Uncle Bob";
        enjoyableRead = true;
        useful = true;
        beautifullyWritten = false;

        //Create at least 1 logical equation using your variables
        goodBook = enjoyableRead && (useful || beautifullyWritten);

        //Create and (re)-use at least 1 method
        printBookResults(bookTitle, author, goodBook);

        //Reassigning variables to use a second time
        bookTitle = "Pew";
        author = "Catherine Lacey";
        enjoyableRead = true;
        useful = false;
        beautifullyWritten = true;
        goodBook = enjoyableRead && (useful || beautifullyWritten);

        //Create and (re)-use at least 1 method
        printBookResults(bookTitle, author, goodBook);

        //Reassigning variables to use a second time
        bookTitle = "Little Women";
        author = "Louisa May Alcott";
        enjoyableRead = false;
        useful = false;
        beautifullyWritten = true;
        goodBook = enjoyableRead && (useful || beautifullyWritten);

        //Create and (re)-use at least 1 method
        printBookResults(bookTitle, author, goodBook);
    }

    //Create and (re)-use at least 1 method
    private static void printBookResults(String bookTitle, String author, boolean goodBook) {
        if (goodBook) {
            System.out.println("I like " + bookTitle + " by " + author + ".");
        } else {
            System.out.println("I didn't like " + bookTitle + " by " + author + ".");
        }
    }
}
