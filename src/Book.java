public class Book {
         private String NameBook;
         private int yearOfPublication;

         public Book(String NameBook, int yearOfPublication) {
            this.NameBook = NameBook;
            this.yearOfPublication = yearOfPublication;
        }
         public String getNameBook() {
            return NameBook;
         }
          public int getYearOfPublication() {
              return yearOfPublication;
          }
           public void setYearOfPublication(int yearOfPublication) {
             this.yearOfPublication = yearOfPublication;
         }



}
