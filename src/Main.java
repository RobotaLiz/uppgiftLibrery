import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library umeaBibliotek = new Library();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("1 Add a book to library");
            System.out.println("2 Search for a book by name");
            System.out.println("3 List all available books");
            System.out.println("4 Return a book");
            System.out.println("5 Quit");

            int menyVal = scan.nextInt();
            scan.nextLine(); //Buggfix
            if (menyVal == 1) {
                umeaBibliotek.AddBook(scan);
            }
            if (menyVal == 2) {
                umeaBibliotek.searchForABookByName(scan);
            }
            if(menyVal ==3){
                umeaBibliotek.listOfBooks();
            }
            if(menyVal == 4){
               umeaBibliotek.returnAbook(scan);
            }
            if(menyVal == 5){
                System.out.println("You are Welcome back!");
                break;
            }
        }
    }






    }
