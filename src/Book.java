public class Book {

  String name;
  String forfattare;
  int year;
  String upplaga;
  boolean available;
   String bokinformation;
  Book(){
    available = true ;

  }
  public boolean loan (){
    if (available){
      available = false;
      return true;
    }
    return false;
  }
  public void returnBook(){
    available = true;
  }
  public String toString(){
       return name + " Available: " + available;
  }



}

