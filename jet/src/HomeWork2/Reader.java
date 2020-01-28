package HomeWork2;

public class Reader {
    String fullName;
    int id;
    String faculty;
    String bd;
    String phone;
// Методы
    public void takeBook(String fullName){
        System.out.println(fullName +" взял книгу");
    }

    public void returnBook(String fullName) {
        System.out.println(fullName + " вернул книгу");
    }

    public void takeBook(String fullName, int n){
        System.out.println(fullName +" взял книг"+n);
    }

    public void takeBook(String fullName, String...books){
        System.out.print(fullName +" взял книги - ");
        for (int i=0;i<books.length;i++) {
        System.out.print(books[i]); }
    }

     public void takeBook(String fullName, Book...bb){
        System.out.print(fullName +" взял книги - ");
        for (int i=0;i<bb.length;i++) {
            System.out.print(bb[i].authorBook+ ". " + bb[i].nameBook+"; "); }
    }

}

class Book {
     String nameBook;
     String authorBook;
}
class TestReader{

       public static void main(String[] args) {
           Reader r1 = new Reader();
           r1.takeBook("Петров В.В.","Приключения, Словарь, Энциклопедия");

           Book book1 = new Book();
           book1.authorBook="Джанни Родари";
           book1.nameBook = "Приключения Буратино";

           Book book2 = new Book();
           book2.authorBook = "Лев Толстой";
           book2.nameBook ="Война и мир";


           System.out.println("");

           r1.takeBook("Иванов В.В", book1, book2);



    }
}