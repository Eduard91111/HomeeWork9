public class Main {
    public static void main(String[] args) {
        book2 ();
    }
    public static void book1 () {
        Book book = new Book("Мобильник", 2009, new Author("Стивен", "Кинг"));
        Author author = new Author("Стивен", "Кинг");
        System.out.println("Название книги: " + book.getNameBook() + ";");
        System.out.println("Год издательства: " + book.getYearOfPublication () + ";");
        System.out.println("Имя автора: " + author.getAuthorsName() + ";");
        System.out.println("Фамилия автора: " + author.getLastNameOfTheAuthor() + ";");
    }
    public static void book2 () {
        Book book = new Book ("Преступление и наказание", 2007,new Author("Федор", "Достоевский") );
        Author author = new Author("Федор", "Достоевский");
        System.out.println("Название книги: " + book.getNameBook() + ";");
        System.out.println("Год издательства: " + book.getYearOfPublication () + ";");
        book.setYearOfPublication(2010);
        System.out.println("Новый год издательства: " + book.getYearOfPublication () + ";");
        System.out.println("Имя автора: " + author.getAuthorsName() + ";");
        System.out.println("Фамилия автора: " + author.getLastNameOfTheAuthor() + ";");
    }
}