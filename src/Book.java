public class Book {
         private String NameBook;
         private int yearOfPublication;
         private Author Author;

         public Book(String NameBook, int yearOfPublication, Author Author) {
            this.NameBook = NameBook;
            this.yearOfPublication = yearOfPublication;
            this.Author = new Author("Стивен", "Кинг");
         }
         public String getNameBook() {return NameBook;}
         public int getYearOfPublication() {return yearOfPublication;}
         public void setYearOfPublication(int yearOfPublication) {
             this.yearOfPublication = yearOfPublication;
         }

}
