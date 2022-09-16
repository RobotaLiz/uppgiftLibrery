import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> AllBooks = new ArrayList<Book>();
    public void AddBook(Scanner scannis){
        System.out.println("Add a book, enter the books name");

        String bookName = scannis.nextLine();
        Book book = new Book();
        book.name = bookName;
        AllBooks.add(book);
        System.out.println("Added " + book.name + " to the library");
    }
    public Book searchforbook(Scanner scan){
        String search = scan.nextLine();
        Book foundBook = null;
        for(int i = 0;i < AllBooks.size();i++){
            Book currentBook = AllBooks.get(i);
            if(currentBook.name.contains(search))       {
                foundBook = currentBook;
            }
        }
        return foundBook;
    }
    public void searchForABookByName(Scanner scan){
        System.out.println("search for a book by name");
        Book foundBok = searchforbook(scan);
        System.out.println("Found this book: " + foundBok.toString());
        System.out.println("Would you like to loan it? (y/n)");
        char yesOrNo = scan.nextLine().charAt(0);
        if(yesOrNo == 'y'){
            Boolean loaned = foundBok.loan();
            System.out.println("Book loaned: "+loaned);
        }
    }
    public void listOfBooks(){

        for(int i = 0; i < AllBooks.size();i++) {
            System.out.println(AllBooks.get(i).toString());
        }
    }
    public void returnAbook(Scanner bookRturn) {
        System.out.println("Which book would you like to return?");
        Book foundbook = searchforbook(bookRturn);
        foundbook.returnBook();
        System.out.println("Thank you for returning the book, I hope it gave you lots of joy!");


    }

}
